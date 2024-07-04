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
        List<ClienteDto> clienteDtoList = ((Cliente) this.MODELO).listarTodos();
        for (ClienteDto clienteDto : clienteDtoList) {
            modeloTabla.addRow(new Object[]{clienteDto.getId(), clienteDto.getNombre(),clienteDto.getApellido(), clienteDto.getDni(), clienteDto.getNumTelefono(), clienteDto.getDomicilio()});
        }
    }
      public boolean chequearCliente(String dni){
        return ((Cliente) this.MODELO).chequearClientExista(dni);
      }
      
     public boolean updateCliente(String dni, String nombre, String apellido, String direccion, String telefono) {
        return ((Cliente) this.MODELO).updateCliente(dni, nombre, apellido, direccion, telefono);
     }
 
     public boolean createCliente(String dni, String nombre, String apellido, String direccion, String telefono) {
        return ((Cliente) this.MODELO).createCliente(dni, nombre, apellido, direccion, telefono);
     }
     
     public boolean deleteCliente(String dni){

        return ((Cliente) this.MODELO).deleteCliente(dni);
     }

}



