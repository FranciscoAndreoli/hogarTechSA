package org.doo.model;

import org.doo.dao.FabricaDao;
import org.doo.dao.PersonaDao;
import org.doo.dto.PersonaDto;

import java.util.Date;
import java.util.List;

public class Persona extends Modelo {

    private final PersonaDao personaDao;

    public Persona() {
        personaDao = (PersonaDao) FabricaDao.getDao("PersonaDaoImpl");
    }
    public List<PersonaDto> listar() {
        List<PersonaDto> personaDtoList = (List<PersonaDto>) personaDao.listarTodos();
        return personaDtoList;
    }

    public boolean guardar(String nombre, String apellido, Date fechaNac, int dni, String domicilio) {
        PersonaDto personaDto = new PersonaDto.Builder()
                .nombre(nombre)
                .apellido(apellido)
                .fechaNac(fechaNac)
                .dni(dni)
                .domicilio(domicilio)
                .build();
        return personaDao.insertar(personaDto);
    }

    public boolean modificar(int id, String nombre, String apellido, Date fechaNac, int dni, String domicilio) {
        PersonaDto personaDto = new PersonaDto.Builder()
                .id(id)
                .nombre(nombre)
                .apellido(apellido)
                .fechaNac(fechaNac)
                .dni(dni)
                .domicilio(domicilio)
                .build();
        return personaDao.modificar(personaDto);
    }

    public boolean borrar(int id) {
        return personaDao.borrar(id);
    }
    
    public boolean chequearUsuario(int id){
        return personaDao.personaExists(id);
    }
}
