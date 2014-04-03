package views;

import control.ControlePaciente;
import domain.Paciente;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class FrmTelaCadastrarPaciente extends javax.swing.JFrame {

    MaskFormatter formatoCpf;
    MaskFormatter formatoNascimento;
    MaskFormatter formatoCep;
    MaskFormatter formatoTelefone;
    MaskFormatter formatoCelular ;
        
    Paciente backupPaciente = new Paciente();
    private ControlePaciente controlePaciente;
        
    public FrmTelaCadastrarPaciente() {
        initComponents();
        controlePaciente = new ControlePaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbTitulo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlCEP = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlCelular = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlRua = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        try{
            formatoCpf = new MaskFormatter("###.###.###-##");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jftCpf = new JFormattedTextField(formatoCpf);
        try{
            formatoNascimento = new MaskFormatter("##/##/####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jftNascimento = new JFormattedTextField(formatoNascimento);
        try{
            formatoCep = new MaskFormatter("#####-###");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jftCep = new JFormattedTextField(formatoCep);
        try{
            formatoTelefone = new MaskFormatter("(##)####-####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jftTelefone = new JFormattedTextField(formatoTelefone);
        try{
            formatoCelular = new MaskFormatter("(##)#####-####");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao setar a maskara" + e);
        }
        jftCelular = new JFormattedTextField(formatoCelular);
        jcbUf = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Paciente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jbTitulo.setText("Cadastro de Pacientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jlNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNome.setText("Nome:");

        jlCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCPF.setText("CPF:");

        jlDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDataNascimento.setText("Data de Nascimento:");

        jlSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlSexo.setText("Sexo:");

        jlCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCidade.setText("Cidade:");

        jlBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlBairro.setText("Bairro:");

        jlEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEstado.setText("Estado:");

        jlCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCEP.setText("CEP:");

        jlTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTelefone.setText("Telefone:");

        jlCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCelular.setText("Celular:");

        jlEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmail.setText("E-mail:");

        jbSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalvar.setForeground(new java.awt.Color(0, 51, 255));
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimpar.setForeground(new java.awt.Color(0, 51, 255));
        jbLimpar.setText("Apagar");
        jbLimpar.setPreferredSize(new java.awt.Dimension(69, 23));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(0, 51, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlRua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlRua.setText("Rua:");

        jlNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNumero.setText("Numero:");

        btGrupoSexo.add(jrMasculino);
        jrMasculino.setText("Masculino");

        btGrupoSexo.add(jrFeminino);
        jrFeminino.setText("Feminino");

        jcbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ES", "AL", "DF", "MG", "RJ", "SP" }));
        jcbUf.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCPF)
                            .addComponent(jftCpf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefone)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(95, 95, 95)
                                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(168, 168, 168)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlCelular)
                                        .addComponent(jftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)))
                            .addComponent(jlEmail)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jftNascimento))
                                    .addComponent(jlEstado)
                                    .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro)
                                    .addComponent(jlRua)
                                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCEP)
                                    .addComponent(jftCep, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlSexo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrFeminino))
                                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCidade)
                                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNumero))))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNascimento)
                    .addComponent(jlSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMasculino)
                    .addComponent(jrFeminino)
                    .addComponent(jftNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlEstado)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jlCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(607, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Paciente paciente = new Paciente();
        //verifica se os dados estão todos prenchidos antes de enviar para a base de dados  
        if((validaCampos() == true)) { 
            paciente.setNome(this.jtfNome.getText());
            paciente.setCpf(this.jftCpf.getText());                        
            if(jrFeminino.isSelected()){
                paciente.setSexo("Feminino");
            }
            if(jrMasculino.isSelected()){
                paciente.setSexo("Masculino");
            }
            paciente.setDataNascimento(this.jftNascimento.getText());
            paciente.setCidade(this.jtfCidade.getText());
            paciente.setBairro(this.jtfBairro.getText());
            paciente.setRua(this.jtfRua.getText());
            paciente.setNumero(this.jtfNumero.getText());
            paciente.setUf(this.jcbUf.getSelectedItem().toString());
            paciente.setCep(this.jftCep.getText());
            if(this.jftTelefone.getText().equals("(  )    -    ")){
                paciente.setTelefone("");
            }
            else{
                paciente.setTelefone(this.jftTelefone.getText());
            }
            if(this.jftCelular.getText().equals("(  )     -    ")){
                paciente.setCelular("");
            }
            else{
                paciente.setCelular(this.jftCelular.getText());
            }
        
            paciente.setEmail(this.jtfEmail.getText());
        
            //verificar se cpf ja existe no banco antes de cadastrar
            if(!controlePaciente.verificarPaciente(paciente)){
                  //cadastra o paciente no banco
                  if(controlePaciente.cadastrarPaciente(paciente)){
                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    limparCampos();
                    this.dispose();
                  }
                  else{
                      JOptionPane.showMessageDialog(this, "Não foi possível salvar no banco de dados!");
                      this.dispose();
                  }  
            }
            else{
                JOptionPane.showMessageDialog(this, "cpf já cadastrado no banco de dados! Informe outro.");
                jftCpf.setText("");
                jftCpf.requestFocus();                                
            }
        }        
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmTelaCadastrarPaciente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGrupoSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jbTitulo;
    public javax.swing.JComboBox jcbUf;
    public javax.swing.JFormattedTextField jftCelular;
    public javax.swing.JFormattedTextField jftCep;
    public javax.swing.JFormattedTextField jftCpf;
    public javax.swing.JFormattedTextField jftNascimento;
    public javax.swing.JFormattedTextField jftTelefone;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    public javax.swing.JRadioButton jrFeminino;
    public javax.swing.JRadioButton jrMasculino;
    public javax.swing.JTextField jtfBairro;
    public javax.swing.JTextField jtfCidade;
    public javax.swing.JTextField jtfEmail;
    public javax.swing.JTextField jtfNome;
    public javax.swing.JTextField jtfNumero;
    public javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables
    
    //funcao para validar campos usando expressoes regulares
    public boolean validaCampos() {  
        if(!(jtfNome.getText().matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){
            JOptionPane.showMessageDialog(this, "Informe um nome válido!");
            jtfNome.setText("");
            jtfNome.requestFocus();
            return false;
        }
        if(!(jftCpf.getText().matches("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$"))){    
            JOptionPane.showMessageDialog(this, "Informe um cpf válido!");
            jftCpf.setText("");
            jftCpf.requestFocus();
            return false;
        }       
        if(!(jftNascimento.getText().matches("\\d{2}/\\d{2}/\\d{4}"))){    
            JOptionPane.showMessageDialog(this, "Informe uma data válida!");
            jftNascimento.setText("");
            jftNascimento.requestFocus();
            return false;
        }
        if(!(jrMasculino.isSelected()) && !(jrFeminino.isSelected())){
            JOptionPane.showMessageDialog(this, "Informe o sexo do paciente!");
            jrMasculino.requestFocus();
            return false;
        }  
        if(!(jtfCidade.getText().matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){
            JOptionPane.showMessageDialog(this, "Informe uma cidade válida!");
            jtfCidade.setText("");
            jtfCidade.requestFocus();
            return false;
        }
        if(!(jtfBairro.getText().matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){
            JOptionPane.showMessageDialog(this, "Informe um bairro válido!");
            jtfBairro.setText("");
            jtfBairro.requestFocus();
            return false;
        }
        if(!(jtfRua.getText().matches("^[a-z\\u00C0-\\u00ff A-Z]+$"))){        
            JOptionPane.showMessageDialog(this, "Informe uma rua válida!");
            jtfRua.setText("");
            jtfRua.requestFocus();
            return false;
        }
        if(jtfNumero.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Informe um número válido!");
            jtfNumero.setText("");
            jtfNumero.requestFocus();
            return false;
        }
//        SEM NECESSIDADE DE VALIDACAO NA UF, POIS EXISTE UM VALOR PADRAO(ES)
//        if(jcbUf.getSelectedItem().equals("")){
//            JOptionPane.showMessageDialog(this, "Informe o estado onde paciente reside!");
//            jcbUf.setSelectedItem("");
//            jcbUf.requestFocus();
//            return false;
//        }
        if(!(jftCep.getText().matches("\\d\\d\\d\\d\\d.\\d\\d\\d"))){
            JOptionPane.showMessageDialog(this, "Informe um cep válido!");
            jftCep.setText("");
            jftCep.requestFocus();
            return false;
        }
//        PODE SER QUE O PACIENTE NÃO TENHA TELEFONES OU EMAIL ENTAO OPTOU-SE POR NAO VALIDAR
//        if((jftTelefone.getText().equals(""))){          
//            JOptionPane.showMessageDialog(this, "Informe um telefone válido!");
//            jftTelefone.setText("");
//            jftTelefone.requestFocus();
//            return false;
//        }                
//        if(jftCelular.getText().equals("")){          
//            JOptionPane.showMessageDialog(this, "Informe um telefone válido!");
//            jftCelular.setText("");
//            jftCelular.requestFocus();
//            return false;
//          }
//        if(jtfEmail.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Digite um email válido!");
//            jtfEmail.setText("");
//            jtfEmail.requestFocus();
//            return false;
//        }         
        
        return true;        
    }
    //funcao limpa campos
     public void limparCampos() {        
            jtfNome.setText("");
            jftCpf.setText("");
            btGrupoSexo.clearSelection();    
            jftNascimento.setText("");
            jtfCidade.setText(""); 
            jtfBairro.setText("");
            jtfRua.setText("");
            jtfNumero.setText("");  
            jcbUf.setSelectedItem(""); 
            jftCep.setText("");
            jftTelefone.setText("");             
            jftCelular.setText("");       
            jtfEmail.setText("");        

            jtfNome.requestFocus();
        }
 public boolean verificaCampos() {  
        return !jtfNome.getText().equals("");
    }
}
