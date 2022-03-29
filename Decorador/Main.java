import Decorador.Auto;
import Decorador.autoElectrico;
import Decorador.carroEstandar;

public class Main{

    public static void main(String[] args){

        Auto carro = new autoElectrico(new carroEstandar("Mcclaren"));
        carro.start();
        carro.accel();
        carro.stop();




    }
}