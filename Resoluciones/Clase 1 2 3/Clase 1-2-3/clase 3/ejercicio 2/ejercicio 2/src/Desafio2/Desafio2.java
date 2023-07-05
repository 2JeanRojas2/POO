package Desafio2;

import desafio1.Jugador;

import java.util.Scanner;

public class Desafio2 {
    /*
    Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
    posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
    poderes según:
    Papel desaprueba Spock
    Spock destroza tijeras
    Spock vaporiza piedra
     */
    private Jugador jugadorUno;
    private Jugador jugadorDos;

    public Desafio2() {
        this.jugadorUno = new Jugador();
        this.jugadorDos = new Jugador();
    }

    public void comenzarJuego() {
        Scanner scanner = new Scanner(System.in);
        //Pido y cargo los nombres de los jugadores
        System.out.println("Ingrese el nombre del primer jugador:");
        jugadorUno.setNombre(scanner.nextLine());
        System.out.println("Ingrese el nombre del segundo jugador:");
        jugadorDos.setNombre(scanner.nextLine());

        //Los jugadores eligen sus jugadas
        String opcionUno = "";
        String opcionDos = "";
        while(!opcionUno.equals("*")) {
            System.out.println("Jugador uno elija su jugada:");
            System.out.println("1 -> piedra");
            System.out.println("2 -> papel");
            System.out.println("3 -> tijeras");
            System.out.println("4 -> spok");
            System.out.println("* -> terminar el juego");
            opcionUno = scanner.nextLine();
            if(!opcionUno.equals("*")) {
                System.out.println("Jugador dos elija su jugada:");
                System.out.println("1 -> piedra");
                System.out.println("2 -> papel");
                System.out.println("3 -> tijeras");
                System.out.println("4 -> spok");
                opcionDos = scanner.nextLine();

                if(cualGana(opcionUno,opcionDos) == 1) {
                    System.out.println("Gano el jugador 1 esta ronda");
                    this.jugadorUno.sumarPunto();
                }
                else if(cualGana(opcionUno,opcionDos) == 2) {
                    System.out.println("Gano el jugador 2 esta ronda");
                    jugadorDos.sumarPunto();
                }
                else {
                    System.out.println("Empate esta ronda");
                }
            }

        }

        elegirGanadorPartido();
    }

    private int cualGana(String opcionUno, String opcionDos) {
        //Gana el jugador 1
        if(opcionUno.equals("1") && opcionDos.equals("3")) {
            return 1;
        }
        else if(opcionUno.equals("2") && opcionDos.equals("1")) {
            return 1;
        }
        else if(opcionUno.equals("3") && opcionDos.equals("2")) {
            return 1;
        }
        else if(opcionUno.equals("4") && (opcionDos.equals("1") || opcionDos.equals("3"))) {
            return 1;
        }

        //Gana el jugador 2
        if(opcionDos.equals("1") && opcionUno.equals("3")) {
            return 2;
        }
        else if(opcionDos.equals("2") && opcionUno.equals("1")) {
            return 2;
        }
        else if(opcionDos.equals("3") && opcionUno.equals("2")) {
            return 2;
        }
        else if(opcionDos.equals("2") && opcionUno.equals("4")) {
            return 2;
        }

        //Empatan
        return 0;
    }

    private void elegirGanadorPartido() {
        if(this.jugadorUno.getPuntos() > this.jugadorDos.getPuntos()) {
            System.out.println("Gano el jugador " + this.jugadorUno.getNombre() + " el partido");
        }
        else if(this.jugadorUno.getPuntos() < this.jugadorDos.getPuntos()) {
            System.out.println("Gano el jugador " + this.jugadorDos.getNombre() + " el partido");
        }
        else {
            System.out.println("El partido termino en un empate");
        }
    }
}
