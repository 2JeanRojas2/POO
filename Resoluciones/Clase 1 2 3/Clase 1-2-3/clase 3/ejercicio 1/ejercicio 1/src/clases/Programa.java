package clases;

import java.util.Scanner;

public class Programa {

    private Scanner scanner;

    public Programa() {
        this.scanner = new Scanner(System.in);
    }

    public void cuantosPaquetes() {

        System.out.println("Ingrese el nombre del perro actual:");
        String nombrePerro = this.scanner.nextLine();

        System.out.println("Ingrese la cantidad de comida necesaria para el perro:");
        float cantComida = this.scanner.nextFloat();
        //usar .nextLine() sino nos va a saltear los scaneos posteriores
        this.scanner.nextLine();

        //Si la cantidad es menor a 3 el perro va a ladrar toda la noche entonces no es aceptable
        while(cantComida < 3) {
            System.out.println(nombrePerro + " debe comer al menos 3kg por dia, ingrese nuevamente la cantidad");
            cantComida = this.scanner.nextFloat();
            this.scanner.nextLine();
        }

        //cuento la cantidad de paquetes que voy a necesitar
        int contadorPaquetes = 0;
        //peso total de los paquetes hasta el momento
        float totalPaquetes = 0;

        //itero los paquetes hasta cumplir la cantidad que necesito
        while(cantComida > totalPaquetes) {
            System.out.println("Ingrese el peso del paquete");
            totalPaquetes += scanner.nextFloat();
            scanner.nextLine();
            contadorPaquetes ++;
        }

        System.out.println("Se necesitan " + contadorPaquetes + " paquetes para " + nombrePerro);
    }
}
