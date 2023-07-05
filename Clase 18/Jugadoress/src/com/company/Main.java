package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Sacachispas");

        equipo.agregarJugador(new Jugador("ARQUERO","Dani",1));
        equipo.agregarJugador(new Jugador("DELANTERO","Dani",2));
        equipo.agregarJugador(new Jugador("DELANTERO","Dani",4));
        equipo.agregarJugador(new Jugador("DELANTERO","Dani",5));
        equipo.agregarJugador(new Jugador("DEFENSOR","Dani",6));
        equipo.agregarJugador(new Jugador("DEFENSOR","Dani",7));

        try {
            System.out.println(equipo.cantidadJugadores("DEFENSOR"));
        } catch (EquipoException e) {
            e.printStackTrace();
        }
    }
}
