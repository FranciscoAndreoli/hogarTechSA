package org.doo.controlador;

import org.doo.dto.PedidoDto;
import org.doo.dto.ProductoDto;
import org.doo.model.Modelo;
import org.doo.model.Pedido;
import org.doo.model.Producto;
import org.doo.vista.InterfazVistaAbm;

import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.List;

public class PedidoControlador extends Controlador {

    public PedidoControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<PedidoDto> pedidoDtoList = ((Pedido) this.MODELO).listar();
        for (PedidoDto pedidoDto : pedidoDtoList) {
            modeloTabla.addRow(new Object[]{pedidoDto.getIdPedido(), pedidoDto.getProducto(),pedidoDto.getCantidad(), pedidoDto.getPrecioTotal(), pedidoDto.getFechaPedido(),
                    pedidoDto.getCliente() , pedidoDto.getIdEmpleado(),pedidoDto.getStatus()});
        }
    }
    public boolean guardar(Integer producto, Integer cantidad, String cliente, String status) {
        return ((Pedido) this.MODELO).guardar(producto, cantidad, cliente, status);
    }
    
     public boolean modificar(Integer producto, Integer cantidad, String cliente, String status) {
         return ((Pedido) this.MODELO).modificar(producto, cantidad, cliente.toUpperCase(), status.toUpperCase());
     }
    public boolean borrar(int id) {
        return ((Pedido) this.MODELO).borrar(id);
    }
}
