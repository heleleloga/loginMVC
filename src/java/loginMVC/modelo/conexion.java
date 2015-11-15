
package LoginMVC.modelo;

import java.sql.DriverManager;
import org.apache.jasper.tagplugins.jstl.core.Catch;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

public class conexion {
      
    public static final String USERNAME="root";
    public static final String PASSWORD="";
    public static final String HOST="localhost";
    public static final String PORT="127.0.0.1";
    public static final String DATABASE="codigoleo";
    public static final String CLASSNAME="com.mysql.jdbc.Driver";
    public static final String URL="jdbc:mysql://127.0.0.1/" + DATABASE; 
    
    public java.sql.Connection con;
    
    public conexion(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        }catch(SQLException e){
            System.out.println("Error");
        }
    }
    
    
    
}
