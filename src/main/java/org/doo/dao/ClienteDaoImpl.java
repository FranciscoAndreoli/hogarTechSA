package org.doo.dao;
import org.doo.dto.ClienteDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao<ClienteDto>{

    @Override
    public ClienteDto buscar(ClienteDto entidad) {
        return null;
    }

    @Override
    public ClienteDto buscar(int id) {
        return null;
    }

    @Override
    public List<ClienteDto> listarPorCriterio(ClienteDto entidad) {
        return null;
    }

    @Override
    public List<ClienteDto> listarTodos() {
        List<ClienteDto> clientes = new ArrayList<>();
        String sql = "SELECT ID, Nombre, Apellido, DNI, Domicilio, NumTelefono FROM Persona WHERE TipoPersona = 'Cliente'";

        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    ClienteDto cliente = new ClienteDto(
                            rs.getInt("ID"),
                            rs.getString("Apellido"),
                            rs.getString("Nombre"),
                            rs.getString("NumTelefono"),
                            rs.getString("DNI"),
                            rs.getString("Domicilio"),
                            null // paso null a los pedidos del cliente.
                    );
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar todos los clientes: " + e.getMessage());
        }
        return clientes;
    }


    @Override
    public boolean chequearCliente(String dni) {
        String sql = "SELECT DNI FROM Persona WHERE DNI = ?";

        try (Connection con = ConexionSql.getInstancia().getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1,dni);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al chequear existencia de cliente: " + e.getMessage());
        }
        return false;
    }
    @Override
    public boolean create(ClienteDto clienteDto) {
        String sql = "INSERT INTO Persona (Nombre, Apellido, DNI, Domicilio, NumTelefono, TipoPersona) VALUES (?, ?, ?, ?, ?, 'Cliente')";
        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, clienteDto.getNombre());
            pst.setString(2, clienteDto.getApellido());
            pst.setString(3, clienteDto.getDni());
            pst.setString(4, clienteDto.getDomicilio());
            pst.setString(5, clienteDto.getNumTelefono());

            int affectedRows = pst.executeUpdate();

            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar el cliente: " + e.getMessage());
            return false;
        }
    }
    
    @Override
    public boolean update(String dni, String nombre, String apellido, String direccion, String telefono) {
        StringBuilder sql = new StringBuilder("UPDATE Persona SET ");
        List<Object> parametros = new ArrayList<>();
        boolean necesitaComa = false; // Para controlar la adición de comas entre campos

        if (!nombre.trim().isEmpty()) {
            sql.append("Nombre = ?");
            parametros.add(nombre);
            necesitaComa = true;
        }

        if (!apellido.trim().isEmpty()) {
            if (necesitaComa) sql.append(", ");
            sql.append("Apellido = ?");
            parametros.add(apellido);
            necesitaComa = true;
        }

        if (!direccion.trim().isEmpty()) {
            if (necesitaComa) sql.append(", ");
            sql.append("Domicilio = ?");
            parametros.add(direccion);
            necesitaComa = true;
        }

        if (!telefono.trim().isEmpty()) {
            if (necesitaComa) sql.append(", ");
            sql.append("NumTelefono = ?");
            parametros.add(telefono);
        }

        sql.append(" WHERE DNI = ?");
        parametros.add(dni);

        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sql.toString())) {

            for (int i = 0; i < parametros.size(); i++) {
                pst.setObject(i + 1, parametros.get(i));
            }

            int affectedRows = pst.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el cliente: " + e.getMessage());
            return false;
        }
    }
    
    @Override
public boolean delete(String dni) {
    
    String sqlEliminarPedidosCliente = "DELETE FROM Pedido WHERE ClienteID IN (SELECT ID FROM Persona WHERE DNI = ?)";
    
    String sqlEliminarPersona = "DELETE FROM Persona WHERE DNI = ?";
    
    try (Connection con = ConexionSql.getInstancia().getConnection();
         PreparedStatement pstEliminarPedidosCliente = con.prepareStatement(sqlEliminarPedidosCliente);
         PreparedStatement pstEliminarPersona = con.prepareStatement(sqlEliminarPersona)) {
        
        pstEliminarPedidosCliente.setString(1, dni);
        int affectedRowsPedidos = pstEliminarPedidosCliente.executeUpdate();
        
        pstEliminarPersona.setString(1, dni);
        int affectedRowsPersona = pstEliminarPersona.executeUpdate();
        
        return affectedRowsPersona > 0;
    } catch (SQLException e) {
        System.err.println("Error al eliminar el cliente y sus pedidos: " + e.getMessage());
        return false;
    }
}
    
    @Override
    public int mayorId() {
        return 0;
    }

    @Override
    public boolean insertar(ClienteDto entidad) {
        return false;
    }

    @Override
    public boolean modificar(ClienteDto entidad) {
        return false;
    }

    @Override
    public boolean personaExists(int userId) {
        return false;
    }

    @Override
    public boolean borrar(int id) {
        return false;
    }


}
