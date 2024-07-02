package org.doo.dao;
import org.doo.dto.ProductoDto;
import org.doo.dto.DetallePedidoDto;
import java.util.List;

public interface ProductoDao<T> extends Dao<T> {
    
   public List<ProductoDto> listarPorNombre(String nombre);
   public boolean chequearDuplicado(ProductoDto productoDto);
   public boolean editarPrecio(int idProducto, float nuevoPrecio);
   public boolean editarStockProducto(List<DetallePedidoDto> detallePedidoList);
}
