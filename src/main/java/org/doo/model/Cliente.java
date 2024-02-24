package org.doo.model;
import org.doo.dao.ClienteDao;
import org.doo.dao.FabricaDao;
import org.doo.dao.PedidoDao;
import org.doo.dto.ClienteDto;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona {
    private int idCliente;
    private List<Pedido> pedidos;
    private final ClienteDao clienteDao;

    public Cliente(){
        super();
        clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImpl");
    }

    public Cliente(String nombre, String apellido, String dni, String domicilio, String numTelefono, int idCliente, ClienteDao clienteDao) {
        super(nombre, apellido, dni, domicilio, numTelefono);
        this.idCliente = idCliente;
        this.clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImpl");
        this.pedidos = new ArrayList<>();
    }

    public List<ClienteDto> listar() {
        List<ClienteDto> clienteDtoList = (List<ClienteDto>) clienteDao.listarTodos();
        return clienteDtoList;
    }

    public boolean chequearCliente(String dni){
        return clienteDao.chequearCliente(dni);
    }

    public boolean update(String dni, String nombre, String apellido, String direccion, String telefono){
        return clienteDao.update(dni, nombre, apellido, direccion, telefono);
    }

    public boolean create(String dni, String nombre, String apellido, String direccion, String telefono){
        ClienteDto clienteDto = new ClienteDto(apellido, nombre, telefono, dni, direccion, null);
        return clienteDao.create(clienteDto);
    }
    
    public boolean delete(String dni){
        return clienteDao.delete(dni);
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Métodos para manipular la lista de pedidos
    public void addPedido(Pedido pedido) {
        if (pedidos == null) {
            pedidos = new ArrayList<>();
        }
        pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido) {
        if (pedidos != null) {
            pedidos.remove(pedido);
        }
    }

}
