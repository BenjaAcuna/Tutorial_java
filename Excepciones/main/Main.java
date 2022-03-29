package main;

public class Main {
    public static void main(String[] args){

     String user,pass,reppass;
     user = "Benja20";
     pass = "Holabb13";
     reppass = "Holaaaaaa";

     MiHelper h = new MiHelper();

     try{
    
       h.validarPassword(pass,reppass);

     }catch(CustomException e){
         e.printStackTrace();
     }


    }
}
