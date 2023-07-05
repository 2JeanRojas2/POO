package com.jmadruga;

import java.util.ArrayList;
import java.util.List;

public class CompuestoDeFiguras implements FiguraAreaCalculable{
    private String nombre;
    private List<FiguraAreaCalculable> figuras;

    public CompuestoDeFiguras(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraAreaCalculable figura) {
        this.figuras.add(figura);
    }

    @Override
    public Double calcularArea() {
        Double areaTotal = 0.0;
        for (FiguraAreaCalculable figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
