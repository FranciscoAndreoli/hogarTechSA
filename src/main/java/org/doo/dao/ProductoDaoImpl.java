package org.doo.dao;

import org.doo.dto.ProductoDto.ProductoBuilder;
import org.doo.dto.ProductoDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl implements ProductoDao<ProductoDto>{


    @Override
    public ProductoDto buscar(ProductoDto entidad) {
        return null;
    }

    @Override
    public ProductoDto buscar(int id) {
        return null;
    }

    @Override
    public List<ProductoDto> listarPorCriterio(ProductoDto entidad) {
        return null;
    }

@Override
public List<ProductoDto> listarTodos() {
    List<ProductoDto> productos = new ArrayList<>();
    String sql = "SELECT ID, Nombre, Precio, Stock, Marca, Modelo, Color, Dimension, Origen, Peso, Capacidad, Eficiencia, Descripcion, Garantia FROM Producto";

    try (Connection con = ConexionSql.getInstancia().getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                ProductoDto producto = new ProductoDto.ProductoBuilder(
                        rs.getInt("ID"),
                        rs.getString("Nombre"),
                        rs.getFloat("Precio"),
                        rs.getInt("Stock"))
                        .marca(rs.getString("Marca"))
                        .modelo(rs.getString("Modelo"))
                        .color(rs.getString("Color"))
                        .dimension(rs.getString("Dimension"))
                        .origen(rs.getString("Origen"))
                        .peso(rs.getString("Peso"))
                        .capacidad(rs.getString("Capacidad"))
                        .eficiencia(rs.getString("Eficiencia"))
                        .descripcion(rs.getString("Descripcion"))
                        .garantia(rs.getInt("Garantia"))
                        .build();
                
                productos.add(producto);
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al listar todos los productos: " + e.getMessage());
    }
    return productos;
}
    public boolean chequearDuplicado(ProductoDto productoDto){
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT Nombre, Modelo, Marca FROM Producto WHERE Nombre = ? AND Modelo = ? AND Marca = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, productoDto.getNombre());
            sentencia.setString(2, productoDto.getModelo());
            sentencia.setString(3, productoDto.getMarca());
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
    public boolean insertar(ProductoDto entidad) {
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
    public boolean modificar(ProductoDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
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
