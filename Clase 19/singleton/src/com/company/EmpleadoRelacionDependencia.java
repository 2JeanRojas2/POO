package com.company;

public class EmpleadoRelacionDependencia extends Empleado {

    private Double sueldoMensual;

    public EmpleadoRelacionDependencia() {
    }

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public Double calcularSueldo(Integer dias) {
        return null;
    }
}
