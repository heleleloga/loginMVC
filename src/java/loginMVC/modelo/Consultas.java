
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luis Torres Patiño
 */
public class Consultas extends conexion{
    
     public boolean Autenticacion(String user, String pass) throws SQLException{
         
         Statement st = con.createStatement();
         ResultSet rs = null;
         String Consulta = "Select * from usuarios"; 
        rs = st.executeQuery(Consulta);
        
        while(rs.next()){
            if (user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contraseña")))
                    return true;
        }
        
         return false; 
     }
     
    

}
