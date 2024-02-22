package org.doo.dao;

import java.lang.reflect.InvocationTargetException;

public abstract class FabricaDao {

    public static Dao getDao(String nombreClase){
        try {
            return (Dao) Class.forName(FabricaDao.class.getPackageName() + "." + nombreClase).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException |
                 InvocationTargetException e) {
            System.err.println(e);
            throw new IllegalArgumentException("No se pudo crear la instancia DAO: " + nombreClase, e);
        }
    }
}

/*
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, 
mientras permite a las subclases alterar el tipo de objetos que se crearán.
*/
