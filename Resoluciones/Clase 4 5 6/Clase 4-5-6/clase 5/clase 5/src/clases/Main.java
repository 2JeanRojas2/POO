package clases;

public class Main {
    public static void main(String[] args) {
        //Creo un usuarioJuego
        UsuarioJuego usuarioJuego = new UsuarioJuego("Pedro","Martinez");

        //Inicialmente su nivel y puntaje esta en 0
        usuarioJuego.mostrarPuntaje();
        usuarioJuego.mostrarNivel();
        System.out.println("---------------");

        //Aumento 1 puntaje y 2 niveles
        usuarioJuego.aumentarPuntaje();
        usuarioJuego.subirNivel();
        usuarioJuego.subirNivel();
        usuarioJuego.mostrarPuntaje();
        usuarioJuego.mostrarNivel();
        System.out.println("---------------");

        //aumento el puntaje con un bonus
        usuarioJuego.bonus(20);
        usuarioJuego.mostrarPuntaje();
        System.out.println("---------------");
    }
}
