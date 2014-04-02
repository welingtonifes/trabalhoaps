package control;

import crud.UsuarioCrud;
import database.Database;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControleUsuario {
   private Connection conn;
   private Database db;

    public boolean verificarUsuarioSenha(Usuario usuario) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT nome,senha "
                    + "FROM usuario "
                    + "WHERE nome=? "
                    + "  AND senha=? "
                    + "  LIMIT 1;");

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                db.desconectar(this.conn);
                return true;
            } else {
                return false;
            }

        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            UsuarioCrud usuariocrud = new UsuarioCrud();
            
            usuariocrud.inserir(this.conn, usuario);
            
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}
