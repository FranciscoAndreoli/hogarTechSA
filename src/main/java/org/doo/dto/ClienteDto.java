package org.doo.dto;

import java.util.ArrayList;
import java.util.List;

public class ClienteDto {
    private int idCliente;
    private String apellido;
    private String nombre;
    private String numTelefono;
    private String dni;
    private String domicilio;
    private List<PedidoDto> pedidos;

    public ClienteDto(int idCliente, String apellido, String nombre, String numTelefono, String dni, String domicilio, List<PedidoDto> pedidos) {
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.dni = dni;
        this.domicilio = domicilio;
        this.pedidos = (pedidos != null) ? pedidos : new ArrayList<>();
    }
    
    public ClienteDto( String apellido, String nombre, String numTelefono, String dni, String domicilio, List<PedidoDto> pedidos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.dni = dni;
        this.domicilio = domicilio;
        this.pedidos = (pedidos != null) ? pedidos : new ArrayList<>();
    }
    
    // Getters
    public int getId() {
        return idCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public List<PedidoDto> getPedidos() {
        return pedidos;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setPedidos(List<PedidoDto> pedidos) {
        this.pedidos = pedidos;
    }
}
