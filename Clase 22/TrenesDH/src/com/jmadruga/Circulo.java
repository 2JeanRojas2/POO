package com.jmadruga;

public class Circulo implements FiguraAreaCalculable{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return radio * radio * Math.PI;
    }
}
