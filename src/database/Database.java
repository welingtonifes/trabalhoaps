
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    private Connection conn = null;
    private String driver;
    public Connection conectar() throws ClassNotFoundException{           
        try{
            driver="org.postgresql.Driver";
            Class.forName(driver);
            //pra conectar no banco terá que ter usuario e senha: "postgres", "123456"
            //e incluir as bibliotecas encontradas no site http://jdbc.postgresql.org/download.html
            this.conn = DriverManager.getConnection("jdbc:postgresql://localhost/sco", "postgres", "123456");
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
