package Decorador;

public class autoElectrico extends AutoDecorador{

    public autoElectrico(Auto auto){
        super(auto);

    }

    @Override
    public void accel() {
        System.out.println("Iniciando electricamente");
        getAuto().accel();

    }

    @Override
    public void stop() {
        System.out.println("Controlando frenos");
        getAuto().stop();
        
    }

    @Override
    public void start() {
        System.out.println("Iniciar sistema operativo");
        getAuto().start();
        
    }
    
}
