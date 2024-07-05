package org.doo.model;

public class GarantiaExtendidaDecorator extends DetallePedidoDecorator {
    private float precioGarantiaExtra;

    public GarantiaExtendidaDecorator(IDetallePedido detallePedido, float precioGarantiaExtra) {
        super(detallePedido);
        this.precioGarantiaExtra = precioGarantiaExtra;
    }

    @Override
    public float getPrecioTotal() {
        return detallePedido.getPrecioTotal() + addPrecioGarantiaExtendida();
    }

    public float addPrecioGarantiaExtendida() {
        return this.precioGarantiaExtra * detallePedido.getCantidad();
    }



}
