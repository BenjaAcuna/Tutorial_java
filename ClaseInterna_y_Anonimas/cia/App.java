package cia;

public class App {
    
    public App(){}


    public void init(){


        Saludador obj = new Saludador(){
            public void saludar(){
                System.out.println("Esta es una implementación Anonima...");
            }
        };
        obj.saludar();
    }

    private interface Saludador{
        public void saludar();
    }

    private class Saludo implements Saludador{

        String saludo;
        public Saludo(String s){
            saludo = s;
        }

        public void saludar(){
            System.out.println(saludo);
        }
    }
}
