/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexionSql {

    private final String URL = "jdbc:sqlite:" + getClass().getResource("/doo2.db").getPath();
    private Connection connection = null;
    private static ConexionSql instancia = null;

    private ConexionSql() {
    }

    public static synchronized ConexionSql getInstancia() {
        if (instancia == null) {
            instancia = new ConexionSql();
        }
        return instancia;
    }

    public Connection getConnection() {
        try {
            if (this.connection == null || this.connection.isClosed()) {
                connection = DriverManager.getConnection(URL);
            }
        } catch (SQLException e) {
            System.out.println("Error al crear la conexión: " + e);
        }
        return connection;
    }


    protected void desconectar() {
        if (this.connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex);
            } finally {
                connection = null;
            }
        }
    }
}
