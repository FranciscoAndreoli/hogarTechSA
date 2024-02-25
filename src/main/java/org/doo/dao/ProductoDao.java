package org.doo.dao;
import org.doo.dto.ProductoDto;
import org.doo.dto.ProductoDto.ProductoBuilder;
import java.util.List;

public interface ProductoDao<T> extends Dao<T> {
    
   public boolean chequearDuplicado(ProductoDto productoDto);
}
