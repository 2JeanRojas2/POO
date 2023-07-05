package com.company;

public class Triste implements Estado {
    @Override
    public Estado comer() {
        return this;
    }

    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado mimar() {
        return new Feliz();
    }
}
