/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Random;

/**
 *
 * @author Gomes
 */
public class Servico {
    private int codigo;
    private String tipoServico;  
    private double valor;
    private String aceitaPlanoSaude;

    public String getAceitaPlanoSaude() {
        return aceitaPlanoSaude;
    }

    public void setAceitaPlanoSaude(String aceitaPlanoSaude) {
        this.aceitaPlanoSaude = aceitaPlanoSaude;
    }

    public int getCodigo() {
        return codigo;
    }

     public void setCodigo() {
        //gera codigo aleatorio para cada serviço inserido
        Random gerador = new Random();        
        this.codigo = gerador.nextInt(90000);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

   
}
