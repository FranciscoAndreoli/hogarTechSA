package org.doo.services;
import org.doo.dto.LoginDto;
public class SessionManager {
    private static LoginDto empleadoActual;

    public static LoginDto getEmpleadoActual(){
        return empleadoActual;
    }

    public static void saveEmpleadoActual(LoginDto empleado){
        empleadoActual = empleado;
    }

}
