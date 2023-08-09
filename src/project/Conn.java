
package project;
import java.sql.*;
/**
 *
 * @author harry sahani
 */
public class Conn {
    Connection c;
    Statement st;
    Conn(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","2444"); 
            st=c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
