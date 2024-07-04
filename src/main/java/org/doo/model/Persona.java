package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.PersonaDao;
import org.doo.dto.PersonaDto;

import java.util.Date;
import java.util.List;

public abstract class Persona extends Modelo{
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String domicilio;
    protected String numTelefono;

    public Persona(String nombre, String apellido, String dni, String domicilio, String numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.numTelefono = numTelefono;
    }

    public Persona() {

    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}





