package org.doo;

import com.formdev.flatlaf.FlatLightLaf;
import org.doo.controlador.Controlador;
import org.doo.controlador.PrincipalControlador;
import org.doo.controlador.LoginControlador;
import org.doo.dao.FabricaDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.ProductoDto;
import org.doo.model.Login;
import org.doo.model.Modelo;
import org.doo.model.Persona;
import org.doo.model.Producto;
import org.doo.vista.FormPrincipal;
import org.doo.vista.FormLogin;
import org.doo.vista.InterfazVista;

import javax.swing.*;


public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }

                InterfazVista vista = FormLogin.getInstancia();

                Controlador control = new LoginControlador(vista, new Login());

                vista.setControlador(control);

                vista.iniciaVista();
            }
        });
    }
}
