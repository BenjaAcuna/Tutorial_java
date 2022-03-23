package paquete;

public class Main {

    public static void main(String[] args){

// los hilos son subprocesos, esto permite ejecutar uno o mas procesos al mismo tiempo)
      Proceso hilo1 = new Proceso("Hilo 1");
      Proceso hilo2 = new Proceso("Hilo 2");
      hilo1.setMensaje("Este es el mensaje del hilo 1");
      hilo2.setMensaje("Mensaje del hilo 2");
      
      hilo1.start();
      hilo2.start();


    }
}