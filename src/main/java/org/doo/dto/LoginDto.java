package org.doo.dto;

import java.util.Date;

public class LoginDto {
    private int ID;
    private String dni;
    private String password;
    private String nombre;
    private String apellido;
    private String rol;
    public LoginDto(String dni, String password) {
        this.dni = dni;
        this.password = password;
    }
    public LoginDto() {
    }
    public void setID(int id) {
        this.ID = id;
    }
    public int getID() {
        return ID;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getPassword() {
        return password;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

}
