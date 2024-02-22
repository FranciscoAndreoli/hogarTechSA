package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.LoginDao;
import org.doo.dto.LoginDto;
public class Login extends Modelo{
    private final LoginDao loginDao;
    public Login() {
        loginDao = (LoginDao) FabricaDao.getDao("LoginDaoImpl");
    }

    public boolean validarUsuario(String dni, String password){
        LoginDto loginDto = new LoginDto(dni, password);
        return loginDao.validarUsuario(loginDto);
    }
}
