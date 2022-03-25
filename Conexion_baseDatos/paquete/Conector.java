package paquete;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.*;

public class Conector {
    private Connection conexion;
    public Conector()
    {

    }
public boolean connectToAccess(String accesFilePath) {
    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conexion = DriverManager.getConnection("jdbc:odbc:driver=(Microsoft Access Driver(*.mdb));DBQ=" + accesFilePath);
    } catch(Exception ex) {
        ex.printStackTrace();
        return false;
    }
    return true;
}
public Vector ejecutarQuery(String sql)
{
    Vector rows = new Vector();


    try
    {
      Statement stmt = conexion.createStatement();
      stmt.executeQuery(sql);
      ResultSet rs= stmt.getResultSet();
      if(rs!=null)
      {
           while(rs.next())
           {
                Vector ctemp = new Vector();
                for(int i = 1; i<=rs.getMetaData().getColumnCount();i++)
                {
                    ctemp.add(rs.getString(i));
                    System.out.println(ctemp.get(i-1));
                }
                rows.add(ctemp);
           }
           rs.close();
           stmt.close();

           return rows;
        }else{
            System.out.println("No hay datos");
        }
    }catch(SQLException e ){System.out.println("Hubo un error");};
    return null;
  }
  public void cerrarConexion()
  {
      try
      {
          this.conexion.close();
      }catch(SQLException e){};
  }
}
 
    
  
