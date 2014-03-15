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
    public void remover(ArrayList<Paciente> listaPaciente) {
        String aux = ((JOptionPane.showInputDialog("Informe o cpf do Paciente que deseja excluir")));
        boolean teste = false;//usado para informar se cliente não existe no ArrayList
        for (int i = 0; i < listaPaciente.size(); i++){                        
           if(listaPaciente.get(i).getCpf().equals(aux)){
               listaPaciente.remove(i);
               teste = true;
               JOptionPane.showMessageDialog(null, "\nCliente removido com sucesso!");
               break;//usado para sair do for assim que achar o cliente pesquisado
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nCliente não encontrado na base de dados!");
        }
    }
    //funçao para exibir pacientes da lista
    public static void exibir() {
            for (int i = 0; i < listaPaciente.size(); i++){                        
                    JOptionPane.showMessageDialog(null, ""
                    +"\nNome: "     + listaPaciente.get(i).getNome()
                    +"\nCPF: "     + listaPaciente.get(i).getCpf()
                    +"\n-----------------------");

         }
    } 
}
