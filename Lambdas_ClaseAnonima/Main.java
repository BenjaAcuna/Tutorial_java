public class Main{

    @FunctionalInterface
    interface Suma{
        public Integer sumarDosNumeros(Integer a, Integer b);
    }

    public static void main(String[] args){

        Thread hilo = new Thread(new Hilo());
    hilo.start();

        Suma suma = (a,b) -> a + b;
        System.out.println(suma.sumarDosNumeros(10, 35));

    }
}