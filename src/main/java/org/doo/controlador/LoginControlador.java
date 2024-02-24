package org.doo.controlador;

import org.doo.dao.LoginDao;
import org.doo.dto.LoginDto;
import org.doo.model.Login;
import org.doo.model.Modelo;
import org.doo.vista.*;
import org.doo.services.SessionManager;

import javax.swing.*;

public class LoginControlador extends Controlador{

    public LoginControlador(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    public void validateLogin(String dni, String password) {
        LoginDto empleadoActual = ((Login) this.MODELO).validarUsuario(dni, password);

        if (empleadoActual != null) {
            SessionManager.saveEmpleadoActual(empleadoActual);
            displayMenuPrincipal();
            VISTA.ocultarVista();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrecta. Chequeá tu DNI y Contraseña.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void displayMenuPrincipal() {
        InterfazVista vista = FormPrincipal.getInstancia();
        Controlador control = new PrincipalControlador(vista, null);
        //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
        vista.setControlador(control);
        //y arrancamos la interfaz:
        vista.iniciaVista();
    }
}
