package clases;

public class Main {

    public static void main(String[] args) {
        /*
        Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
        función debe comprobar si el primer número es divisible por el segundo.
        boolean esDivisible(int n, int divisor)
        NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
        decimales.
         */

        //No es divisible
        if(esDivisible(3,4)) {
            System.out.println("Son divisibles");
        }
        else {
            System.out.println("No son divisibles");
        }

        System.out.println("-----------------------");
        if(esDivisible(6,3)) {
            System.out.println("Son divisibles");
        }
        else {
            System.out.println("No son divisibles");
        }
    }

    private static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }

}
