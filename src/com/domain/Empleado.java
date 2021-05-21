
package com.domain;

/**
 *
 * @author olver
 */
public class Empleado implements AccionesGlobales,AccionesDoctor{

    //Manipulacion de las horas
    private String numControl;
    //Get y set de la variable privada de la clase.
    public String getNumControl() {
        return numControl;
    }
    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    //Metodos propios de la clase
    public void horasExtra(String nombreD){
        System.out.println("El doctor: "+nombreD+" gano esta trabajando horas extra");
    }
    public void pensando(){
        System.out.println("El doctor esta pensando");
    }
    
    //Metodos abstractos al declarar interfaz "implements nomInterfaz" de ACCIONES GLOBALES
    @Override
    public void entrarConsultorio() {
        System.out.println("El doctor esta entrando al consultorio");
    }
    @Override
    public void agendarCita() {
        System.out.println("El doctor esta agendando una cita");
    }
    @Override
    public void caminar() {
        System.out.println("El doctor esta caminando");
    }

    //Metodos abstractos al declarar interfaz "implements nomInterfaz" de ACCIONES DOCTOR
    @Override
    public void llegarTarde(String nombreD) {
        System.out.println("El doctor: "+nombreD+" esta llegando tarde a la consulta");
    }
    @Override
    public void trabajarHorasExtra(String nombreD, String numControl) {
        System.out.println("El doctor: "+nombreD+" esta trabajando horas extra. Horas Totales: "+numControl);
    }
    @Override
    public void medicarPaciente(String nombreD, String nombreP) {
        System.out.println("El doctor: "+nombreD+" esta medicando al paciente: "+ nombreP);
    }
    
}
