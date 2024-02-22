package org.doo.dao;

import java.util.List;

public interface Dao<T> {

    default void abrirConexion() {
    }

    default void cerrarConexion() {
        ConexionSql.getInstancia().desconectar();
    }

    T buscar(T entidad);

    T buscar(int id);

    List<T> listarPorCriterio(T entidad);

    List<T> listarTodos();

    int mayorId();

    boolean insertar(T entidad);

    boolean modificar(T entidad);
    
    boolean personaExists(int userId);
    
    boolean borrar(int id);
}
