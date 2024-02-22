package org.doo;

import org.doo.dao.ConexionSql;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConexionSqlTest {

        ConexionSql conexionSql;

        @BeforeEach
        public void setUp() {
            // Obtener la instancia del singleton antes de cada prueba
            conexionSql = ConexionSql.getInstancia();
        }

        @AfterEach
        public void tearDown() {
            // Desconectar después de cada prueba
            conexionSql.desconectar();
        }

        @Test
        public void cuandoSeObtieneLaConexionEntoncesNoEsNula() {
            // Ejecución: obtener la conexión
            Connection conn = conexionSql.getConnection();

            // Verificación: la conexión no es nula
            assertNotNull(conn, "La conexión de la base de datos no debería ser nula");
        }

}
