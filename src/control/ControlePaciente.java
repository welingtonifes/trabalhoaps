package control;

import domain.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlePaciente {
    Paciente paci = new Paciente(); 
    //ArrayList de pacientes
    public static ArrayList<Paciente> listaPaciente = new ArrayList<>();	
    /**
     * Operação para inserir novo paciente.
     * @param paci
     */
    //funçao para inserir pacientes na lista
    public static void inserir(Paciente paci) {
              listaPaciente.add(paci);             
//            JOptionPane.showMessageDialog(null, "\nPaciente inserido removido com sucesso!");
    }
    //funçao para remover pacientes na lista
    public static void remover(String cpf) {

  //      String aux = ((JOptionPane.showInputDialog("Informe o cpf do Paciente que deseja excluir")));
        boolean teste = false;//usado para informar se cliente não existe no ArrayList       
        if(!(cpf.matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))){    
            JOptionPane.showMessageDialog(null, "Informe um cpf válido!");
        }    
        
        for (int i = 0; i < listaPaciente.size(); i++){                        
           if(listaPaciente.get(i).getCpf().equals(cpf)){
               listaPaciente.remove(i);
               JOptionPane.showMessageDialog(null, "\nPaciente removido com sucesso!");
               teste = true;
               break;//usado para sair do for assim que achar o cliente pesquisado
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nPaciente não encontrado na base de dados!");
        }
    } 
    //funçao para consultar pacientes na lista e retornar os dados do paciente
    public static Paciente consultarLista(String cpf) {
        boolean teste = false;
        Paciente paci = new Paciente(); 
        for (int i = 0; i < listaPaciente.size(); i++){                        
           if(listaPaciente.get(i).getCpf().equals(cpf)){
               //grava os dados do paciente antes de remove-lo do arraylist
               paci = listaPaciente.get(i);
               //remove o paciente achado no arrayList
               listaPaciente.remove(i);
               teste = true;
           }
        }
        if(teste == false){
            paci = null;
            JOptionPane.showMessageDialog(null, "\nPaciente não encontrado na base de dados!");            
        }
        //retorna o paciente achado no arraylist e usa estes dados para preencher a 
        //form cadastrarPaciente para alteração dos dados
        return paci;
    } 
}