package principal;

public class Objeto
{
   int width;
   int height;
   int rad;

   String Nombre;

   public Objeto()
   {
        this.width = 100;
        this.height = 100;
        this.rad = 100;
   }

     public void cambiarTamano(int nuevoTamano)
     {
        this.height= nuevoTamano;
        this.width= nuevoTamano;
        
     }
     public void imprimirTamano()
     {
         System.out.println("Ancho: "+this.width);
         System.out.println("Alto: "+this.height);
     }
}