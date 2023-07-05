public class Pelota extends Producto {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /*Calcula la superficie de una pelota
    * pow es una función matemática para calcular potencia
    * en este caso r ^ 2*/
    @Override
    public double calcularEspacio() {
        return 4 * Math.PI * Math.pow(radio,2);

    }
}
