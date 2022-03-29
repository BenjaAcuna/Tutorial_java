package source;

public class Main {
    
    public static void main(String[] args)
    {
       BTS arbol = new BTS();
       arbol.insertar(5, null);
       arbol.insertar(3, null);
       arbol.insertar(1, null);
       arbol.insertar(2, null);
       arbol.insertar(8, null);
       arbol.insertar(6, null);
       arbol.insertar(10, null);

       arbol.recorrido_en_orden(arbol.raiz.izq);

    }
}
