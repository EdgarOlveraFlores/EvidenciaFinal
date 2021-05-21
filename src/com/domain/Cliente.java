
package com.domain;

/**
 *
 * @author olver
 */
public class Cliente implements AccionesGlobales{
    private String nombreP;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    
    
    //Metodos propios de la clase
    public void enfermarse(){
        System.out.println("El paciente: "+nombreP+" se encuentra enfermo");
    }
    public void curarse(){
        System.out.println("El paciente: "+nombreP+" se ha recuperado de su enfermedad");
    }
    public void tratamiento(){
        System.out.println("El paciente: "+nombreP+" esta en tratamiento por el momento");
    }
    
    //Metodos heredados de la interfaz accionesGlobales
    @Override
    public void entrarConsultorio() {
        System.out.println("El paciente "+nombreP+", esta entrando al consultorio");
    }
    @Override
    public void agendarCita() {
        System.out.println("El paciente "+nombreP+", esta agendando una cita para la siguiente semana");
    }
    @Override
    public void caminar() {
        System.out.println("El paciente: "+nombreP+", esta caminando hacia el consultorio");
    }
    
}
