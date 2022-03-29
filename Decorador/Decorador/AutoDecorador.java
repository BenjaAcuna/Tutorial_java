package Decorador;

public abstract class AutoDecorador implements Auto{
    
    private Auto auto;

    public AutoDecorador(Auto auto){
        this.auto = auto;
    }

    public Auto getAuto(){
        return auto;
    }
}
