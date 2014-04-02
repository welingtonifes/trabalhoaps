/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Servico;
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
public class ServicoCrud {
    public boolean inserir(Connection conexao, Servico servico) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(                   
                    "INSERT INTO servico(nome,cpf,datanascimento,sexo,uf,cidade,bairro,cep,rua,numero,telefone,celular,email)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
 /*           stmt.setString(1, servico.getNome());
            stmt.setString(2, servico.getCpf());
            stmt.setString(3, servico.getDataNascimento());
   */        
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean deletar(Connection conexao, Servico servico) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "DELETE FROM servico WHERE cpf=?;");
  //          stmt.setString(1, servico.getCpf());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
  
        
    public ArrayList<Servico> listar(Connection conexao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "SELECT cod_servico, nome,cpf, datanascimento, sexo, uf, cidade, bairro, rua, numero, cep, telefone, celular, email FROM servico;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Servico> listaServico = new ArrayList<>();
            while(resultado.next()){
                    Servico aux = new Servico();
/*
                    aux.setcodServico(resultado.getInt("cod_servico"));
                    aux.setNome(resultado.getString("nome"));
                    aux.setCpf(resultado.getString("cpf"));
                    aux.setDataNascimento(resultado.getString("datanascimento"));
*/
                    listaServico.add(aux);
                }
                return listaServico;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
     }
    
    //funcao atualiza banco
    public boolean atualizar(Connection conexao, Servico servico) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE servico"
                       +" SET nome=?,cpf=?,datanascimento=?,sexo=?,uf=?"
                       + ",cidade=?,bairro=?,cep=?,rua=?,numero=?"
                       + ",telefone=?,celular=?,email=?"                          
                       + " WHERE cpf=?;");
/*                    
            stmt.setString(1, servico.getNome().toString());
            stmt.setString(2, servico.getCpf().toString());
            stmt.setString(3, servico.getDataNascimento().toString());
*/

            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}