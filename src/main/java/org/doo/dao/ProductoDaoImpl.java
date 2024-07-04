package org.doo.dao;

import org.doo.dto.DetallePedidoDto;
import org.doo.model.Producto.ProductoBuilder;
import org.doo.model.Producto;
import org.doo.model.IDetallePedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl implements ProductoDao<Producto>{


    @Override
    public Producto buscar(Producto entidad) {
        return null;
    }

    @Override
    public Producto buscar(int id) {
        return null;
    }

    @Override
    public List<Producto> listarPorCriterio(Producto entidad) {
        return null;
    }

@Override
public List<Producto> listarTodos() {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT ID, Nombre, Precio, Stock, Marca, Modelo, Color, Dimension, Origen, Peso, Capacidad, Eficiencia, Descripcion, Garantia FROM Producto";

    try (Connection con = ConexionSql.getInstancia().getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto.ProductoBuilder(
                        rs.getInt("ID"),
                        rs.getString("Nombre"),
                        rs.getFloat("Precio"),
                        rs.getInt("Stock"))
                        .buildMarca(rs.getString("Marca"))
                        .buildModelo(rs.getString("Modelo"))
                        .buildColor(rs.getString("Color"))
                        .buildDimension(rs.getString("Dimension"))
                        .buildOrigen(rs.getString("Origen"))
                        .buildPeso(rs.getString("Peso"))
                        .buildCapacidad(rs.getString("Capacidad"))
                        .buildEficiencia(rs.getString("Eficiencia"))
                        .buildDescripcion(rs.getString("Descripcion"))
                        .buildGarantia(rs.getInt("Garantia"))
                        .build();
                
                productos.add(producto);
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al listar todos los productos: " + e.getMessage());
    }
    return productos;
}
    @Override
    public List<Producto> listarPorNombre(String nombre) {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT ID, Nombre, Precio, Stock, Marca, Modelo, Color, Dimension, Origen, Peso, Capacidad, Eficiencia, Descripcion, Garantia FROM Producto WHERE LOWER(Nombre) LIKE ?";

    try (Connection con = ConexionSql.getInstancia().getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, "%" + nombre.toLowerCase() + "%");

        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto.ProductoBuilder(
                        rs.getInt("ID"),
                        rs.getString("Nombre"),
                        rs.getFloat("Precio"),
                        rs.getInt("Stock"))
                        .buildMarca(rs.getString("Marca"))
                        .buildModelo(rs.getString("Modelo"))
                        .buildColor(rs.getString("Color"))
                        .buildDimension(rs.getString("Dimension"))
                        .buildOrigen(rs.getString("Origen"))
                        .buildPeso(rs.getString("Peso"))
                        .buildCapacidad(rs.getString("Capacidad"))
                        .buildEficiencia(rs.getString("Eficiencia"))
                        .buildDescripcion(rs.getString("Descripcion"))
                        .buildGarantia(rs.getInt("Garantia"))
                        .build();

                productos.add(producto);
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al buscar productos por nombre: " + e.getMessage());
    }
    return productos;
}
    public boolean chequearDuplicado(Producto Producto){
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT Nombre, Modelo, Marca FROM Producto WHERE Nombre = ? AND Modelo = ? AND Marca = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, Producto.getNombre());
            sentencia.setString(2, Producto.getModelo());
            sentencia.setString(3, Producto.getMarca());
            rs = sentencia.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            System.err.println("Error al comparar Productos: " + e.getMessage());
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException e) {
                System.err.println("Error al comparar Productos: " + e.getMessage());
            }
        }
    }
    
    @Override
    public int mayorId() {
        return 0;
    }


    @Override
    public boolean insertar(Producto entidad) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO Producto (Nombre, Precio, Stock, Marca, Modelo, Color, Dimension, Origen, Peso, Capacidad, Eficiencia, Descripcion, Garantia)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, entidad.getNombre());
            sentencia.setDouble(2, entidad.getPrecio());
            sentencia.setInt(3, entidad.getStock());
            sentencia.setString(4, entidad.getMarca());
            sentencia.setString(5, entidad.getModelo());
            sentencia.setString(6, entidad.getColor());
            sentencia.setString(7, entidad.getDimension());
            sentencia.setString(8, entidad.getOrigen());
            sentencia.setString(9, entidad.getPeso());
            sentencia.setString(10, entidad.getCapacidad());
            sentencia.setString(11, entidad.getEficiencia());
            sentencia.setString(12, entidad.getDescripcion());
            sentencia.setInt(13, entidad.getGarantia());
            
            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException e) {
                System.err.println("Error al insertar un producto: " + e.getMessage());
            }
        }
    }


    @Override
    public boolean modificar(Producto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean editarPrecio(int idProducto, float nuevoPrecio){
        Connection con = null;
        PreparedStatement sentencia = null;
        boolean resultado = false;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE Producto SET Precio = ? WHERE ID = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setFloat(1, nuevoPrecio);
            sentencia.setInt(2, idProducto);

            int affectedRows = sentencia.executeUpdate();
            resultado = (affectedRows > 0);
        } catch (SQLException e) {
            System.err.println("Error al actualizar el precio del producto: " + e.getMessage());
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

    return resultado;
    }

    @Override
    public boolean editarStockProducto(List<DetallePedidoDto> detallePedidoList) {
        Connection con = null;
        PreparedStatement sentencia = null;
        boolean resultado = true;

        try {
            con = ConexionSql.getInstancia().getConnection();
            con.setAutoCommit(false);

            String sql = "UPDATE Producto SET Stock = Stock - ? WHERE ID = ?";
            sentencia = con.prepareStatement(sql);


            for (IDetallePedido detalle : detallePedidoList) {
                sentencia.setInt(1, detalle.getCantidad());
                sentencia.setInt(2, detalle.getidProducto());
                sentencia.addBatch();
            }

            int[] actualizaciones = sentencia.executeBatch();
            con.commit();


            for (int update : actualizaciones) {
                if (update != 1) {
                    resultado = false;
                    break;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar el stock de los productos: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                System.err.println("Error al deshacer los cambios: " + ex.getMessage());
            }
            resultado = false;
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar los recursos: " + ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public boolean borrar(int id) {

        Connection con = null;
        PreparedStatement sentencia = null;
        System.out.println("Producto borrado");

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM producto WHERE ID = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            int resultado = sentencia.executeUpdate();
            return (resultado > 0);

        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            }
            catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

}
