package com.company;

public class Caja extends Producto {
    private Double longitud;
    private Double alto;
    private Double ancho;

    public Caja() {
    }

    public Caja(Double peso) {
        super(peso);
    }

    public Caja(Double longitud, Double alto, Double ancho) {
        this.longitud = longitud;
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public Double calcularEspacio() {
        return null;
    }
}
