package control;

import domain.Dentista;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControleDentista {
    Dentista dent = new Dentista(); 
    //ArrayList de Dentista
    public static ArrayList<Dentista> listaDentista = new ArrayList<>();	
    /**
     * Operação para inserir novo Dentista.
     * @param dent
     */
    //funçao para inserir Dentistas na lista
    public static void inserir(Dentista dent) {
              listaDentista.add(dent);             
//            JOptionPane.showMessageDialog(null, "\nPaciente inserido removido com sucesso!");
    }
    //funçao para remover Dentistas na lista
    public static void remover(String cpf) {
  //      String aux = ((JOptionPane.showInputDialog("Informe o cpf do Paciente que deseja excluir")));
        boolean teste = false;//usado para informar se cliente não existe no ArrayList       
        if(!(cpf.matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))){    
            JOptionPane.showMessageDialog(null, "Informe um cpf válido!");
        }    
        
        for (int i = 0; i < listaDentista.size(); i++){                        
           if(listaDentista.get(i).getCpf().equals(cpf)){
               listaDentista.remove(i);
               JOptionPane.showMessageDialog(null, "\nDentista removido com sucesso!");
               teste = true;
               break;//usado para sair do for assim que achar o cliente pesquisado
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nDentista não encontrado na base de dados!");
        }
    }
    //funçao para consultar pacientes na lista e retornar os dados do paciente
    public static Dentista consultarLista(String cpf) {
        boolean teste = false;
        Dentista dent = new Dentista(); 
        for (int i = 0; i < listaDentista.size(); i++){                        
           if(listaDentista.get(i).getCpf().equals(cpf)){
               //grava os dados do paciente antes de remove-lo do arraylist
               dent = listaDentista.get(i);
               //remove o paciente achado no arrayList
               listaDentista.remove(i);
               teste = true;
           }
        }
        if(teste == false){
            dent = null;
            JOptionPane.showMessageDialog(null, "\nSecretaria não encontrada na base de dados!");            
        }
        //retorna o paciente achado no arraylist e usa estes dados para preencher a 
        //form cadastrarPaciente para alteração dos dados
        return dent;
    }
}