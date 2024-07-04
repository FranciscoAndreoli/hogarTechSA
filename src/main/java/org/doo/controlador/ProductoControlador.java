package org.doo.controlador;

import org.doo.dto.ProductoDto;
import org.doo.model.Producto.ProductoBuilder;
import org.doo.model.Modelo;
import org.doo.model.Producto;
import org.doo.vista.InterfazVistaAbm;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ProductoControlador extends Controlador {

    public ProductoControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    public void cargarTodos(DefaultTableModel modeloTabla){
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ProductoDto> productoDtoList = ((Producto) this.MODELO).listar();
        for (ProductoDto productoDto : productoDtoList) {
            modeloTabla.addRow(new Object[]{productoDto.getIdProducto(), productoDto.getNombre(), productoDto.getPrecio(),
                                            productoDto.getMarca(), productoDto.getModelo(), productoDto.getColor(),
                                            productoDto.getDimension(), productoDto.getOrigen(), productoDto.getPeso(),
                                            productoDto.getCapacidad(), productoDto.getEficiencia(), productoDto.getDescripcion(),
                                            productoDto.getGarantia(), productoDto.getStock() });
        }
    }
    public void cargarListado(DefaultTableModel modeloTabla, List<ProductoDto> productoDtoList){
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        for (ProductoDto productoDto : productoDtoList) {
            modeloTabla.addRow(new Object[]{productoDto.getIdProducto(), productoDto.getNombre(), productoDto.getPrecio(),
                                            productoDto.getMarca(), productoDto.getModelo(), productoDto.getColor(),
                                            productoDto.getDimension(), productoDto.getOrigen(), productoDto.getPeso(),
                                            productoDto.getCapacidad(), productoDto.getEficiencia(), productoDto.getDescripcion(),
                                            productoDto.getGarantia(), productoDto.getStock() });
        }
    }
    
    public boolean createProducto(String nombreProducto, float precioProducto,  int stockProducto, String marcaProducto, String modeloProducto,
                                  String colorProducto, String dimensionProducto, String origenProducto, String pesoProducto, String capacidadProducto,
                                  String eficienciaProducto, String descripcionProducto, int garantiaProducto) {
        
        Producto.ProductoBuilder builder = new Producto.ProductoBuilder(0, nombreProducto, precioProducto, stockProducto );

        if (!marcaProducto.isEmpty()) {
            builder.buildMarca(marcaProducto);
        }
        if (!modeloProducto.isEmpty()) {
            builder.buildModelo(modeloProducto);
        }
        if (!colorProducto.isEmpty()) {
            builder.buildColor(colorProducto);
        }
        if (!dimensionProducto.isEmpty()) {
            builder.buildDimension(dimensionProducto);
        }
        if (!origenProducto.isEmpty()) {
            builder.buildOrigen(origenProducto);
        }
        if (!pesoProducto.isEmpty()) {
            builder.buildPeso(pesoProducto);
        }
        if (!capacidadProducto.isEmpty()) {
            builder.buildCapacidad(capacidadProducto);
        }
        if (!eficienciaProducto.isEmpty()) {
            builder.buildEficiencia(eficienciaProducto);
        }
        if (!descripcionProducto.isEmpty()) {
            builder.buildDescripcion(descripcionProducto);
        }
        if (garantiaProducto >= 0 ) {
            builder.buildGarantia(garantiaProducto);
        }
        Producto producto =  builder.build();
   
        
        
        return ((Producto) this.MODELO).crear(producto);
    }
    public boolean chequearProductoDuplicado(String nombre, String marca, String modelo, int stock, float precio){
        
        ProductoDto.ProductoBuilder producto = new ProductoDto.ProductoBuilder(0, nombre, precio, stock);
        producto.marca(marca);
        producto.modelo(modelo);
        ProductoDto productoDto = producto.build();
        
        return((Producto) this.MODELO).chequearProductoDuplicado(productoDto);
    }
    public List<ProductoDto> buscarProducto(String nombreProducto) {
        return ((Producto) this.MODELO).buscarProducto(nombreProducto);
    }
    
    public boolean editarPrecio(int idProducto, float nuevoPrecio){
        return ((Producto) this.MODELO).editarPrecio(idProducto, nuevoPrecio);
    }

    public boolean borrar(int id) {
        return ((Producto) this.MODELO).borrar(id);
    }

   
}
