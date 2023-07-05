package com.jmadruga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Contenedor contenedor1 = new Contenedor(1,"Argentina", true);
        Contenedor contenedor2 = new Contenedor(2,"Colombia", true);
        Contenedor contenedor3 = new Contenedor(3,"desconocido", true);
        Contenedor contenedor4 = new Contenedor(4,"Argentina", false);

        Puerto puerto = new Puerto();
        puerto.agregarContenedor(contenedor1);
        puerto.agregarContenedor(contenedor2);
        puerto.agregarContenedor(contenedor3);
        puerto.agregarContenedor(contenedor4);
        puerto.mostrarContenedoresOrdenados();

        System.out.println(puerto.cantidadDeContenedoresPeligrososProcedenciaDesconocida());
    }
}
