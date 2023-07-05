package desafio1;

public class Jugador {

    private String nombre;
    private float puntos;

    public Jugador() {
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntos() {
        return puntos;
    }

    public void sumarPunto() {
        this.puntos ++;
    }

}
