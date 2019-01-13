package faturamento.view;

import faturamento.controller.UsuarioController;
import faturamento.model.UsuarioModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class CadastroView extends javax.swing.JFrame {

    private String operacao;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {

        Boolean ativar = (operacao.equals("") ? false : true);

        this.operacao = operacao;
    }

    public CadastroView() {
        this.setPreferredSize(new Dimension(930, 530));
        this.initComponents();
        this.setLocationRelativeTo(null);

        this.inativarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        pnlDADOS = new javax.swing.JPanel();
        lblUSU_CODIGO = new javax.swing.JLabel();
        edtUSU_CODIGO = new javax.swing.JTextField();
        edtUSU_SOBRENOME = new javax.swing.JTextField();
        lblUSU_NOME = new javax.swing.JLabel();
        lblUSU_LOGIN = new javax.swing.JLabel();
        edtUSU_LOGIN = new javax.swing.JTextField();
        cbxUSU_ATIVO = new javax.swing.JComboBox<>();
        lblUSU_ATIVO = new javax.swing.JLabel();
        lblUSU_SENHA = new javax.swing.JLabel();
        passUSU_SENHA = new javax.swing.JPasswordField();
        lblUSU_CADASTRO = new javax.swing.JLabel();
        edtUSU_CADASTRO = new javax.swing.JTextField();
        btnGERAR_LOGIN = new javax.swing.JButton();
        lblUSU_SOBRENOME = new javax.swing.JLabel();
        edtUSU_NOME = new javax.swing.JTextField();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        btnLIMPAR = new javax.swing.JButton();
        btnSALVAR = new javax.swing.JButton();
        btnNOVO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema - Cadastro de Usuários");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-usuarios-cadastro.png"))); // NOI18N
        lblTITULO.setText("CADASTRO DE USUÁRIOS ");
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, 70));

        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.setFocusable(false);

        pnlDADOS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUSU_CODIGO.setText("Código");

        edtUSU_CODIGO.setEditable(false);

        edtUSU_SOBRENOME.setToolTipText("Digite o  sobrenome do usuário");

        lblUSU_NOME.setText("Nome");

        lblUSU_LOGIN.setText("Login");

        edtUSU_LOGIN.setEditable(false);

        cbxUSU_ATIVO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "ATIVO", "INATIVO" }));
        cbxUSU_ATIVO.setFocusable(false);

        lblUSU_ATIVO.setForeground(java.awt.Color.black);
        lblUSU_ATIVO.setText("Ativo");

        lblUSU_SENHA.setText("Senha");

        passUSU_SENHA.setToolTipText("Digite uma senha da sua prefêrencia");

        lblUSU_CADASTRO.setText("Data");

        edtUSU_CADASTRO.setEditable(false);
        edtUSU_CADASTRO.setToolTipText("");

        btnGERAR_LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-gerar-login.png"))); // NOI18N
        btnGERAR_LOGIN.setText("Gerar");
        btnGERAR_LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGERAR_LOGINMouseClicked(evt);
            }
        });

        lblUSU_SOBRENOME.setText("Sobrenome");

        edtUSU_NOME.setToolTipText("Digite o nome do usuário");
        edtUSU_NOME.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout pnlDADOSLayout = new javax.swing.GroupLayout(pnlDADOS);
        pnlDADOS.setLayout(pnlDADOSLayout);
        pnlDADOSLayout.setHorizontalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addComponent(lblUSU_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lblUSU_CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addComponent(edtUSU_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtUSU_CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passUSU_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addComponent(edtUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGERAR_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtUSU_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtUSU_SOBRENOME, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_SOBRENOME))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUSU_ATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUSU_ATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        pnlDADOSLayout.setVerticalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_CODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUSU_CADASTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtUSU_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(edtUSU_CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUSU_SOBRENOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUSU_ATIVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtUSU_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(edtUSU_SOBRENOME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(cbxUSU_ATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUSU_LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGERAR_LOGIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUSU_SENHA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passUSU_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jTabbedPane.addTab("Dados de Acesso", pnlDADOS);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 880, 330));

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/iconAlterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        getContentPane().add(btnALTERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, 40));

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        getContentPane().add(btnEXCLUIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 120, 40));

        btnLIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-limpar.png"))); // NOI18N
        btnLIMPAR.setText("Limpar");
        btnLIMPAR.setFocusable(false);
        btnLIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLIMPARMouseClicked(evt);
            }
        });
        getContentPane().add(btnLIMPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 120, 40));

        btnSALVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-salvar.png"))); // NOI18N
        btnSALVAR.setText("Salvar");
        btnSALVAR.setFocusable(false);
        btnSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALVARActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 120, 40));

        btnNOVO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-adicionar-usuarios.png"))); // NOI18N
        btnNOVO.setText("Adicionar");
        btnNOVO.setFocusable(false);
        btnNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVOActionPerformed(evt);
            }
        });
        getContentPane().add(btnNOVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIMPARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLIMPARMouseClicked

        this.limpar();

    }//GEN-LAST:event_btnLIMPARMouseClicked

    private void btnSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse usuário?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (validacao()) {

                try {

                    UsuarioModel usuariomodel = new UsuarioModel();

                    usuariomodel.setUSU_CODIGO(Integer.parseInt(edtUSU_CODIGO.getText()));
                    usuariomodel.setUSU_NOME(edtUSU_NOME.getText());
                    usuariomodel.setUSU_SOBRENOME(edtUSU_SOBRENOME.getText());
                    usuariomodel.setUSU_CADASTRO(edtUSU_CADASTRO.getText());
                    usuariomodel.setUSU_ATIVO(cbxUSU_ATIVO.getSelectedItem().toString());
                    usuariomodel.setUSU_LOGIN(edtUSU_LOGIN.getText());
                    usuariomodel.setUSU_SENHA(passUSU_SENHA.getText());

                    UsuarioController usuariocontroller = new UsuarioController();
                    usuariocontroller.gravar(getOperacao(), usuariomodel);

                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
                    this.limpar();
                    this.inativarCampos();

                } catch (HeadlessException | NumberFormatException | SQLException erro) {

                    JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


    }//GEN-LAST:event_btnSALVARActionPerformed

    private void btnNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVOActionPerformed
        this.ativarCampos();
        this.limpar();

        setOperacao("incluir");
    }//GEN-LAST:event_btnNOVOActionPerformed

    private void btnGERAR_LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGERAR_LOGINMouseClicked

        if (edtUSU_NOME.getText().length() > 0 && edtUSU_SOBRENOME.getText().length() > 0) {

            String gerador;
            gerador = edtUSU_NOME.getText() + "." + edtUSU_SOBRENOME.getText() + "@brf-br.com";

            edtUSU_LOGIN.setText(gerador.toLowerCase());

        } else {

            JOptionPane.showMessageDialog(null, "Impossivel gerar o e-mail de acesso\n"
                    + "campos obrigatorios não preenchidos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGERAR_LOGINMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        edtUSU_CADASTRO.setText(data.format(new Date()));

    }//GEN-LAST:event_formWindowOpened

    public void limpar() {

        edtUSU_CODIGO.setText("0");
        edtUSU_NOME.setText("");
        edtUSU_SOBRENOME.setText("");
        edtUSU_LOGIN.setText("");
        passUSU_SENHA.setText("");

        cbxUSU_ATIVO.setSelectedItem("Selecionar");
    }

    private boolean validacao() {

        String menssagemerro = "";

        if (edtUSU_NOME.getText() == null || edtUSU_NOME.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtUSU_NOME.setBorder(border);

            menssagemerro += "Nome inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtUSU_NOME.setBorder(border);
            
        }

        if (edtUSU_SOBRENOME.getText() == null || edtUSU_SOBRENOME.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtUSU_SOBRENOME.setBorder(border);

            menssagemerro += "Sobrenome inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtUSU_SOBRENOME.setBorder(border);

        }

        if (edtUSU_LOGIN.getText() == null || edtUSU_LOGIN.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtUSU_LOGIN.setBorder(border);

            menssagemerro += "Login inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtUSU_LOGIN.setBorder(border);
        }

        if (cbxUSU_ATIVO.getSelectedItem().equals("Selecionar")) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            cbxUSU_ATIVO.setBorder(border);

            menssagemerro += "Status inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            cbxUSU_ATIVO.setBorder(border);

        }

        if (passUSU_SENHA.getText() == null || passUSU_SENHA.getText().length() < 6) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            passUSU_SENHA.setBorder(border);

            menssagemerro += "Senha inválida!\n";

            JOptionPane.showMessageDialog(null, "A senha deve conter no mínimo 6 digitos", "Aviso", JOptionPane.WARNING_MESSAGE);

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            passUSU_SENHA.setBorder(border);

        }

        if (menssagemerro.length() == 0) {

            return true;

        } else {

            JOptionPane.showMessageDialog(null, "Os campos a baixo são obrigatórios\n\n" + menssagemerro, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void ativarCampos() {

        edtUSU_CODIGO.setEnabled(true);
        edtUSU_NOME.setEnabled(true);
        edtUSU_SOBRENOME.setEnabled(true);
        edtUSU_LOGIN.setEnabled(true);
        edtUSU_CADASTRO.setEnabled(true);
        passUSU_SENHA.setEnabled(true);

        btnSALVAR.setEnabled(true);
        btnGERAR_LOGIN.setEnabled(true);
    }

    public void inativarCampos() {

        edtUSU_CODIGO.setEnabled(false);
        edtUSU_NOME.setEnabled(false);
        edtUSU_SOBRENOME.setEnabled(false);
        edtUSU_LOGIN.setEnabled(false);
        edtUSU_CADASTRO.setEnabled(false);
        passUSU_SENHA.setEnabled(false);

        btnSALVAR.setEnabled(false);
        btnGERAR_LOGIN.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGERAR_LOGIN;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JButton btnNOVO;
    private javax.swing.JButton btnSALVAR;
    private javax.swing.JComboBox<String> cbxUSU_ATIVO;
    private javax.swing.JTextField edtUSU_CADASTRO;
    private javax.swing.JTextField edtUSU_CODIGO;
    private javax.swing.JTextField edtUSU_LOGIN;
    private javax.swing.JTextField edtUSU_NOME;
    private javax.swing.JTextField edtUSU_SOBRENOME;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JLabel lblUSU_ATIVO;
    private javax.swing.JLabel lblUSU_CADASTRO;
    private javax.swing.JLabel lblUSU_CODIGO;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_SENHA;
    private javax.swing.JLabel lblUSU_SOBRENOME;
    private javax.swing.JPasswordField passUSU_SENHA;
    private javax.swing.JPanel pnlDADOS;
    // End of variables declaration//GEN-END:variables
}
