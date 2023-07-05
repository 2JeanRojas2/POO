package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProductoFactory productoFactory = ProductoFactory.getInstance();

        Producto producto = productoFactory.crearProducto("CAJA10X10");
    }
}
