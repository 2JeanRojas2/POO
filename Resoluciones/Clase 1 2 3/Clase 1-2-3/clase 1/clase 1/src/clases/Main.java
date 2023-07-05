package clases;

public class Main {
    public static void main(String[] args) {
        /*
        Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
        divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
        NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
        decimales.
         */

        //cambiar valores para diferentes resultados
        int numeroUno = 6;
        int numeroDos = 3;

        if(numeroUno%numeroDos == 0) {
            System.out.println("El numero uno es divisible por el segundo numero, el resultado es: " + numeroUno/numeroDos);
        }
        else {
            System.out.println("No son divisibles");
        }
    }
}
