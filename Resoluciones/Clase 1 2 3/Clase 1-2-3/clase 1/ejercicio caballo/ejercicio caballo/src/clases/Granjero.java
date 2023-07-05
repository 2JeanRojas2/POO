package clases;

public class Granjero {

    private Braulio braulio;

    public Granjero() {
        this.braulio = new Braulio();
    }

    public void obtenerNombreCaballo() {
        System.out.println("Mi caballo se llama: " + this.braulio.getNombre());
    }

    public void obtenerConsumoCaballo() {
        System.out.println("Mi caballo consume: $" + this.braulio.getConsumo());
    }
}
