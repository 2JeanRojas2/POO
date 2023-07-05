public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory()
    {
    }

    public static ProductoFactory getInstance()
    {
        if(instance == null)
            instance = new ProductoFactory();

        return instance;
    }

    public Producto crearProducto(String cod)
    {
        Producto resultado = null;

        switch (cod) {
            case "CAJA10X10":
                Caja caja = new Caja();
                caja.setAltura(10);
                caja.setAncho(10);
                caja.setLonguitud(10);
                resultado = caja;
                break;
            case "PELOTAFUTBOL":
                Pelota pelota =  new Pelota();
                pelota.setRadio(11);
                resultado = pelota;
                break;
            case "PELOTATENIS":
                Pelota pelotaTenis =  new Pelota();
                pelotaTenis.setRadio(0.32);
                resultado = pelotaTenis;
                break;
        }

        return resultado;
    }
}
