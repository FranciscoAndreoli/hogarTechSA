package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.PedidoDao;
import org.doo.dto.PedidoDto;
import java.util.Date;

import java.util.List;

public class Pedido extends Modelo {
    private final PedidoDao pedidoDao;
    public Pedido(){
        pedidoDao = (PedidoDao) FabricaDao.getDao("PedidoDaoImpl");
    }
    public PedidoDto buscar(String nombre, String apellido) {
        PedidoDto pedidoDto1 = (PedidoDto) pedidoDao.buscar(new PedidoDto.Builder().setIdPedido(-1));
        return pedidoDto1;
    }

    public PedidoDao buscar(int id) {
        PedidoDao pedidoDao1 = (PedidoDao) pedidoDao.buscar(id);
        return pedidoDao1;
    }

    public int mayorId() {
        return pedidoDao.mayorId();
    }

    public List<PedidoDto> listar() {
        List<PedidoDto> pedidoDtoList = (List<PedidoDto>) pedidoDao.listarTodos();
        return pedidoDtoList;
    }

    public boolean guardar(Integer producto, Integer cantidad, String cliente, String status) {
        PedidoDto pedidoDto = new PedidoDto.Builder()
                .setProducto(producto)
                .setCantidad(cantidad)
                .setCliente(cliente)
                .setStatus(status)
                .build();

        return pedidoDao.insertar(pedidoDto);
    }

    public boolean modificar(Integer producto, Integer cantidad, String cliente, String status) {
        PedidoDto pedidoDto = new PedidoDto.Builder()
                .setProducto(producto)
                .setCantidad(cantidad)
                .setCliente(cliente)
                .setStatus(status)
                .build(); 
        return pedidoDao.modificar(pedidoDto);
    }

    public boolean borrar(int id) {
        return pedidoDao.borrar(id);
    }

    @Override
    protected void finalize() throws Throwable {
        pedidoDao.cerrarConexion();
    }
}
