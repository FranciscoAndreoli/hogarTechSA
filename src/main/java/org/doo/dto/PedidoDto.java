package org.doo.dto;
import java.util.Date;

public class PedidoDto {

    private int idPedido;
    private int producto;
    private int cantidad;
    private String cliente;
    private int idEmpleado;
    private String status;
    private Date fechaPedido;
    private double precioTotal;


    public PedidoDto() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public java.sql.Date getFechaPedido() {
        return (java.sql.Date) fechaPedido;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        if ("entregado".equalsIgnoreCase(status) || "pagado".equalsIgnoreCase(status)) {
            this.status = status;
        }
        else {
            throw new IllegalArgumentException("Status must be either 'entregado' or 'pagado'");
        }


        this.status = status;
    }

    public static class Builder {
        private int idPedido;
        private int producto;
        private int cantidad;
        private String cliente;
        private int idEmpleado;
        private String status;
        private Date fechaPedido;
        private double precioTotal;

        public int getIdPedido() {
            return idPedido;
        }

        public int getProducto() {
            return producto;
        }


        public int getCantidad() {
            return cantidad;
        }

        public String getCliente() {
            return cliente;
        }

        public int getIdEmpleado() {
            return idEmpleado;
        }

        public Date getFechaPedido() {
            return fechaPedido;
        }

        public double getPrecioTotal() {
            return precioTotal;
        }

        public Builder setPrecioTotal(double precioTotal) {
            this.precioTotal = precioTotal;
            return this;
        }

        public Builder setFechaPedido(Date fechaPedido) {

            this.fechaPedido = fechaPedido;
            return this;
        }

        public Builder setIdPedido(int idPedido) {
            this.idPedido = idPedido;
            return this;
        }

        public Builder setProducto(int producto) {
            this.producto = producto;
            return this;
        }

        public Builder setCantidad(int cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder setIdEmpleado(int idEmpleado) {
            this.idEmpleado = idEmpleado;
            return this;
        }

        public PedidoDto build() {
            return new PedidoDto(this);
        }

        public String getStatus() {
            return status;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
    }
    private PedidoDto(Builder builder) {
        this.idPedido = builder.idPedido;
        this.producto = builder.producto;
        this.cantidad = builder.cantidad;
        this.cliente = builder.cliente;
        this.idEmpleado = builder.idEmpleado;
        this.status = builder.status;
        this.fechaPedido = builder.fechaPedido;
        this.precioTotal = builder.precioTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", cliente='" + cliente + '\'' +
                ", idEmpleado=" + idEmpleado +
                ", status='" + status + '\'' +
                ", fechaPedido=" + fechaPedido +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
