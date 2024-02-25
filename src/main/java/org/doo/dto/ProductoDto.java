package org.doo.dto;

import java.util.List;
import org.doo.dao.FabricaDao;
import org.doo.dao.ProductoDao;
import org.doo.model.Modelo;


public class ProductoDto {
    private final int idProducto;
    private final String nombre;
    private final float precio;
    private final String marca;
    private final String modelo;
    private final String color;
    private final int stock;
    private final String dimension;
    private final String origen;
    private final String peso;
    private final String capacidad;
    private final String eficiencia;
    private final String descripcion;
    private final int garantia;
    
    
    private ProductoDto(ProductoBuilder builder) {
        this.idProducto = builder.idProducto;
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.color = builder.color;
        this.stock = builder.stock;
        this.dimension = builder.dimension;
        this.origen = builder.origen;
        this.peso = builder.peso;
        this.capacidad = builder.capacidad;
        this.eficiencia = builder.eficiencia;
        this.descripcion = builder.descripcion;
        this.garantia = builder.garantia;
    }
    
    public Integer getIdProducto() { return idProducto; }
    public String getNombre() { return nombre; }
    public float getPrecio() { return precio; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public int getStock() { return stock; }
    public String getDimension() { return dimension; }
    public String getOrigen() { return origen; }
    public String getPeso() { return peso; }
    public String getCapacidad() { return capacidad; }
    public String getEficiencia() { return eficiencia; }
    public String getDescripcion() { return descripcion; }
    public int getGarantia() { return garantia; }

    public static class ProductoBuilder {
        private int idProducto;
        private final String nombre;
        private final float precio;
        private String marca;
        private String modelo;
        private String color;
        private final int stock;
        private String dimension;
        private String origen;
        private String peso;
        private String capacidad;
        private String eficiencia;
        private String descripcion;
        private int garantia;

        public ProductoBuilder(int id, String nombre, float precio, int stock) {
            this.idProducto = id;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public ProductoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public ProductoBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public ProductoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public ProductoBuilder dimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        public ProductoBuilder origen(String origen) {
            this.origen = origen;
            return this;
        }

        public ProductoBuilder peso(String peso) {
            this.peso = peso;
            return this;
        }

        public ProductoBuilder capacidad(String capacidad) {
            this.capacidad = capacidad;
            return this;
        }

        public ProductoBuilder eficiencia(String eficiencia) {
            this.eficiencia = eficiencia;
            return this;
        }

        public ProductoBuilder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public ProductoBuilder garantia(int garantia) {
            this.garantia = garantia;
            return this;
        }

        public ProductoDto build() {
            return new ProductoDto(this);
        }
    }
}

