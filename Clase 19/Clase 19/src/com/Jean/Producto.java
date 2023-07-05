package com.Jean;

public abstract class Producto {
    private Double peso;

    public Producto(Double peso) {
        this.peso = peso;
    }

    public Producto() {
    }

    public abstract Double calcularEspacio();
}
