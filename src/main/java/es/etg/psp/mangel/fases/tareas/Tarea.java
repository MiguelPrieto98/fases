package es.etg.psp.mangel.fases.tareas;

public class Tarea extends Thread {

    private int tiempo;
    private String nombre;

    public Tarea(String nombre, int tiempo) {
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    private final static String FINAL = "He acabado:";

    @Override
    public void run() {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(FINAL + nombre);
    }
}