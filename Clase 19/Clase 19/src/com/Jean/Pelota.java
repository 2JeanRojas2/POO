package com.Jean;

public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double radio) {
        this.radio = radio;
    }

    public Pelota() {

    }

    public Double calcularEspacio(){
        return 4 * Math.PI * radio * radio * radio / 3;
    }
}
