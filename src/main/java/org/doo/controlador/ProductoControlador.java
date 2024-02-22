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
            modeloTabla.addRow(new Object[]{productoDto.getIdProducto(), productoDto.getNombre(), productoDto.getModelo(),
                                            productoDto.getColor(), productoDto.getStock(), productoDto.getPrecio(), productoDto.getMarca() });
        }
    }
    public boolean guardar(String nombre, Double precio, String color ,String marca, String modelo, Integer stock) {
        return ((Producto) this.MODELO).guardar(nombre.toUpperCase(), precio, color, marca, modelo, stock);
    }

    public boolean modificar(int id, String nombre, Double precio, String marca, String modelo, String color, Integer stock) {
        return ((Producto) this.MODELO).modificar(id, nombre.toUpperCase(), precio, marca, modelo, color, stock);
    }

    public boolean borrar(int id) {
        return ((Producto) this.MODELO).borrar(id);
    }

   
}
