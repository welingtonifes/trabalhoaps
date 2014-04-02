package control;

import crud.PacienteCrud;
import database.Database;
import domain.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlePaciente {
   private Connection conn;
   private Database db;

     public boolean verificarPaciente(Paciente paciente) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT cpf "
                    + "FROM paciente "
                    + "WHERE cpf=? "
                    + "  LIMIT 1;");

            
            stmt.setString(1, paciente.getCpf());
            
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

    public boolean cadastrarPaciente(Paciente paciente) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PacienteCrud pacientecrud = new PacienteCrud();
            
            pacientecrud.inserir(this.conn, paciente);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    public boolean deletarPaciente(Paciente paciente) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PacienteCrud pacientecrud = new PacienteCrud();
            
            pacientecrud.deletar(this.conn, paciente);
            
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Paciente> exibirPaciente() {
        ArrayList<Paciente> listaPaciente = new ArrayList<>();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PacienteCrud pacientecrud = new PacienteCrud();
            
            listaPaciente = pacientecrud.listar(conn);
            
            this.db.desconectar(this.conn);
            return listaPaciente;
        }catch (Exception ex) {
            return null;
        }
    }
    
    public Paciente verificarCpfPaciente(String cpf) {
        Paciente paci = new Paciente();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(                    
                    "SELECT * FROM paciente "
                        + "WHERE cpf=? "
                        + "  LIMIT 1;");
            stmt.setString(1, cpf);                         
            ResultSet resultado = stmt.executeQuery();      

            if (resultado.next()) {
                paci.setNome(resultado.getString("nome"));
                paci.setCpf(resultado.getString("cpf"));
                paci.setDataNascimento(resultado.getString("datanascimento"));
                paci.setSexo(resultado.getString("sexo"));
                paci.setUf(resultado.getString("uf"));
                paci.setCidade(resultado.getString("cidade"));
                paci.setBairro(resultado.getString("bairro"));
                paci.setCep(resultado.getString("cep"));
                paci.setRua(resultado.getString("rua"));
                paci.setNumero(resultado.getString("numero"));
                paci.setTelefone(resultado.getString("telefone"));
                paci.setCelular(resultado.getString("celular"));
                paci.setEmail(resultado.getString("email"));                             
                db.desconectar(this.conn);                            
                return paci;
            } else {
                return null;
            }

        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
    
    public boolean atualizarPaciente(Paciente paciente) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PacienteCrud pacientecrud = new PacienteCrud();
            
            pacientecrud.atualizar(this.conn, paciente);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}