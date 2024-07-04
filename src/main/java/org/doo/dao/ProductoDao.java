package org.doo.dao;
import org.doo.dto.ProductoDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.model.Producto;

import java.util.List;

public interface ProductoDao<T> extends Dao<T> {
    
   public List<Producto> listarPorNombre(String nombre);
   public boolean chequearDuplicado(Producto producto);
   public boolean editarPrecio(int idProducto, float nuevoPrecio);
   public boolean editarStockProducto(List<DetallePedidoDto> detallePedidoList);
}
