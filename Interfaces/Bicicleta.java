public class Bicicleta implements Rueda,Silla{

    public Bicicleta(){}

    @Override
    public void avanzar() {
        System.out.println("Bicicleta en marcha");
        
    }

    @Override
    public void detenerse() {
        System.out.println("Bicicleta detenida");
        
    }

    @Override
    public void sentarse() {
        System.out.println("sentarse");
        
    }
    
}
