/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                    "INSERT INTO usuario(nome_usuario,senha_usuario)"
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
                    + "WHERE nome_usuario=?"
                    + "AND senha_usuario=?;");
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
                    + "SET nome_usuario=?, senha_usuario=?"
                    + "WHERE cod_usuario=?;");
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
                    "SELECT cod_usuario,nome_usuario,senha_usuario"
                  + "FROM usuario;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            while(resultado.next()){
                Usuario aux = new Usuario();
                
                aux.setId(resultado.getInt("cod_usuario"));
                aux.setNome(resultado.getString("nome_usuario"));
                aux.setSenha(resultado.getString("senha_usuario"));
                listaUsuario.add(aux);
            }
            return listaUsuario;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
    }
}
