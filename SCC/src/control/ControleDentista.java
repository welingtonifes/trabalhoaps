package control;

import domain.Dentista;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControleDentista {
    Dentista dent = new Dentista(); 
    //ArrayList de pacientes
    public static ArrayList<Dentista> listaDentista = new ArrayList<>();	
    /**
     * Operação para inserir novo paciente.
     * @param dent
     */
    //funçao para inserir pacientes na lista
    public static void inserir(Dentista dent) {
              listaDentista.add(dent);             
//            JOptionPane.showMessageDialog(null, "\nPaciente inserido removido com sucesso!");
    }
    //funçao para remover pacientes na lista
    public void remover(ArrayList<Dentista> listaDentista) {
        String aux = ((JOptionPane.showInputDialog("Informe o cpf do Dentista que deseja excluir")));
        boolean teste = false;//usado para informar se cliente não existe no ArrayList
        for (int i = 0; i < listaDentista.size(); i++){                        
           if(listaDentista.get(i).getCpf().equals(aux)){
               listaDentista.remove(i);
               teste = true;
               JOptionPane.showMessageDialog(null, "\nDentista removido com sucesso!");
               break;//usado para sair do for assim que achar o cliente pesquisado
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nDentista não encontrado na base de dados!");
        }
    }    
}
