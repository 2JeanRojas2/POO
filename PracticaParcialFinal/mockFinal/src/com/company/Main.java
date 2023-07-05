package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Instituto instituto = new Instituto();

        instituto.agregarOferta(OfertaAcademicaFactory.FRONT_END);
        instituto.agregarOferta(OfertaAcademicaFactory.BACK_END);
        instituto.agregarOferta(OfertaAcademicaFactory.FULL_STACK);


        instituto.generarInforme();
    }
}
