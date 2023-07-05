package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipo {


    private String nombre;
    private List<Jugador> jugadores;
    private List<String> palabras;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Integer calcularCantidadJugadoresLesionados(){

        Integer cantidadLesionados = 0;

        for (Jugador jugador : jugadores){
            if(jugador.getTitular() && jugador.getLesionado()){
                cantidadLesionados++;
            }
        }

        return cantidadLesionados;
    }

    public void mostrarJugadoresTitulares(){

        jugadores.sort(null);

        for (Jugador jugador : jugadores) {
            if (jugador.getTitular()){
                System.out.println(jugador);
            }
        }

    }


}
