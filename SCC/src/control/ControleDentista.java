package control;

import crud.DentistaCrud;
import database.Database;
import domain.Dentista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleDentista {
   private Connection conn;
   private Database db;

     public boolean verificarDentista(Dentista dentista) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT cpf "
                    + "FROM dentista "
                    + "WHERE cpf=? "
                    + "  LIMIT 1;");

            
            stmt.setString(1, dentista.getCpf());
            
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

    public boolean cadastrarDentista(Dentista dentista) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            DentistaCrud dentistacrud = new DentistaCrud();
            
            dentistacrud.inserir(this.conn, dentista);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    public boolean deletarDentista(Dentista dentista) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            DentistaCrud dentistacrud = new DentistaCrud();
            
            dentistacrud.deletar(this.conn, dentista);
            
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Dentista> exibirDentista() {
        ArrayList<Dentista> listaDentista = new ArrayList<>();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            DentistaCrud dentistacrud = new DentistaCrud();
            
            listaDentista = dentistacrud.listar(conn);
            
            this.db.desconectar(this.conn);
            return listaDentista;
        }catch (Exception ex) {
            return null;
        }
    }
    
    public Dentista verificarCpfDentista(String cpf) {
        Dentista paci = new Dentista();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(                    
                    "SELECT * FROM dentista "
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
    
    public boolean atualizarDentista(Dentista dentista) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            DentistaCrud dentistacrud = new DentistaCrud();
            
            dentistacrud.atualizar(this.conn, dentista);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}