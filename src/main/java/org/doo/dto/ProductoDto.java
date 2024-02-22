package org.doo.dto;


public class ProductoDto {

    private int idProducto;
    private String nombre;
    private double precio;
    private String color;
    private String marca;
    private String modelo;
    private int stock;

    public ProductoDto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private ProductoDto(ProductoDto.Builder builder) {
        this.idProducto = builder.idProducto;
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.color = builder.color;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.stock = builder.stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", stock=" + stock +
                '}';
    }

    public static class Builder {
        private int idProducto;
        private String nombre;
        private double precio;
        private String color;
        private String marca;
        private String modelo;
        private int stock;

        public ProductoDto.Builder setIdProducto(int idProducto) {
            this.idProducto = idProducto;
            return this;
        }

        public ProductoDto.Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProductoDto.Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public ProductoDto.Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public ProductoDto.Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public ProductoDto.Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public ProductoDto.Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public ProductoDto build() {
            return new ProductoDto(this);
        }
    }

    /*Producto producto = new Producto.Builder()
        .setIdProducto(1)
        .setNombre("Lavadora")
        .setPrecio(599.99)
        .setColor("Blanco")
        .setMarca("XYZ")
        .setModelo("ABC123")
        .setStock(10)
        .build();*/
}
