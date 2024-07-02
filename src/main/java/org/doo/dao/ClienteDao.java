package org.doo.dao;
import org.doo.dto.ClienteDto;

public interface ClienteDao<T> extends Dao<T>{
    
    public boolean chequearCliente(String dni);
    public ClienteDto buscarCliente(int dni);
    public ClienteDto buscarPorID(int id);
    public boolean create(T entity);
    public boolean update(String dni, String nombre, String apellido, String direccion, String telefono);
    public boolean delete(String dni);
}

