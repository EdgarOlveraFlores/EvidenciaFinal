
package com.test;

import com.domain.*;

/**
 *
 * @author olver
 */
public class Principal {
    public static void main(String[] args) {
        Cliente paciente1 = new Cliente();
        paciente1.setNombreP("Edinho");
        paciente1.enfermarse();
        paciente1.agendarCita();
        paciente1.caminar();
        paciente1.entrarConsultorio();
        
        Doctor doctor1 = new Doctor();
        doctor1.setNombreD("Edgar");
        doctor1.llegarTarde("Edgar");
        doctor1.medicarPaciente("Edgar", "Edinho");
        System.out.println("");
        doctor1.horasExtra("Edagr");
        doctor1.agendarCita();
        paciente1.curarse();
    }
}
