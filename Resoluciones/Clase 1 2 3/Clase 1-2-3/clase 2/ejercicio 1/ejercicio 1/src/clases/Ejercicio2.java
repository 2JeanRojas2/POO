package clases;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        Informar el resultado obtenido.
         */
        int numeroUno = 2;
        int numeroDos = 3;
        if(numeroUno > numeroDos) {
            System.out.println("El primer numero es mayor al segundo");
        }
        else if(numeroUno < numeroDos) {
            System.out.println("El primer numero es menor al segundo");
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}
