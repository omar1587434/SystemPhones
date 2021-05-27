
package proyectofinal;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conectar {
    Connection conectar=null;
  String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=SystemPhone";
  String user = "sa";
  String pass = "123";
  
  public  Connection conexion(){
    try{
        System.out.println("\n TRABAJANDO CON JDBC SQLServer");
        System.out.println("===============\n");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conectar= DriverManager.getConnection(url, user, pass);
        if (conectar != null)
        System.out.println("Conexion con " + " creada con exito.");
        JOptionPane.showMessageDialog(null, "Conexion creada con exito");
    }catch(Exception e){
    System.out.println("No se conecto " + e);
    JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
    }
    return conectar;
}
 
}

