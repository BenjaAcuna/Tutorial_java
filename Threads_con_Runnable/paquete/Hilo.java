package paquete;

public class Hilo implements Runnable{

    Thread t;
    String nombre;

    public Hilo()
    {
        t = new Thread(this,"Hilo 1");
        
    }
    public Hilo(String nombre)
    {
        this.nombre = nombre;
        t = new Thread(this,"Hilo 1");
       
    }
    public void start(){
        this.t.start();
    }

    public void run()
    {
        try{

        for(int i = 0; i<200; i++)
        {
            System.out.println(nombre+" - valor: "+i);
            Thread.sleep(500);
        }
       
    }catch(InterruptedException e){};
    
 }
}