package org.doo.dao;

import org.doo.dto.LoginDto;
import java.util.List;
import java.sql.*;
public class LoginDaoImpl implements LoginDao<LoginDto>{

    public LoginDto validarUsuario(LoginDto dto) {
        String sql = "SELECT nombre, apellido, rol FROM Persona WHERE DNI = ? AND Contrasenia = ?";
        LoginDto usuario = null;

        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, dto.getDni());
            pst.setString(2, dto.getPassword());

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    usuario = new LoginDto(); // Crea un nuevo DTO para llenarlo con datos
                    usuario.setDni(dto.getDni()); // Ya conocemos el DNI
                    usuario.setNombre(rs.getString("nombre"));
                    usuario.setApellido(rs.getString("apellido"));
                    usuario.setRol(rs.getString("rol"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al validar el inicio de sesión: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public LoginDto buscar(LoginDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LoginDto buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<LoginDto> listarPorCriterio(LoginDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<LoginDto> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int mayorId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean insertar(LoginDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean modificar(LoginDto entidad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
