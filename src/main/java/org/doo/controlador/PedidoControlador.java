package org.doo.controlador;

import org.doo.dto.PedidoDto;
import org.doo.dto.ProductoDto;
import org.doo.dto.ClienteDto;
import org.doo.model.IDetallePedido;
import org.doo.model.Modelo;
import org.doo.model.Pedido;
import org.doo.vista.InterfazVistaAbm;

import javax.swing.table.DefaultTableModel;

import java.util.List;
import org.doo.dto.DetallePedidoDto;

public class PedidoControlador extends Controlador {
    

    
    public PedidoControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
        
    }
    public void cargarProductos(DefaultTableModel modeloTabla) {
        
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ProductoDto> productoDtoList = ((Pedido) this.MODELO).listarProductos();
        for (ProductoDto productoDto : productoDtoList) {
            modeloTabla.addRow(new Object[]{false, 1, productoDto.getIdProducto(), productoDto.getNombre(), productoDto.getMarca(),
                                            productoDto.getModelo(), productoDto.getPrecio(), productoDto.getStock(), false, false});
        }
    }
    
    public void cargarPedidos(DefaultTableModel modeloTabla){
        
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<PedidoDto> pedidoDtoList = ((Pedido) this.MODELO).listarPedidos();
        for (PedidoDto pedidoDto : pedidoDtoList) { 
            modeloTabla.addRow(new Object[]{ pedidoDto.getIdPedido(), pedidoDto.getNombreCliente(), pedidoDto.getDni() ,
                                            pedidoDto.getFecha(), pedidoDto.getLegajoEmpleado(), pedidoDto.getStatus(), pedidoDto.getImporte() });
        }
        
    }
    public void cargarDetallePedido(DefaultTableModel modelotblDetallePedido){
        modelotblDetallePedido.setRowCount(0);
        modelotblDetallePedido.fireTableDataChanged();
        List<IDetallePedido> detallePedidoDtoList = ((Pedido) this.MODELO).listarDetallePedido();
        for (IDetallePedido detalleDto : detallePedidoDtoList) {
            modelotblDetallePedido.addRow(new Object[]{ detalleDto.getIdPedido(), detalleDto.getidProducto(), detalleDto.getNombreProducto() ,detalleDto.getCantidad() ,
                    detalleDto.getPrecioUnitario(), detalleDto.getPrecioTotal()});
        }
    }
    public void cargarListadoPedidos(DefaultTableModel modeloTabla, List<PedidoDto> pedidosDtoList){
        
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        for (PedidoDto pedidoDto : pedidosDtoList) { 
            modeloTabla.addRow(new Object[]{ pedidoDto.getIdPedido(), pedidoDto.getNombreCliente(), pedidoDto.getDni() ,
                                            pedidoDto.getFecha(), pedidoDto.getLegajoEmpleado(), pedidoDto.getStatus(), pedidoDto.getImporte() });
        }
        
    }

    public void cargarListadoDetallePedido(DefaultTableModel modeloTabla, List<DetallePedidoDto> detallePedidoDtoList){
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        for (DetallePedidoDto detalleDto : detallePedidoDtoList) {
            modeloTabla.addRow(new Object[]{ detalleDto.getIdPedido(), detalleDto.getidProducto(), detalleDto.getNombreProducto(), detalleDto.getCantidad() ,
                    detalleDto.getPrecioUnitario(), detalleDto.getPrecioTotal()});
        }
    }
    public void cargarListadoProductos(DefaultTableModel modeloTabla, List<ProductoDto> listadoProductos){
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        for (ProductoDto productoDto : listadoProductos) {
            modeloTabla.addRow(new Object[]{false, 1, productoDto.getIdProducto(), productoDto.getNombre(), productoDto.getPrecio(),
                                            productoDto.getMarca(), productoDto.getModelo(), productoDto.getStock() });
        }
    }
    public List<PedidoDto> buscarPedidos(String dniCliente){
        return ((Pedido) this.MODELO).buscarPedidos(dniCliente);
    }
    public PedidoDto buscarPedidoPorID(int idPedido){
        return ((Pedido) this.MODELO).buscarPedidoPorID(idPedido);
    }
    
    public List<ProductoDto> buscarProducto(String nombreProducto){
        return ((Pedido) this.MODELO).buscarProducto(nombreProducto);
    }
    
    public List<DetallePedidoDto> buscarDetallePedido(int idPedido){
        return ((Pedido) this.MODELO).buscarDetallePedido(idPedido);
    }
    
    public boolean crearPedido(PedidoDto pedidoDto, List<IDetallePedido> detallePedidoList) {
        int idPedido = ((Pedido) this.MODELO).crearPedido(pedidoDto);
        
        if(idPedido != -1){
            return ((Pedido) this.MODELO).crearDetallePedido(detallePedidoList, idPedido);
        }
        
        return false;
    }
    public boolean updateEstadoPedido(int id, String estadoPedido){
        return ((Pedido) this.MODELO).updateEstadoPedido(id, estadoPedido);
    }
    
    public boolean editarStockProducto(List<IDetallePedido> detallePedidoList){
        return ((Pedido) this.MODELO).editarStockProducto(detallePedidoList);
    }
     public boolean modificar(Integer producto, Integer cantidad, String cliente, String status) {
         return ((Pedido) this.MODELO).modificar(producto, cantidad, cliente.toUpperCase(), status.toUpperCase());
     }
    public boolean borrar(int id) {
        return ((Pedido) this.MODELO).borrar(id);
    }
    public ClienteDto traerCliente(int dniCliente){
         return ((Pedido) this.MODELO).traerCliente(dniCliente);
    }
    public ClienteDto traerClientePorId(int id){
        return ((Pedido) this.MODELO).traerClientePorId(id);
    }
}
