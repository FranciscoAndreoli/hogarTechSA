package org.doo.dto;

public class PedidoDto {
 
    private int idPedido;
    private int idCliente;
    private String nombreCliente;
    private String dni;
    private String fecha;
    private int legajoEmpleado;
    private String status;
    private float importe;

    public PedidoDto() {
        
    }

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombre, String apellido) {
        this.nombreCliente = nombre + " " + apellido;
    }
     public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getLegajoEmpleado() {
        return legajoEmpleado;
    }
    public void setLegajoEmpleado(int legajoEmpleado) {
       this.legajoEmpleado = legajoEmpleado;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {  
        this.status = status;
    }
    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
        this.importe = importe;
    }

    
}
