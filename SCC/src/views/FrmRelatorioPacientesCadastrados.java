package views;

import control.ControlePaciente;
import javax.swing.table.DefaultTableModel;

public class FrmRelatorioPacientesCadastrados extends javax.swing.JFrame {
    /**
     * Creates new form FrmRelatorioPacientesCadastrados
     */
    
    public FrmRelatorioPacientesCadastrados() {
        initComponents(); 
        this.setLocation(300, 200);
  //      setDefaultCloseOperation(FrmRelatorioPacientesCadastrados.DISPOSE_ON_CLOSE);
 //       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //estabelece o modelo especificado em propriedades do Jtable criado
        DefaultTableModel tabelaPacientes = (DefaultTableModel) jtRelatorioPacientes.getModel();
        
        //percorre pelo arraylist e envia os dados de cada paciente para uma linha da tabela
        for (int i = 0; i < ControlePaciente.listaPaciente.size(); i++){
                    tabelaPacientes.addRow(new Object[] {ControlePaciente.listaPaciente.get(i).getCodigo(),
                                                         ControlePaciente.listaPaciente.get(i).getNome(),
                                                         ControlePaciente.listaPaciente.get(i).getCpf(),
                                                         ControlePaciente.listaPaciente.get(i).getSexo(),
                                                         ControlePaciente.listaPaciente.get(i).getDataNascimento(),
                                                         ControlePaciente.listaPaciente.get(i).getCidade(),
                                                         ControlePaciente.listaPaciente.get(i).getBairro(),
                                                         ControlePaciente.listaPaciente.get(i).getRua(),
                                                         ControlePaciente.listaPaciente.get(i).getNumero(),
                                                         ControlePaciente.listaPaciente.get(i).getUf(),
                                                         ControlePaciente.listaPaciente.get(i).getCep(),
                                                         ControlePaciente.listaPaciente.get(i).getTelefone(),
                                                         ControlePaciente.listaPaciente.get(i).getCelular(),
                                                         ControlePaciente.listaPaciente.get(i).getEmail()
                                                         });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtRelatorioPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE PACIENTES CADASTRADOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jtRelatorioPacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtRelatorioPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "CPF", "Sexo", "Nascimento", "Cidade", "Bairro", "Rua", "Nº", "UF", "CEP", "Telefone", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtRelatorioPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRelatorioPacientes.setRowHeight(20);
        jScrollPane1.setViewportView(jtRelatorioPacientes);
        if (jtRelatorioPacientes.getColumnModel().getColumnCount() > 0) {
            jtRelatorioPacientes.getColumnModel().getColumn(0).setMinWidth(80);
            jtRelatorioPacientes.getColumnModel().getColumn(1).setMinWidth(350);
            jtRelatorioPacientes.getColumnModel().getColumn(2).setMinWidth(150);
            jtRelatorioPacientes.getColumnModel().getColumn(3).setMinWidth(60);
            jtRelatorioPacientes.getColumnModel().getColumn(4).setMinWidth(100);
            jtRelatorioPacientes.getColumnModel().getColumn(5).setMinWidth(100);
            jtRelatorioPacientes.getColumnModel().getColumn(6).setMinWidth(150);
            jtRelatorioPacientes.getColumnModel().getColumn(7).setMinWidth(250);
            jtRelatorioPacientes.getColumnModel().getColumn(8).setMinWidth(30);
            jtRelatorioPacientes.getColumnModel().getColumn(9).setMinWidth(5);
            jtRelatorioPacientes.getColumnModel().getColumn(10).setMinWidth(100);
            jtRelatorioPacientes.getColumnModel().getColumn(11).setMinWidth(130);
            jtRelatorioPacientes.getColumnModel().getColumn(12).setMinWidth(130);
            jtRelatorioPacientes.getColumnModel().getColumn(13).setMinWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();
        this.setLocation(400, 200);
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioPacientesCadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmRelatorioPacientesCadastrados().setVisible(true);                
            }
        });

    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRelatorioPacientes;
    // End of variables declaration//GEN-END:variables

}
