package org.doo.dto;

import java.util.Date;

public class PersonaDto {

    private long id;
    private String apellido;
    private String nombre;
    private Date fechaNac;
    private int dni;
    private String domicilio;
    public PersonaDto() {
    }
    private PersonaDto(Builder builder) {
        this.id = builder.id;
        this.apellido = builder.apellido;
        this.nombre = builder.nombre;
        this.fechaNac = builder.fechaNac;
        this.dni = builder.dni;
        this.domicilio = builder.domicilio;
    }

    public long getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public int getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public static class Builder {
        private long id;
        private String apellido;
        private String nombre;
        private Date fechaNac;
        private int dni;
        private String domicilio;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder fechaNac(Date fechaNac) {
            this.fechaNac = fechaNac;
            return this;
        }

        public Builder dni(int dni) {
            this.dni = dni;
            return this;
        }

        public Builder domicilio(String domicilio) {
            this.domicilio = domicilio;
            return this;
        }

        public PersonaDto build() {
            return new PersonaDto(this);
        }
    }
}
