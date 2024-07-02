package org.doo.model;

abstract class DetallePedidoDecorator implements IDetallePedido {
    protected IDetallePedido detallePedido;

    public DetallePedidoDecorator(IDetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
    @Override
    public int getIdPedido() {
        return detallePedido.getIdPedido();
    }

    @Override
    public int getidProducto() {
        return detallePedido.getidProducto();
    }

    @Override
    public String getNombreProducto() {
        return detallePedido.getNombreProducto();
    }

    @Override
    public int getCantidad() {
        return detallePedido.getCantidad();
    }

    @Override
    public float getPrecioUnitario() {
        return detallePedido.getPrecioUnitario();
    }

    @Override
    public float getPrecioTotal() {
        return detallePedido.getPrecioTotal();
    }

}