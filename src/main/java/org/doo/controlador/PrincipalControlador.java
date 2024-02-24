/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doo.controlador;


import org.doo.model.*;
import org.doo.vista.*;

import java.awt.event.ActionEvent;

/**
 *
 * @author someone
 */
public class PrincipalControlador extends Controlador {

    public PrincipalControlador(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    public void abmProductos() {
        InterfazVistaAbm vista;
        Controlador control;
        //modelo:
        this.MODELO = new Producto();
        //vista:
        vista = new FormProducto(null, true);

        //controlador:
        control = new ProductoControlador(vista, this.MODELO);

        //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
        vista.setControlador(control);

        //y arrancamos la interfaz:
        vista.iniciaVista();
    }

    /*public void abmPersonas() {
        InterfazVistaAbm vista;
        Controlador control;
        //modelo:
        this.MODELO = new Persona();
        //vista:
        vista = new FormPersona(null, true);

        //controlador:
        control = new PersonaControlador(vista, this.MODELO);

        //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
        vista.setControlador(control);

        //y arrancamos la interfaz:
        vista.iniciaVista();
    }*/

    /*public void abmPedidos() {
        InterfazVistaAbm vista;
        Controlador control;
        //modelo:
        this.MODELO = new Pedido();
        //vista:
        vista = new FormPedido(null, true);

        //controlador:
        control = new PedidoControlador(vista, this.MODELO);

        //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
        vista.setControlador(control);

        //y arrancamos la interfaz:
        vista.iniciaVista();
    }*/

    public void abmClientes() {
        InterfazVistaAbm vista;
        Controlador control;
        //modelo:
        this.MODELO = new Cliente();
        //vista:
        vista = new FormCliente(null, true);

        //controlador:
        control = new ClienteControlador(vista, this.MODELO);

        //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
        vista.setControlador(control);

        //y arrancamos la interfaz:
        vista.iniciaVista();
    }

    public void salir(ActionEvent e) {
        System.exit(0);
    }

    

}
