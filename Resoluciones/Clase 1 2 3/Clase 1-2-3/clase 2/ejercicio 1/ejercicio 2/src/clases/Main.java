package clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        una tercera tus iniciales.
         */

        //Creo el scanner
        Scanner scan = new Scanner(System.in);

        //Scanneo los inputs y los guardo en variables
        //NOTA: cuando se usa cosas como nextInt() para obtener un entero (y no nextLine) es necesario hacer un nextLine()
        //      despues de hacer el nextInt() porque sino nos va a detectar como salto de linea el enter que hagamos y el
        //      programa no va a funcionar como lo queremos, va a saltear otros scaneos que hagamos sino
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scan.nextLine();

        //hacerle a una variable String un .charAt(indice) nos devuelve como char la letra en esa posicion (empiezan en 0)
        System.out.println("Iniciales de mi nombre: " + nombre.charAt(0) + apellido.charAt(0));
    }
}
