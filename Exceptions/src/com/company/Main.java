package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // null pointer

        Cliente cliente = null;
        try {
            cliente = new Cliente("","","123",1000.0,500.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        try {
            cliente.comprar(2000.0);
            cliente.saldarDeuda(100.0);
        } catch (ClienteException e) {
            // codigo que se ejecuta cuando rompe
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("fallo por otra cosa");
        }

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);


        System.out.println("mi codigo llego hasta aca");




}
}
