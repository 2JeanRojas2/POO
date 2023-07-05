package com.jmadruga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FiguraAreaCalculable circulo = new Circulo(1.0);
        FiguraAreaCalculable rectangulo = new Rectangulo(5.0, 4.0);
        FiguraAreaCalculable rectangulo2 = new Rectangulo(6.0, 4.0);
        FiguraAreaCalculable triangulo = new Triangulo(2.0, 2.0);

        CompuestoDeFiguras vagon = new CompuestoDeFiguras("vagon");
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);

        CompuestoDeFiguras locomotora = new CompuestoDeFiguras("locomotora");
        locomotora.agregarFigura(circulo);
        locomotora.agregarFigura(circulo);
        locomotora.agregarFigura(rectangulo2);
        locomotora.agregarFigura(rectangulo2);
        locomotora.agregarFigura(rectangulo2);
        locomotora.agregarFigura(triangulo);

        CompuestoDeFiguras tren = new CompuestoDeFiguras("tren");
        tren.agregarFigura(vagon);
        tren.agregarFigura(vagon);
        tren.agregarFigura(locomotora);

        System.out.println(vagon.calcularArea());
        System.out.println(locomotora.calcularArea());
        System.out.println(tren.calcularArea());
    }
}
