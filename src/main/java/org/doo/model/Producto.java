package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.ProductoDto;

import java.util.List;


public class Producto extends Modelo {
    private final ProductoDao productoDao;

    public Producto() {
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
    }

    public ProductoDao buscar(String nombre, String apellido) {
        ProductoDao productoDao1 = (ProductoDao) productoDao.buscar(new ProductoDto.Builder().setIdProducto(-1).setNombre(nombre));
        return productoDao1;
    }

    public ProductoDao buscar(int id) {
        ProductoDao productoDao1 = (ProductoDao) productoDao.buscar(id);
        return productoDao1;
    }

    public int mayorId() {
        return productoDao.mayorId();
    }

    public List<ProductoDto> listar() {
        List<ProductoDto> productoDtoList = (List<ProductoDto>) productoDao.listarTodos();
        return productoDtoList;
    }

    public boolean guardar(String nombre, Double precio, String marca, String modelo, String color, Integer stock) {
        ProductoDto productoDto = new ProductoDto.Builder()
                .setNombre(nombre)
                .setPrecio(precio)
                .setColor(color)
                .setMarca(marca)
                .setModelo(modelo)
                .setStock(stock)
                .build(); // This creates a ProductoDto instance

        return productoDao.insertar(productoDto);
    }

    public boolean modificar(int id, String nombre, Double precio, String marca, String modelo, String color, Integer stock) {
        ProductoDto productoDto = new ProductoDto.Builder()
                .setIdProducto(id)
                .setNombre(nombre)
                .setPrecio(precio)
                .setColor(color)
                .setMarca(marca)
                .setModelo(modelo)
                .setStock(stock)
                .build(); // This creates a ProductoDto instance

        return productoDao.modificar(productoDto);
    }

    public boolean borrar(int id) {
        return productoDao.borrar(id);
    }

    @Override
    protected void finalize() throws Throwable {
        productoDao.cerrarConexion();
    }
}
