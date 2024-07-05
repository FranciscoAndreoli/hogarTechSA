package org.doo.model;

public class EnvoltorioRegaloDecorator extends DetallePedidoDecorator {
    private float precioEnvoltorioExtra;

    public EnvoltorioRegaloDecorator(IDetallePedido detallePedido, float precioEnvoltorioExtra) {
        super(detallePedido);
        this.precioEnvoltorioExtra = precioEnvoltorioExtra;
    }

    @Override
    public float getPrecioTotal() {
        return detallePedido.getPrecioTotal() + addPrecioEnvoltorioExtra();

    }

    public float addPrecioEnvoltorioExtra() {
        return this.precioEnvoltorioExtra * detallePedido.getCantidad();

    }
}
