
package crud;

import domain.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServicoCrud {
    public boolean inserir(Connection conexao, Servico servico) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                   
                    "INSERT INTO servico(tipo_servico,valor,aceita_plano)"
                    + "VALUES (?,?,?);");
            stmt.setString(1, servico.getTipoServico());
            stmt.setDouble(2, servico.getValor());
            stmt.setString(3, servico.getAceitaPlanoSaude());
            
           
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
                    "DELETE FROM servico WHERE tipo_servico=?;");
            stmt.setString(1, servico.getTipoServico());
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
                    "SELECT cod_servico, tipo_servico,valor, aceita_plano FROM servico;");

            ResultSet resultado = stmt.executeQuery();
            ArrayList<Servico> listaServico = new ArrayList<>();
            while(resultado.next()){
                Servico aux = new Servico();

                 aux.setCodServico(resultado.getInt("cod_servico"));
                 aux.setTipoServico(resultado.getString("tipo_servico"));
                 aux.setValor(resultado.getDouble("valor"));
                 aux.setAceitaPlanoSaude(resultado.getString("aceita_plano"));

                listaServico.add(aux);

            }
            return listaServico;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
        }
}
     public boolean atualizar(Connection conexao,Servico servico) {
        try {
            PreparedStatement stmt = conexao.prepareStatement(
                    "UPDATE servico"
                        + " SET tipo_servico=?,valor=?,aceita_plano=?"
                        + " WHERE tipo_servico=?;");
                    
             stmt.setString(1, servico.getTipoServico().toString());
             stmt.setDouble(2, servico.getValor());
             stmt.setString(3, servico.getAceitaPlanoSaude().toString());
             stmt.setString(4, servico.getTipoServico().toString());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return false;
        }
    }
}
