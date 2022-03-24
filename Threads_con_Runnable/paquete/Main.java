package paquete;

public class Main {
    public static void main(String[] args){
      
        Hilo numero1 = new Hilo("N1");
        Hilo numero2 = new Hilo("N2");
        numero1.start();
        numero2.start();
    }
}
