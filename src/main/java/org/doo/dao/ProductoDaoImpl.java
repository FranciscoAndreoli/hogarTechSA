package org.doo.dao;

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
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<ProductoDto> productoDtoList = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "select id_producto, nombre, precio, color, marca, modelo, stock "
                    + "from producto order by nombre";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);

            ProductoDto productoDto;

            while (rs.next()) {
                productoDto = new ProductoDto.Builder()
                        .setIdProducto(rs.getInt("id_producto"))
                        .setNombre(rs.getString("nombre"))
                        .setPrecio(rs.getDouble("precio"))
                        .setColor(rs.getString("color"))
                        .setMarca(rs.getString("marca"))
                        .setModelo(rs.getString("modelo"))
                        .setStock(rs.getInt("stock")).build();
                productoDtoList.add(productoDto);
                if (productoDtoList.size() == 0) {
                    productoDtoList = null;
                }
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        finally {
            try {
                rs.close();
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }

        return productoDtoList;
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
            String sql = "insert into producto (nombre, precio, color, marca, modelo, stock) "
                    + "values(?,?,?,?,?,?)";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, entidad.getNombre());
            sentencia.setDouble(2, entidad.getPrecio());
            sentencia.setString(3, entidad.getColor());
            sentencia.setString(4, entidad.getMarca());
            sentencia.setString(5, entidad.getModelo());
            sentencia.setInt(6, entidad.getStock());

            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    @Override
    public boolean modificar(ProductoDto entidad) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "update producto set nombre = ?, precio = ?, color = ?, marca = ?, modelo = ?, stock = ? "
                    + "where id_producto = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, entidad.getNombre());
            sentencia.setDouble(2, entidad.getPrecio());
            sentencia.setString(3, entidad.getColor());
            sentencia.setString(4, entidad.getMarca());
            sentencia.setString(5, entidad.getModelo());
            sentencia.setInt(6, entidad.getStock());
            sentencia.setInt(7, entidad.getIdProducto());

            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    @Override
    public boolean borrar(int id) {

        Connection con = null;
        PreparedStatement sentencia = null;
        System.out.println("Producto borrado");

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM producto WHERE id_producto = ?";
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

    @Override
    public boolean personaExists(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
