package com.company;

public class Sediento implements Estado {
    @Override
    public Estado comer() {
        return new Triste();
    }

    @Override
    public Estado beber() {
        return new Feliz();
    }

    @Override
    public Estado mimar() {
        return this;
    }
}
