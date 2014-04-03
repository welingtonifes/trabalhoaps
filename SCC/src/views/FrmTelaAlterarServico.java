
package views;

import control.ControleServico;
import domain.Servico;
import javax.swing.JOptionPane;

public class FrmTelaAlterarServico extends javax.swing.JFrame {
    Servico backupServico = new Servico();
    private ControleServico controleServico;
    
    public FrmTelaAlterarServico() {
        initComponents();
        controleServico = new ControleServico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoPlanoSaude = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlTipoSercivo = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jtfTipoServico = new javax.swing.JTextField();
        jlAceitaPlanoSaude = new javax.swing.JLabel();
        jrbSim = new javax.swing.JRadioButton();
        jrbNao = new javax.swing.JRadioButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtfValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Dados do Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atualizar Dados do Serviço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jlTipoSercivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTipoSercivo.setText("Tipo Serviço:");

        jlValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlValor.setText("Valor:");

        jlAceitaPlanoSaude.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlAceitaPlanoSaude.setText("Aceita Plano de Saúde:");

        btGrupoPlanoSaude.add(jrbSim);
        jrbSim.setText("Sim");

        btGrupoPlanoSaude.add(jrbNao);
        jrbNao.setText("Não");

        jbSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalvar.setForeground(new java.awt.Color(0, 102, 255));
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(0, 102, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNao)
                        .addGap(207, 207, 207))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlTipoSercivo)
                                    .addGap(115, 115, 115))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAceitaPlanoSaude)
                                    .addComponent(jbSalvar))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValor)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCancelar))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoSercivo)
                    .addComponent(jlValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlAceitaPlanoSaude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbSim)
                    .addComponent(jrbNao))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(355, 241));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Servico servico = new Servico();
        //verifica se os dados estão todos prenchidos antes de enviar para a base de dados  
        if((validaCampos() == true)) {       
            servico.setTipoServico(this.jtfTipoServico.getText());
            servico.setValor(Double.parseDouble(this.jtfValor.getText()));
            if(jrbSim.isSelected()){
                servico.setAceitaPlanoSaude("Sim");
            }
            if(jrbNao.isSelected()){
                servico.setAceitaPlanoSaude("Nao");
            }
               
            //verificar se o servico ja existe no banco            
            if(controleServico.atualizarServico(servico)){
                  JOptionPane.showMessageDialog(this, "Serviço atualizado com sucesso!");
                  limparCampos();
                  this.dispose();
            }
            else{
                  JOptionPane.showMessageDialog(this, "Não foi posivel salvar no banco de dados!");
                  this.dispose();
           }  
        } 
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        this.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true); 
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTelaAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmTelaAlterarServico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGrupoPlanoSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlAceitaPlanoSaude;
    private javax.swing.JLabel jlTipoSercivo;
    private javax.swing.JLabel jlValor;
    public javax.swing.JRadioButton jrbNao;
    public javax.swing.JRadioButton jrbSim;
    public javax.swing.JTextField jtfTipoServico;
    public javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables
    
    public boolean validaCampos() {  
        if(!(jtfTipoServico.getText().matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){
            JOptionPane.showMessageDialog(this, "Informe um servico válido!");
            jtfTipoServico.setText("");
            jtfTipoServico.requestFocus();
            return false;
        }
        if(!(jtfValor.getText().matches("^[0-9]+"))){    
            JOptionPane.showMessageDialog(this, "Informe um valor válido!");
            jtfValor.setText("");
            jtfValor.requestFocus();
            return false;
        }       
       
        if(!(jrbSim.isSelected()) && !(jrbNao.isSelected())){
            JOptionPane.showMessageDialog(this, "Informe uma opção valida!");
            jrbSim.requestFocus();
            return false;
        }  
    
       
        return true;
    }
    //funcao limpar campos
    public void limparCampos() {        
        jtfTipoServico.setText("");
        jtfValor.setText("");
        btGrupoPlanoSaude.clearSelection();    
        //retorna foco para tipo de servico(primeiro item do cadastro)
        jtfTipoServico.requestFocus();
    }
    
}
