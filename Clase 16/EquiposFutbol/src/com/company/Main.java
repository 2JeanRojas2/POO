package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Equipo equipo = new Equipo("PSG");

        Jugador jugador = new Jugador(30,"Messi",true,true);
        Jugador jugador1 = new Jugador(14,"Icardi",false,true);

        equipo.agregarJugador(jugador);
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(new Jugador(1,"Carlos",true,true));

        equipo.mostrarJugadoresTitulares();

    }
}
