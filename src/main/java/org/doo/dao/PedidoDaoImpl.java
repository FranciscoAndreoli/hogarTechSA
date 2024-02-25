package org.doo.dao;

import org.doo.dto.PedidoDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDaoImpl implements PedidoDao<PedidoDto> {

    @Override
    public PedidoDto buscar(PedidoDto entidad) {
        return null;
    }

    @Override
    public PedidoDto buscar(int id) {
        return null;
    }

    @Override
    public List<PedidoDto> listarPorCriterio(PedidoDto entidad) {
        return null;
    }

    @Override
    public List<PedidoDto> listarTodos() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<PedidoDto> pedidoDtoList = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "select id_pedido, id_producto, id_cliente, cantidad, status, fecha_pedido, precio_total "
                    + "from Pedidos order by id_pedido";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);

            PedidoDto pedidoDto;

            while (rs.next()) {
                pedidoDto = new PedidoDto.Builder()
                        .setIdPedido(rs.getInt("id_pedido"))
                        .setProducto(rs.getInt("id_producto"))
                        .setCliente(rs.getString("id_cliente"))
                        .setCantidad(rs.getInt("cantidad"))
                        //.setIdEmpleado(rs.getInt("id_empleado"))
                        .setFechaPedido(rs.getDate("fecha_pedido"))
                        .setStatus(rs.getString("status")).build();
                pedidoDtoList.add(pedidoDto);
                if (pedidoDtoList.size() == 0) {
                    pedidoDtoList = null;
                }
            }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
        /*
        finally {
            try {
                rs.close();
                sentencia.close();
            }
            catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        */
        return pedidoDtoList;
    }

    @Override
    public int mayorId() {
        return 0;
    }

    @Override
    public boolean insertar(PedidoDto entidad) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "insert into Pedidos (id_producto, id_cliente, cantidad, status, fecha_pedido, precio_total) "
                    + "values(?,?,?,?,?,?)";

            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, entidad.getProducto());
            sentencia.setString(2, entidad.getCliente());
            sentencia.setInt(3, entidad.getCantidad());
            sentencia.setString(4, entidad.getStatus());
            sentencia.setDate(5, entidad.getFechaPedido());
            sentencia.setDouble(6, entidad.getPrecioTotal());


            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    @Override
    public boolean modificar(PedidoDto entidad) {
       Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "update Pedidos set id_producto = ?, id_cliente = ?, cantidad = ?, status = ?"
                    + "where id_pedido = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, entidad.getProducto());
            sentencia.setString(2, entidad.getCliente());
            sentencia.setInt(3, entidad.getCantidad());
            sentencia.setString(4, entidad.getStatus());
            sentencia.setDate(5, entidad.getFechaPedido());
            sentencia.setDouble(6, entidad.getPrecioTotal());

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
        System.out.println("Pedido borrado");

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM Pedidos WHERE id_pedido = ?";
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
