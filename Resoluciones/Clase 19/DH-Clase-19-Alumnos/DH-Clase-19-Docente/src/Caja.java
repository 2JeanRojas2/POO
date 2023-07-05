public class Caja extends Producto {

    private double longuitud;
    private double ancho;
    private double altura;


    public double getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(double longuitud) {
        this.longuitud = longuitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*Calcula la superficie de una caja*/
    @Override
    public double calcularEspacio() {
        return 2*longuitud*ancho + 2*longuitud*altura + 2*altura*ancho;
    }
}
