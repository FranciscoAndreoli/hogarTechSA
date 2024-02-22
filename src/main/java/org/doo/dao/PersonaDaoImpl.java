package org.doo.dao;

import org.doo.dto.PersonaDto;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PersonaDaoImpl implements PersonaDao<PersonaDto>{
    @Override
    public PersonaDto buscar(PersonaDto entidad) {
        return null;
    }

    @Override
    public PersonaDto buscar(int id) {
        return null;
    }

    @Override
    public List<PersonaDto> listarPorCriterio(PersonaDto entidad) {
        return null;
    }

    @Override
    public List<PersonaDto> listarTodos() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<PersonaDto> personaDtoList = new ArrayList<>();
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "select id_persona, nombre, apellido, fechaNac, dni, domicilio "
                    + "from persona order by id_persona";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                long timestamp = rs.getLong("fechaNac");
                Date fechaNac = new Date(timestamp);

                // Create the PersonaDto object using the builder pattern
                PersonaDto personaDto = new PersonaDto.Builder()
                        .id(rs.getInt("id_persona"))
                        .nombre(rs.getString("nombre"))
                        .apellido(rs.getString("apellido"))
                        .fechaNac(fechaNac)
                        .dni(rs.getInt("dni"))
                        .domicilio(rs.getString("domicilio"))
                        .build();

                // Add the created PersonaDto to the list
                personaDtoList.add(personaDto);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                rs.close();
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return personaDtoList;
    }

    @Override
    public int mayorId() {
        return 0;
    }

    @Override
    public boolean insertar(PersonaDto entidad) {
        Connection con = null;
        PreparedStatement sentencia = null;
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "insert into persona (nombre, apellido, fechaNac, dni, domicilio) "
                    + "values(?,?,?,?,?)";

            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, entidad.getNombre());
            sentencia.setString(2, entidad.getApellido());
            sentencia.setDate(3, new java.sql.Date(entidad.getFechaNac().getTime()));
            sentencia.setInt(4, entidad.getDni());
            sentencia.setString(5, entidad.getDomicilio());

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
    public boolean personaExists(int id) {
        String sql = "SELECT 1 FROM persona WHERE id_persona = ?";
        boolean exists = false;

        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                exists = rs.next();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return exists;
    }
    
    @Override
    public boolean modificar(PersonaDto entidad) {
        String sqlUpdate = "UPDATE persona SET nombre = ?, apellido = ?, fechaNac = ?, dni = ?, domicilio = ? WHERE id_persona = ?";
        try (Connection con = ConexionSql.getInstancia().getConnection();
             PreparedStatement pst = con.prepareStatement(sqlUpdate)) {

            pst.setString(1, entidad.getNombre());
            pst.setString(2, entidad.getApellido());
            pst.setDate(3, new java.sql.Date(entidad.getFechaNac().getTime()));
            pst.setInt(4, entidad.getDni());
            pst.setString(5, entidad.getDomicilio());
            pst.setLong(6, entidad.getId());

            int affectedRows = pst.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean borrar(int id) {
        Connection con = null;
        PreparedStatement sentencia = null;
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM persona WHERE id_persona = ?";

            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);

            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
}
