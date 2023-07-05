package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = null;
        try {
            paciente = new Paciente("Juan","Perez","12345",new Date(121, Calendar.OCTOBER,21));
        } catch (PacienteException e) {
            e.printStackTrace();
        }
        try {
            paciente.darAlta(new Date(121,Calendar.OCTOBER,18));
        } catch (PacienteException e) {
            e.printStackTrace();
        }





    }


}
