package com.company;

import com.company.embarcaciones.Yate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Yate yate = new Yate(null,10000.0,3000.0,2021,5.0,8);
        Yate yate2 = new Yate(null,10000.0,3000.0,2021,5.0,5);

        System.out.println(yate.calcularPrecioAlquiler());
        System.out.println(yate2.compareTo(yate));
    }
}
