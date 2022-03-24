package practicasJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main{
    public static void main(String[] args){
       
        LinkedList lista = new LinkedList();

        lista.add("Hola");
        lista.add("Me");
        lista.add("Llamo");
        lista.add("Benjamin");
        lista.add("Mucho");
        lista.add("Gusto");

        ListIterator iterador = lista.listIterator();

        while(iterador.hasNext())
        {
            System.out.println(iterador.next());
        }

    }
}