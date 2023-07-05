public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        double espacioRequerido = almacen.calcularEspacioNecesario();

        System.out.println("Total de espacio necesario: ");
        System.out.println(espacioRequerido);

    }
}
