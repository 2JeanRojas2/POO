package com.company;

public class PelotaFutbol extends Producto {
    private Double radio;

    public PelotaFutbol() {
    }

    public PelotaFutbol(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        return null;
    }
}
