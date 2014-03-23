package control;

import domain.Secretaria;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleSecretaria {
    Secretaria sec = new Secretaria(); 
    //ArrayList de secretarias
    public static ArrayList<Secretaria> listaSecretaria = new ArrayList<>();	
    /**
     * Operação para inserir nova secretaria.
     * @param sec
     */
    //funçao para inserir secretarias na lista
    public static void inserir(Secretaria sec) {
              listaSecretaria.add(sec);             
//            JOptionPane.showMessageDialog(null, "\nSecretaria inserido removido com sucesso!");
    }
    //funçao para remover secretarias na lista
    public static void remover(String cpf) {
        boolean teste = false;
        if(!(cpf.matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))){    
            JOptionPane.showMessageDialog(null, "Informe um cpf válido!");
        }    
        
        for (int i = 0; i < listaSecretaria.size(); i++){                        
           if(listaSecretaria.get(i).getCpf().equals(cpf)){
               listaSecretaria.remove(i);
               JOptionPane.showMessageDialog(null, "\nSecretaria(o) removida com sucesso!");
               teste = true;
               break;
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nSecretaria(o) não encontrada na base de dados!");
            
        }
    }
    //funçao para consultar pacientes na lista e retornar os dados do paciente
    public static Secretaria consultarLista(String cpf) {
        boolean teste = false;
        Secretaria sec = new Secretaria(); 
        for (int i = 0; i < listaSecretaria.size(); i++){                        
           if(listaSecretaria.get(i).getCpf().equals(cpf)){
               //grava os dados do paciente antes de remove-lo do arraylist
               sec = listaSecretaria.get(i);
               //remove o paciente achado no arrayList
               listaSecretaria.remove(i);
               teste = true;
               break;
           }
        }
        if(teste == false){
            sec = null;
            JOptionPane.showMessageDialog(null, "\nSecretaria não encontrada na base de dados!");            
        }
        //retorna o paciente achado no arraylist e usa estes dados para preencher a 
        //form cadastrarPaciente para alteração dos dados
        return sec;
    }
}