package com.company;

public class ProductoFactory {
    //singleton
    private static ProductoFactory instance;

    private ProductoFactory() {
    }
    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }
    //Factory
    public Producto crearProducto(String codigo){
        switch (codigo) {
            case "CAJA10X10":
                return new Caja();
            case "PELOTAFUTBOL":
                return new PelotaFutbol();
            case "PELOTATENIS":
                return new PelotaTenis();
                default:
                return null;
        }
    }

}
