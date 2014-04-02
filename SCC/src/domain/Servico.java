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
    private int codServico;
    private String tipoServico;  
    private double valor;
    private String aceitaPlanoSaude;

    public String getAceitaPlanoSaude() {
        return aceitaPlanoSaude;
    }

    public void setAceitaPlanoSaude(String aceitaPlanoSaude) {
        this.aceitaPlanoSaude = aceitaPlanoSaude;
    }

    public int getCodServico() {
        return codServico;
    }

     public void setCodServico(int cod_servico) {
        this.codServico = cod_servico;
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
