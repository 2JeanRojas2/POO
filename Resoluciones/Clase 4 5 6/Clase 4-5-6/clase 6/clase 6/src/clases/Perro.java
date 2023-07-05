package clases;

import java.util.Calendar;
import java.util.Date;

public class Perro {

    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Perro(boolean enAdopcion, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado, String nombre) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public int obtenerEdadAproximada() {
        return Calendar.YEAR - this.anioNacimiento;
    }

    public boolean sePuedePerder() {
        return this.tieneChip;
    }

    public void enviarAdopcion() {
        if(!this.estaLastimado && this.peso > 3) {
            System.out.println("El perro se envio en adopcion!");
        }
        else {
            System.out.println("El perro no esta apto para adoptar");
        }
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
