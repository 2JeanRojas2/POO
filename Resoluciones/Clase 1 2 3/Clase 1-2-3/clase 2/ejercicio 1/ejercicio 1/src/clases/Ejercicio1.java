package clases;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*/
        Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        mensaje.
         */
        String cadenaUno = "Hola";
        String cadenaDos = "Chau";

        //NOTA: para comparar no se hace con == sino con .equals()
        if(cadenaUno.equals(cadenaDos)) {
            System.out.println("Las cadenas son iguales");
        }
        else {
            System.out.println("Las cadenas no son iguales");
        }
    }
}
