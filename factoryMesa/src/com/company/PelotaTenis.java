package com.company;

public class PelotaTenis extends Producto{
    private Double radio;

    public PelotaTenis() {
    }

    public PelotaTenis(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        return null;
    }
}
