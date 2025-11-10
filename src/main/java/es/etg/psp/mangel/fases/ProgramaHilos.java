package es.etg.psp.mangel.fases;

import es.etg.psp.mangel.fases.tareas.Tarea;

public class ProgramaHilos {

    private final static String ANALISIS = "analisis";
    private final static String MAQUTECION = "diseño";
    private final static String CODIFICACION = "codificacion";
    private final static String PRUEBAS = "pruebas";
    private final static int TIEMPOA = 3000;
    private final static int TIEMPOD = 2000;
    private final static int TIEMPOC = 1000;
    private final static int TIEMPOP = 2000;
    private final static String MENSAJE1 = "Ejecuto añalisis y diseño";
    private final static String MENSAJE2 = "Espero a que acabe analisis para ejecutar codificacion y pruebas";
    private final static String MENSAJE3 = "Ejecuto codificacion";
    private final static String MENSAJE4 = "Espero a que acabe diseño para ejecutar pruebas";
    private final static String MENSAJE5 = "Ejecuto pruebas";

    public static void main(String[] args) throws InterruptedException {

        Tarea analisis = new Tarea(ANALISIS, TIEMPOA);
        Tarea diseño = new Tarea(MAQUTECION, TIEMPOD);
        Tarea codificacion = new Tarea(CODIFICACION, TIEMPOC);
        Tarea pruebas = new Tarea(PRUEBAS, TIEMPOP);

        
        System.out.println(MENSAJE1);
        analisis.start();
        diseño.start();


        System.out.println(MENSAJE2);
        analisis.join();

        System.out.println(MENSAJE3);
        codificacion.start();


        System.out.println(MENSAJE4);
        diseño.join();

        System.out.println(MENSAJE5);
        pruebas.start();
    }
}