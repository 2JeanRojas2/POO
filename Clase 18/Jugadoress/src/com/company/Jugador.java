package com.company;

import java.util.List;
import java.util.Objects;

public class Jugador {

    private String posicion;
    private String apellido;
    private Integer numeroCamiseta;

    public Jugador(String posicion, String apellido, Integer numeroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Jugador jugador = (Jugador) object;
        return Objects.equals(posicion, jugador.posicion) &&
                Objects.equals(apellido, jugador.apellido) &&
                Objects.equals(numeroCamiseta, jugador.numeroCamiseta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicion, apellido, numeroCamiseta);
    }
}
