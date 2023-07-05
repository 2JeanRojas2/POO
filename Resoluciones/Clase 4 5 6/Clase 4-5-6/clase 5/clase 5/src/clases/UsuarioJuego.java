package clases;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

    public void aumentarPuntaje() {
        this.puntaje ++;
    }

    public void subirNivel() {
        this.nivel ++;
    }

    public void bonus(int valor) {
        this.puntaje += valor;
    }

    //para ver sus atributos
    public void mostrarPuntaje() {
        System.out.println("El puntaje actual es de: " + this.puntaje);
    }

    public void mostrarNivel() {
        System.out.println("El nivel actual es de: " + this.nivel);
    }
}
