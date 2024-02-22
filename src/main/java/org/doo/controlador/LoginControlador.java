package org.doo.controlador;

import org.doo.model.Login;
import org.doo.model.Modelo;
import org.doo.vista.*;

import javax.swing.*;

public class LoginControlador extends Controlador{

    public LoginControlador(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    public void validateLogin(String dni, String password) {

        if(((Login) this.MODELO).validarUsuario(dni, password)) {
            displayMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Please check your DNI and password and try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
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
