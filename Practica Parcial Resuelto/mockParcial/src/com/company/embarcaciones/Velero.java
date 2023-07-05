package com.company.embarcaciones;

public class Velero extends Embarcacion {

    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double costoAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, costoAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande(){

        return cantidadMastiles > 4;
    }
}
