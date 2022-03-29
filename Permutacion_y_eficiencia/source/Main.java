package source;



public class Main{

    public static void main(String args [])
    {
       double startTime = System.nanoTime();


       String ingredientes[] = {"lechuga","tomate","cebolla","mostaza","pimiento"};
       

       double permutaciones = 0;

       for(int i = 0; i < ingredientes.length;i++){

           for(int j = 0; j < ingredientes.length;j++){

            for(int k = 0; k < ingredientes.length;k++){
                if(i != j && i != k && k !=j)
                {
                    permutaciones++;
                }
           }
       }
    }
       System.out.println("Permutaciones: "+permutaciones);
       double endTime = System.nanoTime();
       System.out.println("Tiempo en milisecs: "+(endTime-startTime)/1000000);
    }

    public static double factorial(double n){
        return (n == 0)?1:n*factorial(n-1);
    }
}