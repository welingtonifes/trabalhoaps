
package crud;

import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioCrud {

    public boolean inserir(Connection conexao, Usuario usuario) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "INSERT INTO usuario(nome,senha)"
                    + "VALUES (?,?);");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean deletar(Connection conexao, Usuario usuario) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "DELETE FROM usuario"
                    + "WHERE nome=?"
                    + "AND senha=?;");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Connection conexao, Usuario usuario) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE usuario"
                    + "SET nome=?, senha=?"
                    + "WHERE id=?;");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public ArrayList<Usuario> listar(Connection conexao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "SELECT id,nome,senha"
                  + "FROM usuario;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            while(resultado.next()){
                Usuario aux = new Usuario();
                
                aux.setId(resultado.getInt("id"));
                aux.setNome(resultado.getString("nome"));
                aux.setSenha(resultado.getString("senha"));
                listaUsuario.add(aux);
            }
            return listaUsuario;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
}
