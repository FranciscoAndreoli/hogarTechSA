package org.doo.model;
import org.doo.services.RolEmpleado;

import java.util.ArrayList;
import java.util.List;

public class  Empleado extends Persona {
    private String legajo;
    private RolEmpleado rol;
    private List<Pedido> pedidos;

    public Empleado(String nombre, String apellido, String dni, String domicilio, String numTelefono) {
        super(nombre, apellido, dni, domicilio, numTelefono);
        this.pedidos = new ArrayList<Pedido>();
    }

    public String getLegajo() {
        return legajo;
    }
    public RolEmpleado getRol() {
        return rol;
    }
    public void setRol(RolEmpleado rol) {
        this.rol = rol;
    }
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
