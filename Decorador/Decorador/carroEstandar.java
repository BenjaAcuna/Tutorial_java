package Decorador;

public class carroEstandar implements Auto{

    private String nombre;

    public carroEstandar(String s){
        nombre = s;
    }

    @Override
    public void accel() {
        System.out.println("Aceleración Estandar");
        
    }

    @Override
    public void stop() {
        System.out.println("Frenar");
        
    }

    @Override
    public void start() {
        System.out.println("Prendiendo el carro");
        
    }
    
}
