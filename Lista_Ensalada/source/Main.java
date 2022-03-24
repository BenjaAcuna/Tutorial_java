package source;

public class Main{
    
    public static void main(String[] args)
    {
      ListaEnlazada lista = new ListaEnlazada();

      System.out.println("Esta Vacia: "+ lista.estaVacia());

      lista.addPrimero(6);
      lista.addPrimero(5);
      lista.addPrimero(4);
      lista.addPrimero(3);
      lista.addPrimero(2);
      lista.addPrimero(1);

      lista.eliminar(2);


      System.out.println("Primero: "+ lista.obtener(0));
      System.out.println("Index 2: "+ lista.obtener(2));
      System.out.println("Ultimo: "+ lista.obtener(lista.size()-1));
      System.out.println("Tamaño: "+ lista.size());
      System.out.println("Esta Vacia: "+ lista.estaVacia());
      
    }
}