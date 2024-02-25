package org.doo.controlador;

import org.doo.dto.ProductoDto;
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

    public void cargarTodos(DefaultTableModel modeloTabla) {
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

    public boolean createProducto(String nombreProducto, float precioProducto,  int stockProducto, String marcaProducto, String modeloProducto,
                                  String colorProducto, String dimensionProducto, String origenProducto, String pesoProducto, String capacidadProducto,
                                  String eficienciaProducto, String descripcionProducto, int garantiaProducto) {
        
        ProductoDto.ProductoBuilder builder = new ProductoDto.ProductoBuilder(0, nombreProducto, precioProducto, stockProducto );

        if (!marcaProducto.isEmpty()) {
            builder.marca(marcaProducto);
        }
        if (!modeloProducto.isEmpty()) {
            builder.modelo(modeloProducto);
        }
        if (!colorProducto.isEmpty()) {
            builder.color(colorProducto);
        }
        if (!dimensionProducto.isEmpty()) {
            builder.dimension(dimensionProducto);
        }
        if (!origenProducto.isEmpty()) {
            builder.origen(origenProducto);
        }
        if (!pesoProducto.isEmpty()) {
            builder.peso(pesoProducto);
        }
        if (!capacidadProducto.isEmpty()) {
            builder.capacidad(capacidadProducto);
        }
        if (!eficienciaProducto.isEmpty()) {
            builder.eficiencia(eficienciaProducto);
        }
        if (!descripcionProducto.isEmpty()) {
            builder.descripcion(descripcionProducto);
        }
        if (garantiaProducto >= 0 ) {
            builder.garantia(garantiaProducto);
        }
        ProductoDto productoDto =  builder.build();
   
        
        
        return ((Producto) this.MODELO).crear(productoDto);
    }
    public boolean chequearProductoDuplicado(String nombre, String marca, String modelo, int stock, float precio){
        
        ProductoDto.ProductoBuilder producto = new ProductoDto.ProductoBuilder(0, nombre, precio, stock);
        producto.marca(marca);
        producto.modelo(modelo);
        ProductoDto productoDto = producto.build();
        
        return((Producto) this.MODELO).chequearProductoDuplicado(productoDto);
    }
    /*public boolean modificar(int id, String nombre, Double precio, String marca, String modelo, String color, Integer stock) {
        return ((Producto) this.MODELO).modificar(id, nombre.toUpperCase(), precio, marca, modelo, color, stock);
    }*/

    public boolean borrar(int id) {
        return ((Producto) this.MODELO).borrar(id);
    }

   
}
