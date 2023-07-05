package com.jmadruga;

public class Triangulo implements FiguraAreaCalculable{
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }
}
