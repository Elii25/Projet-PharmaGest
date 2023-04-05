
package pharmagest;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author TOYIFANE
 */
public class Connect {
     public static Connection connect(){
       try{
    Class.forName("org.postgresql.Driver"); 
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Pharmacie",
            "postgres", "Dhoimra25");
    if(con!=null)return con ;
   }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
   }
   return null ;
} 
    
}
