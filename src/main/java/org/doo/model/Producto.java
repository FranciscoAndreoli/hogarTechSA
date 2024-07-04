package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.ProductoDto;
import org.doo.dto.ProductoDto.ProductoBuilder;

import java.util.List;

public class Producto extends Modelo {
    private int idProducto;
    private String nombre;
    private float precio;
    private String marca;
    private String modelo;
    private String color;
    private int stock;
    private String dimension;
    private String origen;
    private String peso;
    private String capacidad;
    private String eficiencia;
    private String descripcion;
    private int garantia;

    private final ProductoDao productoDao;

    public Producto() {
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
    }

    private Producto(ProductoBuilder builder) {
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

        this.productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
    }

    // Getters y Setters

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getStock() {
        return stock;
    }

    public String getDimension() {
        return dimension;
    }

    public String getOrigen() {
        return origen;
    }

    public String getPeso() {
        return peso;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getGarantia() {
        return garantia;
    }

    // Métodos de la clase Producto
    public List<ProductoDto> listar() {
        return productoDao.listarTodos();
    }

    public boolean crear(Producto producto) {
        return productoDao.insertar(producto);
    }

    public boolean chequearProductoDuplicado(ProductoDto producto) {
        return productoDao.chequearDuplicado(producto);
    }

    public List<ProductoDto> buscarProducto(String nombreProducto) {
        return productoDao.listarPorNombre(nombreProducto);
    }

    public boolean editarPrecio(int idProducto, float nuevoPrecio) {
        return productoDao.editarPrecio(idProducto, nuevoPrecio);
    }

    public boolean borrar(int id) {
        return productoDao.borrar(id);
    }

    @Override
    protected void finalize() throws Throwable {
        productoDao.cerrarConexion();
    }

    public static class ProductoBuilder implements IBuilder {
        private int idProducto;
        private String nombre;
        private float precio;
        private String marca;
        private String modelo;
        private String color;
        private int stock;
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

        @Override
        public ProductoBuilder buildNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        @Override
        public ProductoBuilder buildPrecio(float precio) {
            this.precio = precio;
            return this;
        }

        @Override
        public ProductoBuilder buildMarca(String marca) {
            this.marca = marca;
            return this;
        }

        @Override
        public ProductoBuilder buildModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        @Override
        public ProductoBuilder buildColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public ProductoBuilder buildStock(int stock) {
            this.stock = stock;
            return this;
        }

        @Override
        public ProductoBuilder buildDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        @Override
        public ProductoBuilder buildOrigen(String origen) {
            this.origen = origen;
            return this;
        }

        @Override
        public ProductoBuilder buildPeso(String peso) {
            this.peso = peso;
            return this;
        }

        @Override
        public ProductoBuilder buildCapacidad(String capacidad) {
            this.capacidad = capacidad;
            return this;
        }

        @Override
        public ProductoBuilder buildEficiencia(String eficiencia) {
            this.eficiencia = eficiencia;
            return this;
        }

        @Override
        public ProductoBuilder buildDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        @Override
        public ProductoBuilder buildGarantia(int garantia) {
            this.garantia = garantia;
            return this;
        }

        @Override
        public Producto build() {
            return new Producto(this);
        }
    }
}

