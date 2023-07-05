package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empleado empleado = empleadoFactory.crearEmpleado("EMP-INT");


    }
}
