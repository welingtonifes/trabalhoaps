/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import crud.UsuarioCrud;
import domain.Usuario;
import java.sql.Connection;
import database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleUsuario {

    private Connection conn;
    private Database db;

    public boolean verificarUsuarioSenha(Usuario usuario) throws ClassNotFoundException {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT nome_usuario,senha_usuario "
                    + "FROM usuario "
                    + "WHERE nome_usuario=? "
                    + "  AND senha_usuario=? "
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
            JOptionPane.showMessageDialog(null, "ErroSQL ao verificar usuário: \n" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "ErroSQL ao cadastrar usuário: \n" +ex.getMessage());
            return false;
        }
    }
}
