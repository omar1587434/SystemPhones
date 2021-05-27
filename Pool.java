
package Metodos;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

public class Pool {
    
   public DataSource dataSource;
   
     String db="SystemPhone";
  String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName="+db;
  String user = "sa";
  String pass = "123";

  public Pool(){
inicializaDataSource();
}
  
  private void inicializaDataSource() {
BasicDataSource basicDataSource = new BasicDataSource();
basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
basicDataSource.setUsername(user);
basicDataSource.setPassword(pass);
basicDataSource.setUrl(url);
basicDataSource.setMaxActive(50);
dataSource = basicDataSource;
}
  
   // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
 
    
    
}
