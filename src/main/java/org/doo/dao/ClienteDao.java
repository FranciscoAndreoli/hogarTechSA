package org.doo.dao;

public interface ClienteDao<T> extends Dao<T>{
    
    public boolean chequearCliente(String dni);
    public boolean create(T entity);
    public boolean update(String dni, String nombre, String apellido, String direccion, String telefono);
    public boolean delete(String dni);
}

