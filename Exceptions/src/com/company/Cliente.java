package com.company;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Double saldo;
    private Double limite;
    private Double deuda;

    public Cliente(String nombre, String apellido, String dni, Double saldo, Double limite) throws ClienteException {
        if (dni.length() != 8){
            throw  new ClienteException("dni no valido");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldo = saldo;
        this.limite = limite;
        this.deuda = 0.0;


    }

    public void comprar(Double importe) throws ClienteException {

        if(limite >= importe){
            saldo -= importe;
        }else{
            throw new ClienteException("intentas comprar algo de " + importe +" pesos y tu limite es de " + limite);
        }
    }

    public void saldarDeuda(Double importe) throws ClienteException{
        if(deuda == 0.0){
            throw new ClienteException("no tenes deuda");
        }
        if(deuda < importe){
            throw  new ClienteException("queres pagar " + importe + "  y tenes una deuda de " + deuda);
        }
        deuda -= importe;

    }


}
