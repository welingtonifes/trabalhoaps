/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Dentista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class DentistaCrud {
    public boolean inserir(Connection conexao, Dentista dentista) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(                   
                    "INSERT INTO dentista(nome,cpf,datanascimento,sexo,uf,cidade,bairro,cep,rua,numero,telefone,celular,email)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, dentista.getNome());
            stmt.setString(2, dentista.getCpf());
            stmt.setString(3, dentista.getDataNascimento());
            stmt.setString(4, dentista.getSexo());
            stmt.setString(5, dentista.getUf());
            stmt.setString(6, dentista.getCidade());
            stmt.setString(7, dentista.getBairro());
            stmt.setString(8, dentista.getCep());
            stmt.setString(9, dentista.getRua());
            stmt.setString(10, dentista.getNumero());
            stmt.setString(11, dentista.getTelefone());
            stmt.setString(12, dentista.getCelular());
            stmt.setString(13, dentista.getEmail());
           
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean deletar(Connection conexao, Dentista dentista) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "DELETE FROM dentista WHERE cpf=?;");
            stmt.setString(1, dentista.getCpf());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
  
        
    public ArrayList<Dentista> listar(Connection conexao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "SELECT cod_dentista, nome,cpf, datanascimento, sexo, uf, cidade, bairro, rua, numero, cep, telefone, celular, email FROM dentista;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Dentista> listaDentista = new ArrayList<>();
            while(resultado.next()){
                    Dentista aux = new Dentista();

                    aux.setCodDentista(resultado.getInt("cod_dentista"));
                    aux.setNome(resultado.getString("nome"));
                    aux.setCpf(resultado.getString("cpf"));
                    aux.setDataNascimento(resultado.getString("datanascimento"));
                    aux.setSexo(resultado.getString("sexo"));
                    aux.setUf(resultado.getString("uf"));
                    aux.setCidade(resultado.getString("cidade"));
                    aux.setBairro(resultado.getString("bairro"));
                    aux.setRua(resultado.getString("rua"));
                    aux.setNumero(resultado.getString("numero"));
                    aux.setCep(resultado.getString("cep"));
                    aux.setTelefone(resultado.getString("telefone"));
                    aux.setCelular(resultado.getString("celular"));
                    aux.setEmail(resultado.getString("email"));

                    listaDentista.add(aux);
                }
                return listaDentista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
     }
    
    //funcao atualiza banco
    public boolean atualizar(Connection conexao, Dentista dentista) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE dentista"
                       +" SET nome=?,cpf=?,datanascimento=?,sexo=?,uf=?"
                       + ",cidade=?,bairro=?,cep=?,rua=?,numero=?"
                       + ",telefone=?,celular=?,email=?"                          
                       + " WHERE cpf=?;");
                    
            stmt.setString(1, dentista.getNome().toString());
            stmt.setString(2, dentista.getCpf().toString());
            stmt.setString(3, dentista.getDataNascimento().toString());
            stmt.setString(4, dentista.getSexo().toString());
            stmt.setString(5, dentista.getUf().toString());
            stmt.setString(6, dentista.getCidade().toString());
            stmt.setString(7, dentista.getBairro().toString());
            stmt.setString(8, dentista.getCep().toString());
            stmt.setString(9, dentista.getRua().toString());
            stmt.setString(10, dentista.getNumero().toString());
            stmt.setString(11, dentista.getTelefone().toString());
            stmt.setString(12, dentista.getCelular().toString());
            stmt.setString(13, dentista.getEmail().toString());
            stmt.setString(14, dentista.getCpf().toString());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}