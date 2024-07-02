package org.doo.model;

public interface IDetallePedido {
    int getIdPedido();
    int getidProducto();
    String getNombreProducto();
    int getCantidad();
    float getPrecioUnitario();
    float getPrecioTotal();
}
