package source;

public class Main {
    public static void main(String args [])
    {
        Pila pila = new Pila();
         pila.push("1");
         pila.push("2");
         pila.push("3");
         pila.push("4");
         pila.push("5");

         System.out.println(pila.pop());
         System.out.println(pila.empty());
         System.out.println(pila.pop());
         System.out.println(pila.empty());
    }
}
