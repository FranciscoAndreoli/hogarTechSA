package org.doo.controlador;

import org.doo.dto.PersonaDto;
import org.doo.model.Modelo;
import org.doo.model.Persona;
import org.doo.vista.InterfazVistaAbm;

import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.List;

public class PersonaControlador extends Controlador {

    public PersonaControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<PersonaDto> personaDtoList = ((Persona) this.MODELO).listar();
        for (PersonaDto personaDto : personaDtoList) {
            modeloTabla.addRow(new Object[]{personaDto.getId(), personaDto.getNombre(), personaDto.getApellido(),
                                            personaDto.getFechaNac(), personaDto.getDni(), personaDto.getDomicilio()});
        }
    }

    public boolean guardar(String nombre, String apellido ,Date fechaNac, int dni, String domicilio) {
        return ((Persona) this.MODELO).guardar(nombre, apellido, fechaNac, dni, domicilio);
    }
    public boolean modificar(int id, String nombre, String apellido ,Date fechaNac, int dni, String domicilio) {
        return ((Persona) this.MODELO).modificar(id, nombre, apellido, fechaNac, dni, domicilio);
    }
    public boolean borrar(int id) {
        return ((Persona) this.MODELO).borrar(id);
    }
    
    public boolean chequearUsuario(int id){
         return ((Persona) this.MODELO).chequearUsuario(id);
    }
}
