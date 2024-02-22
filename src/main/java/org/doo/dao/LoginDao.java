package org.doo.dao;

public interface LoginDao<T> extends Dao<T>{
    boolean validarUsuario(T entidad);
}
