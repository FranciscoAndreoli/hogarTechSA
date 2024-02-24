package org.doo.model;
import org.doo.services.RolEmpleado;

public class Empleado extends Persona {
    private String legajo;
    private RolEmpleado rol;

    public Empleado(String nombre, String apellido, String dni, String domicilio, String numTelefono) {
        super(nombre, apellido, dni, domicilio, numTelefono);
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
}
