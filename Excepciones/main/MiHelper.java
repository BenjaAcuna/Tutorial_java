package main;

public class MiHelper {

    MiHelper(){

    }

    public void validarPassword(String pass, String rpass) throws ClassCastException, CustomException
    {
        if(!pass.equals(rpass)){
            throw new CustomException("Los campos de password no son iguales.");
        
        }

        if(pass.length() <8){
            throw new CustomException("El password no es lo suficientemente largo");
        }

     
    }
}
