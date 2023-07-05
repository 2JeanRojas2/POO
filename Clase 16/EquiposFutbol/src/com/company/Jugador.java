package com.company;

public class Jugador implements Comparable<Jugador> {

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "soy el jugador " + nombre + " con numero " + numeroCamiseta;
    }

    @Override
    public int compareTo(Jugador jugador) {

        if(this.numeroCamiseta > jugador.numeroCamiseta){
            return 1;
        }
        if (this.numeroCamiseta < jugador.numeroCamiseta){
            return -1;
        }

        return 0;
    }


}
