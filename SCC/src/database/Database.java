
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class Database {
    private Connection conn = null;
    
    public Connection conectar(){
        try{
            this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sco","postgres","bd");
            return this.conn;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return this.conn;
        }
    }
    public boolean desconectar(Connection conn){
        try{
            conn.close();
            return true;
        }catch(SQLException ex){
            return false;
        }
    }
}


