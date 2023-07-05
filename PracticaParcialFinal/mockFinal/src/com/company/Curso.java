package com.company;

public class Curso extends OfertaAcademica {

    private Integer horasMensuales;
    private Integer duracionMeses;
    private Double precioPorHora;

    public Curso(String nombre, String descripcion, Integer horasMensuales, Integer duracionMeses, Double precioPorHora) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.duracionMeses = duracionMeses;
        this.precioPorHora = precioPorHora;
    }

    @Override
    public Double calcularPrecio() {
        return horasMensuales * duracionMeses * precioPorHora;
    }
}
