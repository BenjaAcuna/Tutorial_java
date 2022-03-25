package paquete;

public class Main{
    public static void main(String[] args){

      Conector c = new Conector();
      c.connectToAccess("prueba.accdb");
      c.ejecutarQuery("SELECT * FROM prueba");
      c.cerrarConexion();
    }
}