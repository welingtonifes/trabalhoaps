package views;

public class FrmTelaPrincipal extends javax.swing.JFrame {
    //variavael para remover cliente do arraylist pelo metodo remover
 //   String cpf;

    public FrmTelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastar = new javax.swing.JMenu();
        jmiCadastrarPaciente = new javax.swing.JMenuItem();
        jmiCadastrarDentista = new javax.swing.JMenuItem();
        jmiCadastarSecretaria = new javax.swing.JMenuItem();
        jmiCadastaraServico = new javax.swing.JMenuItem();
        jmDeletar = new javax.swing.JMenu();
        jmiDeletarPaciente = new javax.swing.JMenuItem();
        jmiDeletarDentista = new javax.swing.JMenuItem();
        jmiDeletarSecretaria = new javax.swing.JMenuItem();
        jmiDeletarServico = new javax.swing.JMenuItem();
        jmAlterar = new javax.swing.JMenu();
        jmiAlterarPaciente = new javax.swing.JMenuItem();
        jmiAlterarDentista = new javax.swing.JMenuItem();
        jmiAlterarSecretaria = new javax.swing.JMenuItem();
        jmiAlteraServico = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmiRelatorioCliente = new javax.swing.JMenuItem();
        jmiRelatorioDentista = new javax.swing.JMenuItem();
        jmiRelatorioSecretaria = new javax.swing.JMenuItem();
        jmiRelatorioServico = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSClinicas");
        setResizable(false);

        jmCadastar.setBorder(null);
        jmCadastar.setText("Cadastrar");

        jmiCadastrarPaciente.setText("Paciente");
        jmiCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarPacienteActionPerformed(evt);
            }
        });
        jmCadastar.add(jmiCadastrarPaciente);

        jmiCadastrarDentista.setText("Dentista");
        jmiCadastrarDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarDentistaActionPerformed(evt);
            }
        });
        jmCadastar.add(jmiCadastrarDentista);

        jmiCadastarSecretaria.setText("Secretária");
        jmiCadastarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastarSecretariaActionPerformed(evt);
            }
        });
        jmCadastar.add(jmiCadastarSecretaria);

        jmiCadastaraServico.setText("Serviço");
        jmiCadastaraServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastaraServicoActionPerformed(evt);
            }
        });
        jmCadastar.add(jmiCadastaraServico);

        jMenuBar1.add(jmCadastar);

        jmDeletar.setBorder(null);
        jmDeletar.setText("Deletar");

        jmiDeletarPaciente.setText("Paciente");
        jmiDeletarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarPacienteActionPerformed(evt);
            }
        });
        jmDeletar.add(jmiDeletarPaciente);

        jmiDeletarDentista.setText("Dentista");
        jmiDeletarDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarDentistaActionPerformed(evt);
            }
        });
        jmDeletar.add(jmiDeletarDentista);

        jmiDeletarSecretaria.setText("Secretaria");
        jmiDeletarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarSecretariaActionPerformed(evt);
            }
        });
        jmDeletar.add(jmiDeletarSecretaria);

        jmiDeletarServico.setText("Serviço");
        jmiDeletarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarServicoActionPerformed(evt);
            }
        });
        jmDeletar.add(jmiDeletarServico);

        jMenuBar1.add(jmDeletar);

        jmAlterar.setBorder(null);
        jmAlterar.setText("Alterar");

        jmiAlterarPaciente.setText("Paciente");
        jmiAlterarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarPacienteActionPerformed(evt);
            }
        });
        jmAlterar.add(jmiAlterarPaciente);

        jmiAlterarDentista.setText("Dentista");
        jmiAlterarDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarDentistaActionPerformed(evt);
            }
        });
        jmAlterar.add(jmiAlterarDentista);

        jmiAlterarSecretaria.setText("Secretaria");
        jmiAlterarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarSecretariaActionPerformed(evt);
            }
        });
        jmAlterar.add(jmiAlterarSecretaria);

        jmiAlteraServico.setText("Serviço");
        jmiAlteraServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlteraServicoActionPerformed(evt);
            }
        });
        jmAlterar.add(jmiAlteraServico);

        jMenuBar1.add(jmAlterar);

        jmRelatorios.setBorder(null);
        jmRelatorios.setText("Relatorios");

        jmiRelatorioCliente.setText("Pacientes");
        jmiRelatorioCliente.setActionCommand("");
        jmiRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioClienteActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelatorioCliente);

        jmiRelatorioDentista.setText("Dentistas");
        jmiRelatorioDentista.setActionCommand("");
        jmiRelatorioDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioDentistaActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelatorioDentista);

        jmiRelatorioSecretaria.setText("Secretárias");
        jmiRelatorioSecretaria.setActionCommand("");
        jmiRelatorioSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioSecretariaActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelatorioSecretaria);

        jmiRelatorioServico.setText("Serviços");
        jmiRelatorioServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioServicoActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelatorioServico);

        jMenuBar1.add(jmRelatorios);

        jmSair.setBorder(null);
        jmSair.setText("Sair");

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmSair.add(jmiSair);

        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(616, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarPacienteActionPerformed
        FrmTelaCadastrarPaciente telaCadastraPaciente = new FrmTelaCadastrarPaciente();
        telaCadastraPaciente.setLocationRelativeTo(null);       
        telaCadastraPaciente.setVisible(true);
        telaCadastraPaciente.limparCampos();       
        this.dispose();                  
    }//GEN-LAST:event_jmiCadastrarPacienteActionPerformed

    private void jmiAlterarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarPacienteActionPerformed
        FrmAlterarPaciente frm = new FrmAlterarPaciente();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAlterarPacienteActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioClienteActionPerformed
        FrmRelatorioPacientesCadastrados frmRelatorioPacientesCadastrados = new FrmRelatorioPacientesCadastrados();
        frmRelatorioPacientesCadastrados.setLocationRelativeTo(null);
        frmRelatorioPacientesCadastrados.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jmiRelatorioClienteActionPerformed

    private void jmiDeletarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarPacienteActionPerformed
        FrmDeletarPaciente frm = new FrmDeletarPaciente();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiDeletarPacienteActionPerformed

    private void jmiDeletarDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarDentistaActionPerformed
        FrmDeletarDentista frm = new FrmDeletarDentista();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiDeletarDentistaActionPerformed

    private void jmiCadastrarDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarDentistaActionPerformed
        FrmTelaCadastrarDentista telaCadastraDentista = new FrmTelaCadastrarDentista();
        telaCadastraDentista.setLocationRelativeTo(null);
        telaCadastraDentista.setVisible(true);
        telaCadastraDentista.limparCampos();       
        this.dispose();
    }//GEN-LAST:event_jmiCadastrarDentistaActionPerformed

    private void jmiRelatorioDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioDentistaActionPerformed
        FrmRelatorioDentistasCadastrados frmRelatorioDentistasCadastrados = new FrmRelatorioDentistasCadastrados();
        frmRelatorioDentistasCadastrados.setLocationRelativeTo(null);
        frmRelatorioDentistasCadastrados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiRelatorioDentistaActionPerformed

    private void jmiRelatorioSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioSecretariaActionPerformed
        FrmRelatorioSecretariasCadastradas frmRelatorioSecretariasCadastradas = new FrmRelatorioSecretariasCadastradas();
        frmRelatorioSecretariasCadastradas.setLocationRelativeTo(null);
        frmRelatorioSecretariasCadastradas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiRelatorioSecretariaActionPerformed

    private void jmiCadastarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastarSecretariaActionPerformed
        FrmTelaCadastrarSecretaria telaCadastraSecretaria = new FrmTelaCadastrarSecretaria();
        telaCadastraSecretaria.setLocationRelativeTo(null);
        telaCadastraSecretaria.setVisible(true);
        telaCadastraSecretaria.limparCampos();       
        this.dispose();
    }//GEN-LAST:event_jmiCadastarSecretariaActionPerformed

    private void jmiDeletarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarSecretariaActionPerformed
        FrmDeletarSecretaria frm = new FrmDeletarSecretaria();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiDeletarSecretariaActionPerformed

    private void jmiCadastaraServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastaraServicoActionPerformed
        // TODO add your handling code here:
        FrmTelaCadastrarServico telaCadastrarServico = new FrmTelaCadastrarServico();
        telaCadastrarServico.setLocationRelativeTo(null);
        telaCadastrarServico.setVisible(true);
        telaCadastrarServico.limparCampos();
        this.dispose();
    }//GEN-LAST:event_jmiCadastaraServicoActionPerformed

    private void jmiDeletarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarServicoActionPerformed
        FrmDeletarServico frmDeletarServico = new FrmDeletarServico();
        frmDeletarServico.setLocationRelativeTo(null);
        frmDeletarServico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiDeletarServicoActionPerformed

    private void jmiRelatorioServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioServicoActionPerformed
        FrmRelatorioServicosCadastrados frmRelatorioServicosCadastrados = new FrmRelatorioServicosCadastrados();
        frmRelatorioServicosCadastrados.setLocationRelativeTo(null);
        frmRelatorioServicosCadastrados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiRelatorioServicoActionPerformed

    private void jmiAlterarDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarDentistaActionPerformed
        FrmAlterarDentista frmAlterarDentista = new FrmAlterarDentista();
        frmAlterarDentista.setLocationRelativeTo(null);
        frmAlterarDentista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAlterarDentistaActionPerformed

    private void jmiAlterarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarSecretariaActionPerformed
        FrmAlterarSecretaria frmAlterarSecretaria = new FrmAlterarSecretaria();
        frmAlterarSecretaria.setLocationRelativeTo(null);
        frmAlterarSecretaria.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAlterarSecretariaActionPerformed

    private void jmiAlteraServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlteraServicoActionPerformed
        FrmAlterarServico frmAlterarServico = new FrmAlterarServico();
        frmAlterarServico.setLocationRelativeTo(null);
        frmAlterarServico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAlteraServicoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmTelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlterar;
    private javax.swing.JMenu jmCadastar;
    private javax.swing.JMenu jmDeletar;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiAlteraServico;
    private javax.swing.JMenuItem jmiAlterarDentista;
    private javax.swing.JMenuItem jmiAlterarPaciente;
    private javax.swing.JMenuItem jmiAlterarSecretaria;
    private javax.swing.JMenuItem jmiCadastarSecretaria;
    private javax.swing.JMenuItem jmiCadastaraServico;
    private javax.swing.JMenuItem jmiCadastrarDentista;
    private javax.swing.JMenuItem jmiCadastrarPaciente;
    private javax.swing.JMenuItem jmiDeletarDentista;
    private javax.swing.JMenuItem jmiDeletarPaciente;
    private javax.swing.JMenuItem jmiDeletarSecretaria;
    private javax.swing.JMenuItem jmiDeletarServico;
    private javax.swing.JMenuItem jmiRelatorioCliente;
    private javax.swing.JMenuItem jmiRelatorioDentista;
    private javax.swing.JMenuItem jmiRelatorioSecretaria;
    private javax.swing.JMenuItem jmiRelatorioServico;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
