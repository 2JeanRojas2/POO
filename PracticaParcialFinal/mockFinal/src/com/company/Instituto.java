package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        this.ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOferta(String codigo){
        try {
            ofertasAcademicas.add(OfertaAcademicaFactory.getInstance().generarOfertaAcademica(codigo));
        } catch (OfertaAcademicaFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            System.out.println("oferta: " + ofertaAcademica.getNombre() + " precio: " + ofertaAcademica.calcularPrecio());
        }
    }


}
