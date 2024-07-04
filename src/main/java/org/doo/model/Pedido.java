
package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.ClienteDao;
import org.doo.dao.PedidoDao;
import org.doo.dao.ProductoDao;
import org.doo.dto.PedidoDto;
import org.doo.dto.ClienteDto;
import org.doo.dto.DetallePedidoDto;
import org.doo.dto.ProductoDto;
import org.doo.model.DetallePedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Modelo {
    private final PedidoDao pedidoDao;
    private final ProductoDao productoDao;
    private final ClienteDao clienteDao;

    private int numPedido;
    private Cliente cliente;
    private String fecha;
    private Empleado empleado;
    private String estado;
    private float total;
    private List<DetallePedido> detallePedidos;
    //private Pago pago;
    
    public Pedido(){
        pedidoDao = (PedidoDao) FabricaDao.getDao("PedidoDaoImpl");
        productoDao = (ProductoDao) FabricaDao.getDao("ProductoDaoImpl");
        clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImpl");
    }

    public Pedido(int numPedido, Cliente cliente, String fecha, Empleado empleado, String estado, float total) {
        this();
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
        this.estado = estado;
        this.total = total;
        this.detallePedidos = new ArrayList<>();
    }

    public void addDetallePedido(Producto producto, int cantidad, float precioUnitario) {
        DetallePedido detallePedido = new DetallePedido(producto, cantidad, precioUnitario);
        detallePedidos.add(detallePedido);
        total += detallePedido.getSubtotal();
    }

    public void removeDetallePedido(DetallePedido detallePedido) {
        detallePedidos.remove(detallePedido);
        total -= detallePedido.getSubtotal();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<DetallePedido> getDetallePedido() {
        return detallePedidos;
    }

    public void setDetallePedido(List<DetallePedido> detallePedido) {
        this.detallePedidos = detallePedido;
    }

    @Override
    protected void finalize() throws Throwable {
        pedidoDao.cerrarConexion();
    }
}
