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
}
