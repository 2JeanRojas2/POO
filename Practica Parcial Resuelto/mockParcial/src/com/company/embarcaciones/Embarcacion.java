package com.company.embarcaciones;

import com.company.Capitan;

public abstract class Embarcacion {

    private Capitan capitan;
    private Double precioBase;
    private Double costoAdicional;
    private Integer anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double costoAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.costoAdicional = costoAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }


    public Double calcularPrecioAlquiler(){
        Double precioFinal = this.precioBase;

        if(anioFabricacion > 2020) {
            precioFinal += costoAdicional;
        }

        return precioFinal;
    }


}
