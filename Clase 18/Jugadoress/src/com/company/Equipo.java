package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            System.out.println("ya tenemos a este jugador");
            return;
        }
        jugadores.add(jugador);
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> jugadoresReserva = new ArrayList<>();
        for (int i = 17; i < jugadores.size() ; i++) {
            jugadoresReserva.add(jugadores.get(i));
        }


        return jugadoresReserva;
    }


    public Integer cantidadJugadores(String posicion) throws EquipoException{
        if(!existePosicion(posicion)){
            throw new EquipoException("posicion no valida");
        }
        Integer jugadoresEnPosicion = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getPosicion().equals(posicion)){
                jugadoresEnPosicion++;
            }
        }

        return jugadoresEnPosicion;
    }

    public Jugador buscarJugador(Integer numero) throws EquipoException{
        Jugador jugadorBuscado = null;
        for (Jugador jugador : jugadores) {
            if(jugador.getNumeroCamiseta().equals(numero)){
                jugadorBuscado = jugador;
            }
        }
        if(jugadorBuscado== null){
            throw new EquipoException("no se encontro jugador con el numero " + numero);
        }
        return jugadorBuscado;
    }

    private Boolean existePosicion(String posicion){
        List<String> posicionesValidas = new ArrayList<>();
        posicionesValidas.add("ARQUERO");
        posicionesValidas.add("DEFENSOR");
        posicionesValidas.add("MEDIOCAMPISTA");
        posicionesValidas.add("DELANTERO");
        return posicionesValidas.contains(posicion);
    }
}
