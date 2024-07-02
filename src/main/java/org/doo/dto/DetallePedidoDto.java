/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.doo.dto;

import org.doo.model.IDetallePedido;
/**
 *
 * @author franc
 */
public class DetallePedidoDto implements IDetallePedido{
 
    private int idPedido;
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private float precioUnitario;
    private float precioTotal;
    
    public DetallePedidoDto(int idPedido, int idProducto, String nombreProducto,int cantidad,
                            float precioUnitario, float precioTotal) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getidProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setnombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
}
