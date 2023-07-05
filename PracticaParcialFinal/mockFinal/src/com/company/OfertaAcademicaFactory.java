package com.company;

public class  OfertaAcademicaFactory {

    public static final String BACK_END = "BACK-END";
    public static final String FRONT_END = "FRONT-END";
    public static final String FULL_STACK = "FULL-STACK";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException {
        switch (codigo) {
            case FRONT_END:
                return new Curso("front end","un curso",16,2,1000.0);
            case BACK_END:
                return new Curso("back end", "un curso", 20,2,900.0);
            case FULL_STACK:
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("full stack","un curso",0.2);
                programaIntensivo.agregarOfertaAcademica(generarOfertaAcademica(FRONT_END));
                programaIntensivo.agregarOfertaAcademica(generarOfertaAcademica(BACK_END));
                return programaIntensivo;
            default:
                throw new OfertaAcademicaFactoryException(codigo + " no es valido");
        }
    }
}
