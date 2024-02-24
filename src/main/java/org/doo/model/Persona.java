package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.PersonaDao;
import org.doo.dto.PersonaDto;

import java.util.Date;
import java.util.List;

public abstract class Persona extends Modelo {
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


    /*private final PersonaDao personaDao;

    public Persona() {
        personaDao = (PersonaDao) FabricaDao.getDao("PersonaDaoImpl");
    }
    public List<PersonaDto> listar() {
        List<PersonaDto> personaDtoList = (List<PersonaDto>) personaDao.listarTodos();
        return personaDtoList;
    }

    public boolean guardar(String nombre, String apellido, Date fechaNac, int dni, String domicilio) {
        PersonaDto personaDto = new PersonaDto.Builder()
                .nombre(nombre)
                .apellido(apellido)
                .fechaNac(fechaNac)
                .dni(dni)
                .domicilio(domicilio)
                .build();
        return personaDao.insertar(personaDto);
    }

    public boolean modificar(int id, String nombre, String apellido, Date fechaNac, int dni, String domicilio) {
        PersonaDto personaDto = new PersonaDto.Builder()
                .id(id)
                .nombre(nombre)
                .apellido(apellido)
                .fechaNac(fechaNac)
                .dni(dni)
                .domicilio(domicilio)
                .build();
        return personaDao.modificar(personaDto);
    }

    public boolean borrar(int id) {
        return personaDao.borrar(id);
    }
    
    public boolean chequearUsuario(int id){
        return personaDao.personaExists(id);
    }*/


