package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.ClienteDao;
import org.doo.dao.PedidoDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.PedidoDto;
import org.doo.dto.ClienteDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.dto.ProductoDto;

import java.util.List;

public class Pedido extends Modelo {
    private final PedidoDao pedidoDao;
    private final ProductoDao productoDao;
    private final ClienteDao clienteDao;
    
    public Pedido(){
        pedidoDao = (PedidoDao) FabricaDao.getDao("PedidoDaoImpl");
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
        clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImpl");
    }
    
    public PedidoDto buscar(String nombre, String apellido) {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    public PedidoDao buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public PedidoDto buscarPedidoPorID(int idPedido){
        return (PedidoDto) pedidoDao.buscar(idPedido);
    }
    public List<DetallePedidoDto> buscarDetallePedido(int idPedido)
    {
        return (List<DetallePedidoDto>) pedidoDao.buscarDetallePedido(idPedido);
    }
    public int mayorId() {
        return pedidoDao.mayorId();
    }

    public List<PedidoDto> listar() {
        List<PedidoDto> pedidoDtoList = (List<PedidoDto>) pedidoDao.listarTodos();
        return pedidoDtoList;
    }
    public List<ProductoDto> listarProductos() {
        List<ProductoDto> productoDtoList = (List<ProductoDto>) productoDao.listarTodos();
        return productoDtoList;
    }
    public List<PedidoDto> listarPedidos(){
         List<PedidoDto> pedidoDtoList = (List<PedidoDto>) pedidoDao.listarTodos();
         return pedidoDtoList;
    }

    public List<IDetallePedido> listarDetallePedido(){
        List<IDetallePedido> detallePedidoDtoList = (List<IDetallePedido>) pedidoDao.listarDetallePedido();
        return detallePedidoDtoList;
    }
    public int crearPedido(PedidoDto pedidoDto) {
        return pedidoDao.crearPedido(pedidoDto);
    }
    
    public boolean crearDetallePedido(List<IDetallePedido> detallePedidoList, int idPedido){
        return pedidoDao.crearDetallePedido(detallePedidoList, idPedido);
    }

    public boolean modificar(Integer producto, Integer cantidad, String cliente, String status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean borrar(int id) {
        return pedidoDao.borrar(id);
    }
    public List<PedidoDto> buscarPedidos(String dniCliente){
        return pedidoDao.buscarPedidos(dniCliente);
    }
    
    public List<ProductoDto> buscarProducto(String nombreProducto){
        return productoDao.listarPorNombre(nombreProducto);
    }
    
    public ClienteDto traerCliente(int dni){
        return clienteDao.buscarCliente(dni);
    }

    public ClienteDto traerClientePorId(int id){
        return clienteDao.buscarPorID(id);
    }

    public boolean updateEstadoPedido(int id, String estadoPedido){
        return pedidoDao.updateEstadoPedido(id, estadoPedido);
    }
    
    public boolean editarStockProducto(List<IDetallePedido> detallePedidoList){
        return productoDao.editarStockProducto(detallePedidoList);
    }
    @Override
    protected void finalize() throws Throwable {
        pedidoDao.cerrarConexion();
    }
}
