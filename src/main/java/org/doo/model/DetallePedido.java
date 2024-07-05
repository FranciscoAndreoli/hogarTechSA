package org.doo.model;

public class DetallePedido implements IDetallePedido{
    private Producto producto;
    private int cantidad;
    private float precioUnitario;
    private float subtotal;

    protected DetallePedido(Producto producto, int cantidad, float precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int getIdPedido() {
        return 0;
    }

    @Override
    public int getidProducto() {
        return this.producto.getIdProducto();
    }

    @Override
    public String getNombreProducto() {
        return this.producto.getNombre();
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

    @Override
    public float getPrecioTotal() {
        return this.subtotal;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
