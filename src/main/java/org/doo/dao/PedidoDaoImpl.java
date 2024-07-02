package org.doo.dao;

import org.doo.dto.PedidoDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.model.IDetallePedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDaoImpl implements PedidoDao<PedidoDto> {

    @Override
    public PedidoDto buscar(PedidoDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public PedidoDto buscar(int id) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        PedidoDto pedidoDto = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
             String sql = "SELECT p.NumPedido, p.ClienteID, p.EmpleadoID, p.Fecha, p.Estado, p.Total, pe.Nombre, pe.Apellido, pe.DNI "
                + "FROM Pedido p "
                + "JOIN Persona pe ON p.ClienteID = pe.ID AND pe.TipoPersona = 'Cliente' "
                + "WHERE p.NumPedido = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);
            rs = sentencia.executeQuery();

            if (rs.next()) {
                pedidoDto = new PedidoDto();
                pedidoDto.setIdPedido(rs.getInt("NumPedido"));
                pedidoDto.setIdCliente(rs.getInt("ClienteID"));
                pedidoDto.setNombreCliente(rs.getString("Nombre"), rs.getString("Apellido"));
                pedidoDto.setDni(rs.getString("DNI"));
                pedidoDto.setFecha(rs.getString("Fecha"));
                pedidoDto.setLegajoEmpleado(rs.getInt("EmpleadoID"));
                pedidoDto.setStatus(rs.getString("Estado"));
                pedidoDto.setImporte(rs.getFloat("Total"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return pedidoDto;
    }


    @Override
    public List<PedidoDto> listarPorCriterio(PedidoDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<PedidoDto> listarTodos() {
    Connection con = null;
    PreparedStatement sentencia = null;
    ResultSet rs = null;
    List<PedidoDto> pedidoDtoList = new ArrayList<>();

    try {
        con = ConexionSql.getInstancia().getConnection();
        String sql = "SELECT p.NumPedido, p.ClienteID, p.EmpleadoID, p.Fecha, p.Estado, p.Total, pe.Nombre, pe.Apellido, pe.DNI "
                + "FROM Pedido p "
                + "JOIN Persona pe ON p.ClienteID = pe.ID AND pe.TipoPersona = 'Cliente' "
                + "ORDER BY p.NumPedido DESC";
        sentencia = con.prepareStatement(sql);

        rs = sentencia.executeQuery();

        while (rs.next()) {
            PedidoDto pedidoDto = new PedidoDto();
            pedidoDto.setIdPedido(rs.getInt("NumPedido"));
           
            pedidoDto.setNombreCliente(rs.getString("Nombre"), rs.getString("Apellido"));
            pedidoDto.setDni(rs.getString("DNI"));
            pedidoDto.setFecha(rs.getString("Fecha"));
            pedidoDto.setLegajoEmpleado(rs.getInt("EmpleadoID"));
            pedidoDto.setStatus(rs.getString("Estado"));
            pedidoDto.setImporte(rs.getFloat("Total"));
            pedidoDtoList.add(pedidoDto);
        }
    } catch (SQLException e) {
        System.err.println(e);
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    return pedidoDtoList;
}

    public List<PedidoDto> buscarPedidos(String dniCliente){
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        List<PedidoDto> pedidoDtoList = new ArrayList<>();
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT p.NumPedido, p.ClienteID, p.EmpleadoID, p.Fecha, p.Estado, p.Total, pe.Nombre, pe.Apellido, pe.DNI "
                    + "FROM Pedido p "
                    + "JOIN Persona pe ON p.ClienteID = pe.ID AND pe.TipoPersona = 'Cliente' "
                    + "WHERE DNI LIKE ?"
                    + "ORDER BY p.NumPedido DESC";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, dniCliente);
            rs = sentencia.executeQuery();

            while (rs.next()) {
                PedidoDto pedidoDto = new PedidoDto();
                pedidoDto.setIdPedido(rs.getInt("NumPedido"));

                pedidoDto.setNombreCliente(rs.getString("Nombre"), rs.getString("Apellido"));
                pedidoDto.setDni(rs.getString("DNI"));
                pedidoDto.setFecha(rs.getString("Fecha"));
                pedidoDto.setLegajoEmpleado(rs.getInt("EmpleadoID"));
                pedidoDto.setStatus(rs.getString("Estado"));
                pedidoDto.setImporte(rs.getFloat("Total"));
                pedidoDtoList.add(pedidoDto);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return pedidoDtoList;
           }

    public List<DetallePedidoDto> listarDetallePedido(){
        List<DetallePedidoDto> detallePedidoList = new ArrayList<>();
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT PedidoID, ProductoID, NombreProducto, Cantidad, PrecioUnitario, Subtotal " +
                    "FROM DetallePedido " +
                    "ORDER BY PedidoID, ProductoID";
            sentencia = con.prepareStatement(sql);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                DetallePedidoDto detallePedido = new DetallePedidoDto(
                                rs.getInt("PedidoID"),
                                rs.getInt("ProductoID"),
                                rs.getString("NombreProducto"),
                                rs.getInt("Cantidad"),
                                rs.getFloat("PrecioUnitario"),
                                rs.getFloat("Subtotal"));

                detallePedidoList.add(detallePedido);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return detallePedidoList;
    }

    public boolean updateEstadoPedido(int idPedido, String nuevoEstado) {
        Connection con = null;
        PreparedStatement sentencia = null;
        boolean actualizado = false;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE Pedido SET Estado = ? WHERE NumPedido = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, nuevoEstado);
            sentencia.setInt(2, idPedido);

            int affectedRows = sentencia.executeUpdate();
            actualizado = affectedRows > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar el estado del pedido: " + e.getMessage());
            actualizado = false;
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
        return actualizado;
    }

    public List<DetallePedidoDto> buscarDetallePedido(int pedidoId) {
        List<DetallePedidoDto> detallePedidoList = new ArrayList<>();
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT PedidoID, ProductoID, NombreProducto, Cantidad, PrecioUnitario, Subtotal " +
                    "FROM DetallePedido " +
                    "WHERE PedidoID = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, pedidoId);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                DetallePedidoDto detallePedido = new DetallePedidoDto(
                        rs.getInt("PedidoID"),
                        rs.getInt("ProductoID"),
                        rs.getString("NombreProducto"),
                        rs.getInt("Cantidad"),
                        rs.getFloat("PrecioUnitario"),
                        rs.getFloat("Subtotal"));
                detallePedidoList.add(detallePedido);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return detallePedidoList;
    }

    @Override
    public int mayorId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insertar(PedidoDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int crearPedido(PedidoDto pedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet generatedKeys = null;
        int lastInsertedId = -1;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO Pedido (ClienteID, EmpleadoID, Fecha, Estado, Total) values(?,?,?,?,?)";

            sentencia = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setInt(1, pedido.getIdCliente());
            sentencia.setInt(2, pedido.getLegajoEmpleado());
            sentencia.setString(3, pedido.getFecha());
            sentencia.setString(4, pedido.getStatus());
            sentencia.setFloat(5, pedido.getImporte());

            int affectedRows = sentencia.executeUpdate();

            if (affectedRows > 0) {
                generatedKeys = sentencia.getGeneratedKeys();
                if (generatedKeys.next()) {
                    lastInsertedId = generatedKeys.getInt(1);
                }
            } else {
                throw new SQLException("La creación de pedido falló.");
            }
        } catch (SQLException e) {
            System.err.println("Error al crear pedido: " + e.getMessage());
        } finally {
            try {
                if (generatedKeys != null) generatedKeys.close();
                if (sentencia != null) sentencia.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar recursos: " + ex.getMessage());
            }
        }
        return lastInsertedId;
    }

    @Override
    public boolean crearDetallePedido(List<DetallePedidoDto> detallePedidoList, int pedidoId) {
        Connection con = null;
        PreparedStatement sentencia = null;
        boolean resultadoFinal = true;

        try {
            con = ConexionSql.getInstancia().getConnection();
            con.setAutoCommit(false); // Iniciar transacción

            String sql = "INSERT INTO DetallePedido (PedidoID, ProductoID, NombreProducto, Cantidad, PrecioUnitario) VALUES (?, ?, ?, ?, ?)";

            sentencia = con.prepareStatement(sql);

            for (IDetallePedido detalle : detallePedidoList) {
                sentencia.setInt(1, pedidoId); 
                sentencia.setInt(2, detalle.getidProducto());
                sentencia.setString(3, detalle.getNombreProducto());
                sentencia.setInt(4, detalle.getCantidad());
                sentencia.setFloat(5, detalle.getPrecioUnitario());

                sentencia.addBatch(); // Agregar al batch para ejecución en lote
            }

            int[] resultados = sentencia.executeBatch(); 
            con.commit(); 

            for (int r : resultados) {
                if (r < 1) {
                    resultadoFinal = false; // Si alguna inserción falló, establecer resultadoFinal a false
                    break;
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
            resultadoFinal = false;
            if (con != null) {
                try {
                    con.rollback(); // Revertir la transacción en caso de error
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
        } finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
            if (con != null) {
                try {
                    con.setAutoCommit(true); // Restablecer auto commit
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
        }
        return resultadoFinal;
    }


    @Override
    public boolean modificar(PedidoDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean borrar(int id) {
        Connection con = null;
        PreparedStatement sentencia = null;
        boolean resultadoFinal = false;

        try {
            con = ConexionSql.getInstancia().getConnection();
            // Iniciar transacción
            con.setAutoCommit(false);

            // Primero, borrar los detalles del pedido
            String sqlDetalle = "DELETE FROM DetallePedido WHERE PedidoID = ?";
            sentencia = con.prepareStatement(sqlDetalle);
            sentencia.setInt(1, id);
            int resultadoDetalle = sentencia.executeUpdate();

            // Ahora, si se borraron los detalles, borrar el pedido
            if (resultadoDetalle >= 0) {
                String sqlPedido = "DELETE FROM Pedido WHERE NumPedido = ?";
                sentencia = con.prepareStatement(sqlPedido);
                sentencia.setInt(1, id);
                int resultadoPedido = sentencia.executeUpdate();
                if (resultadoPedido > 0) {
                    resultadoFinal = true;
                }
            }

            // Si llegamos hasta aquí sin errores, hacer commit de la transacción
            con.commit();
        }
        catch (SQLException e) {
            System.err.println(e);
            // En caso de error, intentar hacer rollback de la transacción
            if (con != null) {
                try {
                    con.rollback();
                }
                catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
            resultadoFinal = false;
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            }
            catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return resultadoFinal;
    }


}
