package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        this.fechaInternacion=fechaInternacion;
        if (fechaInternacion.before(hoy))
            throw new PacienteException("Fecha Invalida");
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException
    {
        if (fechaAlta.after(fechaInternacion) ) {
            this.fechaAlta = fechaAlta;
            System.out.println("Ok");
        }else {
            throw new PacienteException("La fecha de alta es anterior a la fecha de ingreso");
        }

    }


}
