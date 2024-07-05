package org.doo;

import org.doo.dao.ProductoDao;
import org.doo.model.Producto;
import org.doo.model.Producto.ProductoBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ProductoTest {
    @Mock
    private ProductoDao productoDao;

    private Producto producto;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        producto = new Producto.ProductoBuilder(1, "Producto1", 100.0f, 10).build();
        producto.productoDao = productoDao;
    }

    @Test
    public void testInsertarProducto() {
        Producto nuevoProducto = new Producto.ProductoBuilder(2, "Producto2", 150.0f, 20).build();
        when(productoDao.insertar(any(Producto.class))).thenReturn(true);

        boolean resultado = producto.insertar(nuevoProducto);

        assertTrue(resultado);
    }

    @Test
    public void testChequearProductoDuplicado() {

        Producto nuevoProducto = new Producto.ProductoBuilder(2, "Producto2", 150.0f, 20).build();
        when(productoDao.chequearDuplicado(any(Producto.class))).thenReturn(false);

        boolean esDuplicado = producto.chequearProductoDuplicado(nuevoProducto);

        assertFalse(esDuplicado);
    }
}
