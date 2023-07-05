package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {

    private List<OfertaAcademica> ofertasAcademicas;
    private Double descuento;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        ofertasAcademicas = new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
       Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            precioTotal += ofertaAcademica.calcularPrecio();
        }
       return precioTotal - (precioTotal*descuento);
    }



}
