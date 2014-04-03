package control;

import crud.ServicoCrud;
import database.Database;
import domain.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleServico {
   private Connection conn;
   private Database db;

     public boolean verificarServico(Servico servico) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT tipo_servico "
                    + "FROM servico "
                    + "WHERE tipo_servico=? "
                    + "  LIMIT 1;");

            
            stmt.setString(1, servico.getTipoServico());
            
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

    public boolean cadastrarServico(Servico servico) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            ServicoCrud servicocrud = new ServicoCrud();
            
            servicocrud.inserir(this.conn, servico);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    public boolean deletarServico(Servico servico) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            ServicoCrud servicocrud = new ServicoCrud();
            
            servicocrud.deletar(this.conn, servico);
            
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Servico> exibirServico() {
        ArrayList<Servico> listaServico = new ArrayList<>();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            ServicoCrud servicocrud = new ServicoCrud();
            
            listaServico = servicocrud.listar(conn);
            
            this.db.desconectar(this.conn);
            return listaServico;
        }catch (Exception ex) {
            return null;
        }
    }
    
    public Servico verificarServicoTipoServico(String tipoServico) {
        Servico serv = new Servico();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(                    
                    "SELECT * FROM servico "
                        + "WHERE tipo_servico=? "
                        + "  LIMIT 1;");
            stmt.setString(1, tipoServico);                         
            ResultSet resultado = stmt.executeQuery();      

            if (resultado.next()) {
               
                serv.setTipoServico(resultado.getString("tipo_servico"));
//                String valor = (resultado.getString("valor"));
//                serv.setValor(Double.parseDouble(valor));
                serv.setValor(resultado.getDouble("valor")); 
                serv.setAceitaPlanoSaude(resultado.getString("aceita_plano"));    
                db.desconectar(this.conn);                            
                return serv;
            } else {
                return null;
            }

        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
    
    public boolean atualizarServico(Servico servico) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            ServicoCrud servicocrud = new ServicoCrud();
            
            servicocrud.atualizar(this.conn, servico);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}