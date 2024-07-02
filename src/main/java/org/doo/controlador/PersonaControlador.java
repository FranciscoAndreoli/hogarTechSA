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


}
