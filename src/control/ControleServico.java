/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import domain.Servico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class ControleServico {
    Servico serv = new Servico(); 
    //ArrayList de servicos
    public static ArrayList<Servico> listaServico = new ArrayList<>();	
    /**
     * Operação para inserir novo servico.
     * @param serv
     */
    //funçao para inserir servico na lista
    public static void inserir(Servico serv) {
              listaServico.add(serv);             
//            JOptionPane.showMessageDialog(null, "\nServico inserido removido com sucesso!");
    }
    //funçao para remover servico na lista
    public static void remover(String tipoServico) {
        boolean teste = false;
        if(!(tipoServico.matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){    
            JOptionPane.showMessageDialog(null, "Informe um servico válido!");
        }    
        
        for (int i = 0; i < listaServico.size(); i++){                        
           if(listaServico.get(i).getTipoServico().equals(tipoServico)){
               listaServico.remove(i);
               JOptionPane.showMessageDialog(null, "\nServiço removido com sucesso!");
               teste = true;
               break;
           }
        }
        if(teste == false){
            JOptionPane.showMessageDialog(null, "\nServico não encontrada na base de dados!");
        }
    }
    //funçao para consultar pacientes na lista e retornar os dados do paciente
    public static Servico consultarLista(String tipoServico) {
        boolean teste = false;
        Servico serv = new Servico(); 
        for (int i = 0; i < listaServico.size(); i++){                        
           if(listaServico.get(i).getTipoServico().equals(tipoServico)){
               //grava os dados do paciente antes de remove-lo do arraylist
               serv = listaServico.get(i);
               //remove o paciente achado no arrayList
               listaServico.remove(i);
               teste = true;
           }
        }
        if(teste == false){
            serv = null;
            JOptionPane.showMessageDialog(null, "\nServiço não encontrado na base de dados!");            
        }
        //retorna o paciente achado no arraylist e usa estes dados para preencher a 
        //form cadastrarPaciente para alteração dos dados
        return serv;
    }
}
