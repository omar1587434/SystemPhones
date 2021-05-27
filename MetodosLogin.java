
package Metodos;

import proyectofinal.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class MetodosLogin {
    Pool metodospool = new Pool();

public int validar_ingreso(){

    String usuario = Login.jTextField1.getText();
    String clave = String.valueOf(Login.jPasswordField1.getPassword());
    Object tipo=Login.jComboBox1.getSelectedItem();
    int resultado=0;
    
    String SSQL="SELECT * FROM Usuarios WHERE NombreUsuario='"+usuario+"' AND TipoUsuario='"+tipo+"' AND ContrasenaUsuario='"+clave+"'";

    Connection conect = null;

    try {

        conect = metodospool.dataSource.getConnection();
        Statement st = conect.createStatement();
        ResultSet rs = st.executeQuery(SSQL);

        if(rs.next()){

            resultado=1;

        }

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{


        try {

            conect.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

        }

    }

return resultado;

}

    
}
