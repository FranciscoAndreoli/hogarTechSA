package org.doo.dao;
import java.util.List;
import org.doo.dto.PedidoDto;
import org.doo.dto.DetallePedidoDto;

public interface PedidoDao<T> extends Dao<T>{
    
    public List<PedidoDto> buscarPedidos(String dniCliente);
    public int crearPedido(T entidad);
    public boolean crearDetallePedido(List<DetallePedidoDto> detallePedidoList, int id);
    public List<DetallePedidoDto> buscarDetallePedido(int id);
    public List<DetallePedidoDto> listarDetallePedido();
    public boolean updateEstadoPedido(int id, String estadoPedido);
}
