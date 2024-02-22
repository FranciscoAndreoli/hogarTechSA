package org.doo.dao;

import org.doo.dto.PersonaDto;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class PersonaDaoImplTest {


        @Test
        public void testAgregarPersona() throws SQLException {
            // Mocks necesarios
            Connection mockConnection = mock(Connection.class);
            PreparedStatement mockStatement = mock(PreparedStatement.class);

            // Simular el comportamiento de los mocks
            when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
            when(mockStatement.executeUpdate()).thenReturn(1); // Suponemos que una fila es afectada

            // Simular la clase ConexionSql
            ConexionSql mockConexionSql = mock(ConexionSql.class);
            when(mockConexionSql.getConnection()).thenReturn(mockConnection);

            // Crear la instancia de PersonaDaoImpl con la conexión mock
            PersonaDaoImpl personaDao = new PersonaDaoImpl();

            // Crear un mock de PersonaDto
            PersonaDto persona = new PersonaDto(); // Configura los atributos necesarios

            // Ejecutar el método agregarPersona
            boolean resultado = personaDao.insertar(persona);

            // Verificar el resultado
            assertTrue(resultado, "La persona debería haber sido agregada correctamente");

            // Verificar que se llamaron los métodos esperados en los mocks
            verify(mockConnection).prepareStatement(anyString());
            verify(mockStatement).executeUpdate();

            // Verificar el resultado
            assertTrue(resultado, "La persona debería haber sido agregada correctamente");
    }
}
