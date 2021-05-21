
package com.domain;

/**
 *
 * @author olver
 */
public interface AccionesDoctor {
    //Acciones que heredan la clase doctor
    public void llegarTarde(String nombreD);
    public void trabajarHorasExtra(String nombreD, String numControl);
    public void medicarPaciente(String nombreD, String nombreP);
    
}
