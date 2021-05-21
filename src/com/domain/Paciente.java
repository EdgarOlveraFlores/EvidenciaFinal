
package com.domain;

/**
 *
 * @author olver
 */
public class Paciente extends Empleado{
    private String apellidos;
    
    //Get y set de la variable
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}