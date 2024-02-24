package org.doo.dao;

import org.doo.dto.LoginDto;

public interface LoginDao<T> extends Dao<T>{
    LoginDto validarUsuario(T entidad);
}
