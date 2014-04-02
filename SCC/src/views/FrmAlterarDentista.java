package views;

import control.ControleDentista;
import domain.Dentista;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class FrmAlterarDentista extends javax.swing.JFrame {
    Dentista dentista = new Dentista();
//    static Dentista backupDentista = new Dentista();
    private ControleDentista controleDentista;
    MaskFormatter formatoCpf;
    public FrmAlterarDentista() {
        initComponents();
        controleDentista = new ControleDentista();
        this.setLocationRelativeTo(null);
        dentista = new Dentista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDeletarPaciente = new javax.swing.JLabel();
        jbAlterar = new javax.swing.JButton();
        jbCancelarExclusao = new javax.swing.JButton();
        try{
            formatoCpf = new MaskFormatter("###.###.###-##");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jtfAlterarDentistaCpf = new JFormattedTextField(formatoCpf);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlDeletarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlDeletarPaciente.setText("INFORME O CPF DO DENTISTA QUE DESEJA ALTERAR:");

        jbAlterar.setText("ALTERAR");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbCancelarExclusao.setText("CANCELAR");
        jbCancelarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarExclusaoActionPerformed(evt);
            }
        });

        jtfAlterarDentistaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlterarDentistaCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlDeletarPaciente)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelarExclusao)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jtfAlterarDentistaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlDeletarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAlterarDentistaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbCancelarExclusao))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(315, 125));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
//consulta o bd  pra verificar se o dentista existe e possui dados via cpf
        try{
            dentista = controleDentista.verificarCpfDentista(jtfAlterarDentistaCpf.getText());

            FrmTelaAlterarDentista telaAlteraDentista = new FrmTelaAlterarDentista();
            this.setLocationRelativeTo(null);
            telaAlteraDentista.jtfNome.setText(dentista.getNome());
            telaAlteraDentista.jftCpf.setText(dentista.getCpf());     
            if(dentista.getSexo().equals("Feminino")){
                telaAlteraDentista.jrFeminino.setSelected(true);
            }
            if(dentista.getSexo().equals("Masculino")){
                telaAlteraDentista.jrMasculino.setSelected(true);
            }        
            telaAlteraDentista.jftNascimento.setText(dentista.getDataNascimento());
            telaAlteraDentista.jtfCidade.setText(dentista.getCidade());
            telaAlteraDentista.jtfBairro.setText(dentista.getBairro());
            telaAlteraDentista.jtfRua.setText(dentista.getRua());
            telaAlteraDentista.jtfNumero.setText(dentista.getNumero());                
            telaAlteraDentista.jcbUf.setSelectedItem(dentista.getUf());        
            telaAlteraDentista.jftCep.setText(dentista.getCep());
            telaAlteraDentista.jftTelefone.setText(dentista.getTelefone());
            telaAlteraDentista.jftCelular.setText(dentista.getCelular());
            telaAlteraDentista.jtfEmail.setText(dentista.getEmail());

            telaAlteraDentista.setVisible(true);
            //remove o botao limpar da tela preenchida
            //telaCadastraDentista.remove(telaCadastraDentista.jbLimpar);
            //desabilita o botao cpf
            telaAlteraDentista.jftCpf.disable();
            this.dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cpf não registrado no banco de dados!\n Por favor, informe outro.");  
            jtfAlterarDentistaCpf.setText("");
            jtfAlterarDentistaCpf.setRequestFocusEnabled(true);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfAlterarDentistaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlterarDentistaCpfActionPerformed
     
    }//GEN-LAST:event_jtfAlterarDentistaCpfActionPerformed

    private void jbCancelarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarExclusaoActionPerformed
        this.dispose();
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        this.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jbCancelarExclusaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlterarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlterarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlterarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlterarDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterarDentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelarExclusao;
    private javax.swing.JLabel jlDeletarPaciente;
    private javax.swing.JTextField jtfAlterarDentistaCpf;
    // End of variables declaration//GEN-END:variables
}
