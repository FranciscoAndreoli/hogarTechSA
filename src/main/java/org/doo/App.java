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

/**
 * Hello world!
 *
 */
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
                //vista:
                //InterfazVista vista = FormPrincipal.getInstancia();
                InterfazVista vista = FormLogin.getInstancia();

                //controlador:
                Controlador control = new LoginControlador(vista, new Login());
                //Controlador control = new PrincipalControlador(vista, null);

                //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                vista.setControlador(control);

                //y arrancamos la interfaz:
                vista.iniciaVista();
            }
        });
    }
}
