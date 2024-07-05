package org.doo.controlador;

import org.doo.dto.PedidoDto;
import org.doo.model.*;
import org.doo.dto.ClienteDto;
import org.doo.services.EnumEnvoltorioRegalo;
import org.doo.services.EnumGarantiaExtendida;
import org.doo.vista.InterfazVistaAbm;

import javax.swing.table.DefaultTableModel;

import java.util.List;
import org.doo.dto.DetallePedidoDto;

public class PedidoControlador extends Controlador {
    
    private Pago pago;
    
    public PedidoControlador(InterfazVistaAbm vista, Modelo modelo, Pago pago) {
        VISTA = vista;
        MODELO = modelo;
        this.pago = pago;
    }
    public void cargarProductos(DefaultTableModel modeloTabla) {
        
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<Producto> productoList = ((Pedido) this.MODELO).listarProductos();
        for (Producto producto : productoList) {
            modeloTabla.addRow(new Object[]{false, 1, producto.getIdProducto(), producto.getNombre(), producto.getMarca(),
                    producto.getModelo(), producto.getPrecio(), producto.getStock(), false, false});
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
    public void cargarListadoProductos(DefaultTableModel modeloTabla, List<Producto> listadoProductos){
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        for (Producto producto : listadoProductos) {
            modeloTabla.addRow(new Object[]{false, 1, producto.getIdProducto(), producto.getNombre(), producto.getPrecio(),
                    producto.getMarca(), producto.getModelo(), producto.getStock() });
        }
    }
    public IDetallePedido crearDetallePedido(int idProducto, String nombreProducto, int cantidad, float precioUnitario, boolean isGarantiaChecked, boolean isEnvoltorioChecked){
        IDetallePedido detallePedido = new DetallePedidoDto( -1, idProducto, nombreProducto, cantidad, precioUnitario, cantidad * precioUnitario);

        if (isGarantiaChecked) {
            detallePedido = new GarantiaExtendidaDecorator(detallePedido, EnumGarantiaExtendida.UN_ANIO.getPrecio());
        }

        if (isEnvoltorioChecked) {
            detallePedido = new EnvoltorioRegaloDecorator(detallePedido, EnumEnvoltorioRegalo.BASICO.getPrecio());
        }
        return detallePedido;
    }


    public List<PedidoDto> buscarPedidos(String dniCliente){
        return ((Pedido) this.MODELO).buscarPedidos(dniCliente);
    }
    public PedidoDto buscarPedidoPorID(int idPedido){
        return ((Pedido) this.MODELO).buscarPedidoPorID(idPedido);
    }
    
    public List<Producto> buscarProducto(String nombreProducto){
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

    public String procesarPago(String estadoPedido, String formaPago, int id){
        String result = "Pago no procesado";
        if(updateEstadoPedido(id, estadoPedido)) {
            PedidoDto pedido = buscarPedidoPorID(id);
            ClienteDto cliente = traerClientePorId(pedido.getIdCliente());
            List<DetallePedidoDto> detallePedidoList = buscarDetallePedido(pedido.getIdPedido());
            result = this.pago.confirmarPago(cliente, pedido, detallePedidoList, formaPago);
        }
        return result;
    }

}
