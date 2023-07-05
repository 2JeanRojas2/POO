package com.Jean;

public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crarProducto(String codigo){
        switch (codigo){
            case "CAJA10X10" :
                return new Caja();
            case "PELOTAFUTBOL":
                return new Pelota();
            case "PELOTATENIS":
                return  new Pelota();
            default:
                return null;
        }
    }
}
