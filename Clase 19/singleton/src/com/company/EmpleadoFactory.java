package com.company;

public class EmpleadoFactory {

    //Singleton
    private static EmpleadoFactory instance;

    // constructor privado para no poder crear instancias fuera de la clase
    private EmpleadoFactory() {
    }

    //metodo unico de acceso a la instancia
    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    //Factory
       public Empleado crearEmpleado(String codigo){
        switch (codigo) {
            case "EMP-INT":
                return new EmpleadoRelacionDependencia();
            case "EMP-EXT-20":
                return new EmpleadoContratado();
            default:
                return null;
        }
    }


}
