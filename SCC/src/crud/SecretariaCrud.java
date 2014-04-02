
package crud;

import domain.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SecretariaCrud {
    public boolean inserir(Connection conexao, Secretaria secretaria) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(                   
                    "INSERT INTO secretaria(nome,cpf,datanascimento,sexo,uf,cidade,bairro,cep,rua,numero,telefone,celular,email)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, secretaria.getNome());
            stmt.setString(2, secretaria.getCpf());
            stmt.setString(3, secretaria.getDataNascimento());
            stmt.setString(4, secretaria.getSexo());
            stmt.setString(5, secretaria.getUf());
            stmt.setString(6, secretaria.getCidade());
            stmt.setString(7, secretaria.getBairro());
            stmt.setString(8, secretaria.getCep());
            stmt.setString(9, secretaria.getRua());
            stmt.setString(10, secretaria.getNumero());
            stmt.setString(11, secretaria.getTelefone());
            stmt.setString(12, secretaria.getCelular());
            stmt.setString(13, secretaria.getEmail());
           
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean deletar(Connection conexao, Secretaria secretaria) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "DELETE FROM secretaria WHERE cpf=?;");
            stmt.setString(1, secretaria.getCpf());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
  
        
    public ArrayList<Secretaria> listar(Connection conexao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "SELECT cod_secretaria, nome,cpf, datanascimento, sexo, uf, cidade, bairro, rua, numero, cep, telefone, celular, email FROM secretaria;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Secretaria> listaSecretaria = new ArrayList<>();
            while(resultado.next()){
                    Secretaria aux = new Secretaria();

                    aux.setcodSecretaria(resultado.getInt("cod_secretaria"));
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

                    listaSecretaria.add(aux);
                }
                return listaSecretaria;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
     }
    
    //funcao atualiza banco
    public boolean atualizar(Connection conexao, Secretaria secretaria) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE secretaria"
                       +" SET nome=?,cpf=?,datanascimento=?,sexo=?,uf=?"
                       + ",cidade=?,bairro=?,cep=?,rua=?,numero=?"
                       + ",telefone=?,celular=?,email=?"                          
                       + " WHERE cpf=?;");
                    
            stmt.setString(1, secretaria.getNome().toString());
            stmt.setString(2, secretaria.getCpf().toString());
            stmt.setString(3, secretaria.getDataNascimento().toString());
            stmt.setString(4, secretaria.getSexo().toString());
            stmt.setString(5, secretaria.getUf().toString());
            stmt.setString(6, secretaria.getCidade().toString());
            stmt.setString(7, secretaria.getBairro().toString());
            stmt.setString(8, secretaria.getCep().toString());
            stmt.setString(9, secretaria.getRua().toString());
            stmt.setString(10, secretaria.getNumero().toString());
            stmt.setString(11, secretaria.getTelefone().toString());
            stmt.setString(12, secretaria.getCelular().toString());
            stmt.setString(13, secretaria.getEmail().toString());
            stmt.setString(14, secretaria.getCpf().toString());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}