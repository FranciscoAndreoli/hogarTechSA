package org.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import org.doo.dto.ClienteDto;
import org.doo.dto.PedidoDto;
import org.doo.model.Cliente;
import org.doo.model.Modelo;
import org.doo.model.Pedido;
import org.doo.vista.InterfazVistaAbm;

public class ClienteControlador extends Controlador{
    
    public ClienteControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ClienteDto> clienteDtoList = ((Cliente) this.MODELO).listar();
        for (ClienteDto clienteDto : clienteDtoList) {
            modeloTabla.addRow(new Object[]{clienteDto.getId(), clienteDto.getNombre(),clienteDto.getApellido(), clienteDto.getDni(), clienteDto.getNumTelefono(), clienteDto.getDomicilio()});
        }
    }
      public boolean chequearCliente(String dni){
        return ((Cliente) this.MODELO).chequearCliente(dni);
      }
      
     public boolean updateCliente(String dni, String nombre, String apellido, String direccion, String telefono) {
        return ((Cliente) this.MODELO).update(dni, nombre, apellido, direccion, telefono);
     }
 
     public boolean createCliente(String dni, String nombre, String apellido, String direccion, String telefono) {
        return ((Cliente) this.MODELO).create(dni, nombre, apellido, direccion, telefono);
     }
     
     public boolean deleteCliente(String dni){
         return ((Cliente) this.MODELO).delete(dni);
     }
   /* public boolean guardar(Integer producto, Integer cantidad, String cliente, String status) {
        return ((Pedido) this.MODELO).guardar(producto, cantidad, cliente, status);
    }

    public boolean borrar(int id) {
        return ((Pedido) this.MODELO).borrar(id);
    }*/
}



