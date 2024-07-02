package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.ProductoDto;
import org.doo.dto.ProductoDto.ProductoBuilder;

import java.util.List;

public class Producto extends Modelo {
    private final ProductoDao productoDao;

    public Producto() {
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
    }
    
    public List<ProductoDto> listar() {
        List<ProductoDto> productoDtoList = (List<ProductoDto>) productoDao.listarTodos();
        return productoDtoList;
    }
    
    public boolean crear(ProductoDto builder) {
        return productoDao.insertar(builder);
    }
    
    public boolean chequearProductoDuplicado(ProductoDto producto ){
         return productoDao.chequearDuplicado(producto);
    }
    
    public List<ProductoDto> buscarProducto(String nombreProducto){
        return productoDao.listarPorNombre(nombreProducto);
    }
    public boolean editarPrecio(int idProducto, float nuevoPrecio){
        return productoDao.editarPrecio(idProducto, nuevoPrecio);
    }
    public boolean borrar(int id) {
        return productoDao.borrar(id);
    }

    @Override
    protected void finalize() throws Throwable {
        productoDao.cerrarConexion();
    }
}
