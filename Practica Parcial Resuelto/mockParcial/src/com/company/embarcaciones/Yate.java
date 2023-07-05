package com.company.embarcaciones;

import com.company.Capitan;

public class Yate extends Embarcacion implements Comparable {

    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double costoAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, costoAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object object) {

        Yate otroYate = (Yate) object;


        if(this.cantidadCamarotes > otroYate.cantidadCamarotes ){
            return 1;
        }
        if (this.cantidadCamarotes < otroYate.cantidadCamarotes){
            return -1;
        }

        return 0;
    }


}
