package org.doo.model;

import org.doo.dto.ClienteDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.dto.PedidoDto;
import org.doo.services.Ticket;

import java.util.List;

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
    public String confirmarPago(ClienteDto cliente, PedidoDto pedido, List<DetallePedidoDto> detallePedidoList, String formaPago){
        Ticket ticket = new Ticket();
        return ticket.generarTicket(cliente, pedido, detallePedidoList, formaPago);
    }
}
