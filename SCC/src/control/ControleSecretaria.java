package control;

import crud.SecretariaCrud;
import database.Database;
import domain.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleSecretaria {
   private Connection conn;
   private Database db;

     public boolean verificarSecretaria(Secretaria secretaria) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(
                    "SELECT cpf "
                    + "FROM secretaria "
                    + "WHERE cpf=? "
                    + "  LIMIT 1;");

            
            stmt.setString(1, secretaria.getCpf());
            
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

    public boolean cadastrarSecretaria(Secretaria secretaria) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            SecretariaCrud secretariacrud = new SecretariaCrud();
            
            secretariacrud.inserir(this.conn, secretaria);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    public boolean deletarSecretaria(Secretaria secretaria) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            SecretariaCrud secretariacrud = new SecretariaCrud();
            
            secretariacrud.deletar(this.conn, secretaria);
            
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
    
    public ArrayList<Secretaria> exibirSecretaria() {
        ArrayList<Secretaria> listaSecretaria = new ArrayList<>();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            SecretariaCrud secretariacrud = new SecretariaCrud();
            
            listaSecretaria = secretariacrud.listar(conn);
            
            this.db.desconectar(this.conn);
            return listaSecretaria;
        }catch (Exception ex) {
            return null;
        }
    }
    
    public Secretaria verificarCpfSecretaria(String cpf) {
        Secretaria secretaria = new Secretaria();
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            PreparedStatement stmt;
            stmt = this.conn.prepareStatement(                    
                    "SELECT * FROM secretaria "
                        + "WHERE cpf=? "
                        + "  LIMIT 1;");
            stmt.setString(1, cpf);                         
            ResultSet resultado = stmt.executeQuery();      

            if (resultado.next()) {
                secretaria.setNome(resultado.getString("nome"));
                secretaria.setCpf(resultado.getString("cpf"));
                secretaria.setDataNascimento(resultado.getString("datanascimento"));
                secretaria.setSexo(resultado.getString("sexo"));
                secretaria.setUf(resultado.getString("uf"));
                secretaria.setCidade(resultado.getString("cidade"));
                secretaria.setBairro(resultado.getString("bairro"));
                secretaria.setCep(resultado.getString("cep"));
                secretaria.setRua(resultado.getString("rua"));
                secretaria.setNumero(resultado.getString("numero"));
                secretaria.setTelefone(resultado.getString("telefone"));
                secretaria.setCelular(resultado.getString("celular"));
                secretaria.setEmail(resultado.getString("email"));                             
                db.desconectar(this.conn);                            
                return secretaria;
            } else {
                return null;
            }

        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
    
    public boolean atualizarSecretaria(Secretaria secretaria) {
        try {
            this.db = new Database();
            this.conn = this.db.conectar();
            SecretariaCrud secretariacrud = new SecretariaCrud();
            
            secretariacrud.atualizar(this.conn, secretaria);
         
            this.db.desconectar(this.conn);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}