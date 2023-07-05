package com.jmadruga;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void agregarContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados(){
        contenedores.sort(null);
        for (Contenedor contenedor: contenedores) {
            System.out.println(contenedor);
        }
    }

    public Integer cantidadDeContenedoresPeligrososProcedenciaDesconocida(){
        Integer contadorContenedoresPeligrosos = 0;
        for (Contenedor contenedor : contenedores) {
        if (contenedor.getPaisDeProcedencia().equals("desconocido") && contenedor.getContieneMaterialesPeligrosos()){
            contadorContenedoresPeligrosos ++;
            }
        }
        return contadorContenedoresPeligrosos;
    }

}
