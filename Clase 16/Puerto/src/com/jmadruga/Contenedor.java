package com.jmadruga;

public class Contenedor implements Comparable<Contenedor>{
    private Integer idContenedor;
    private String paisDeProcedencia;
    private Boolean contieneMaterialesPeligrosos;

    public Contenedor(Integer idContenedor, String paisDeProcedencia, Boolean contieneMaterialesPeligrosos) {
        this.idContenedor = idContenedor;
        this.paisDeProcedencia = paisDeProcedencia;
        this.contieneMaterialesPeligrosos = contieneMaterialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.idContenedor < contenedor.idContenedor){
            return -1;
        }
        if (this.idContenedor > contenedor.idContenedor){
            return 1;
        }
        return 0;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public Boolean getContieneMaterialesPeligrosos() {
        return contieneMaterialesPeligrosos;
    }

    @Override
    public String toString() {
        return "ID del contenedor: " + idContenedor + ", pais de procedencia: " + paisDeProcedencia +
                ", contiene materiales peligrosos?: " + contieneMaterialesPeligrosos;
    }
}
