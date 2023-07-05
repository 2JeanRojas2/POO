package com.company;

public class Tamagochi {

    private Estado estadoActual;

    public Tamagochi() {
        estadoActual = new Feliz();
    }


    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }

    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }
    public void darleMimos(){
        estadoActual = estadoActual.mimar();
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }
}
