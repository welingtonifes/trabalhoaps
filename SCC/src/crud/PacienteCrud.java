
package crud;

import domain.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PacienteCrud {
    public boolean inserir(Connection conexao, Paciente paciente) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(                   
                    "INSERT INTO paciente(nome,cpf,datanascimento,sexo,uf,cidade,bairro,cep,rua,numero,telefone,celular,email)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getDataNascimento());
            stmt.setString(4, paciente.getSexo());
            stmt.setString(5, paciente.getUf());
            stmt.setString(6, paciente.getCidade());
            stmt.setString(7, paciente.getBairro());
            stmt.setString(8, paciente.getCep());
            stmt.setString(9, paciente.getRua());
            stmt.setString(10, paciente.getNumero());
            stmt.setString(11, paciente.getTelefone());
            stmt.setString(12, paciente.getCelular());
            stmt.setString(13, paciente.getEmail());
           
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean deletar(Connection conexao, Paciente paciente) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "DELETE FROM paciente WHERE cpf=?;");
            stmt.setString(1, paciente.getCpf());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
  
        
    public ArrayList<Paciente> listar(Connection conexao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "SELECT cod_paciente, nome,cpf, datanascimento, sexo, uf, cidade, bairro, rua, numero, cep, telefone, celular, email FROM paciente;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Paciente> listaPaciente = new ArrayList<>();
            while(resultado.next()){
                    Paciente aux = new Paciente();

                    aux.setcodPaciente(resultado.getInt("cod_paciente"));
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

                    listaPaciente.add(aux);
                }
                return listaPaciente;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
     }
    
    //funcao atualiza banco
    public boolean atualizar(Connection conexao, Paciente paciente) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE paciente"
                       +" SET nome=?,cpf=?,datanascimento=?,sexo=?,uf=?"
                       + ",cidade=?,bairro=?,cep=?,rua=?,numero=?"
                       + ",telefone=?,celular=?,email=?"                          
                       + " WHERE cpf=?;");
                    
            stmt.setString(1, paciente.getNome().toString());
            stmt.setString(2, paciente.getCpf().toString());
            stmt.setString(3, paciente.getDataNascimento().toString());
            stmt.setString(4, paciente.getSexo().toString());
            stmt.setString(5, paciente.getUf().toString());
            stmt.setString(6, paciente.getCidade().toString());
            stmt.setString(7, paciente.getBairro().toString());
            stmt.setString(8, paciente.getCep().toString());
            stmt.setString(9, paciente.getRua().toString());
            stmt.setString(10, paciente.getNumero().toString());
            stmt.setString(11, paciente.getTelefone().toString());
            stmt.setString(12, paciente.getCelular().toString());
            stmt.setString(13, paciente.getEmail().toString());
            stmt.setString(14, paciente.getCpf().toString());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}