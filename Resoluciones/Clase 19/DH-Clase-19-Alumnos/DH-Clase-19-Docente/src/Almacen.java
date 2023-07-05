import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> productos;

    public Almacen(){
        productos = new ArrayList<>();

        Producto prod1 = ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Producto prod2 = ProductoFactory.getInstance().crearProducto("PELOTAFUTBOL");
        Producto prod3 = ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
    }



    public double calcularEspacioNecesario(){
        double total = 0;
        for(Producto prod: productos)
            total += prod.calcularEspacio();

        return total;
    }
}
