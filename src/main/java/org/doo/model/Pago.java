package org.doo.model;

public class Pago {
    private int idPago;
    private String tipoPago;
    private Pedido pedido;

    public Pago(int idPago, String tipoPago, Pedido pedido) {
        this.idPago = idPago;
        this.tipoPago = tipoPago;
        this.pedido = pedido;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
