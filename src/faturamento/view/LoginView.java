/**
 *Conteúdo: Tela de Login
 *Autor: Patrick Carpezani
 *Data: 16/07/2018
 */
package faturamento.view;

import faturamento.conexao.Conexao;
import faturamento.dao.LoginDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    private final char senha;


    public LoginView() {
        initComponents();
        senha = passUSU_SENHA.getEchoChar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUSUARIO = new javax.swing.JLabel();
        edtUSU_LOGIN = new javax.swing.JTextField();
        lblSENHA = new javax.swing.JLabel();
        passUSU_SENHA = new javax.swing.JPasswordField();
        btnENTRAR = new javax.swing.JButton();
        btnCADASTRAR = new javax.swing.JButton();
        lblLOGO = new javax.swing.JLabel();
        chkUSU_MOSTRA = new javax.swing.JCheckBox();
        lblMOSTRA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        lblUSUARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUSUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-usuario.png"))); // NOI18N
        lblUSUARIO.setText("Login");

        edtUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN.setToolTipText("insira seu e-mail coorporativo");

        lblSENHA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSENHA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-senha.png"))); // NOI18N
        lblSENHA.setText("Senha");

        passUSU_SENHA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passUSU_SENHA.setToolTipText("insira sua senha do e-mail coorporativo");

        btnENTRAR.setText("Entrar");
        btnENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENTRARActionPerformed(evt);
            }
        });

        btnCADASTRAR.setText("Cadastrar");
        btnCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARActionPerformed(evt);
            }
        });

        lblLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-brf.png"))); // NOI18N

        chkUSU_MOSTRA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkUSU_MOSTRA.setText("Mostrar Senha");
        chkUSU_MOSTRA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chkUSU_MOSTRA.setFocusable(false);
        chkUSU_MOSTRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUSU_MOSTRAActionPerformed(evt);
            }
        });

        lblMOSTRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-ocultar-senha.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(edtUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passUSU_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMOSTRA)
                            .addGap(1, 1, 1)
                            .addComponent(chkUSU_MOSTRA))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblUSUARIO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSENHA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passUSU_SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMOSTRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkUSU_MOSTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblLOGO)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(550, 282));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnENTRARActionPerformed

        LoginDAO executar = new LoginDAO();

        try {
            if (executar.checkLogin(edtUSU_LOGIN.getText(), passUSU_SENHA.getText())) {

                /*this.dispose();
                barraProgre barra = new barraProgre(this, true);
                barra.setVisible(true);*/
                this.dispose();
                MenuView menu = new MenuView();
                menu.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Usúario ou senha incorreta, tente novamente!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Por motivos deconhecidos não foi possivel logar" + ex.getMessage());
        }
    }//GEN-LAST:event_btnENTRARActionPerformed

    private void btnCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARActionPerformed
        Conexao objconexao;
        objconexao = new Conexao();

        CadastroView cadastroview;
        cadastroview = new CadastroView();
        cadastroview.setVisible(true);
    }//GEN-LAST:event_btnCADASTRARActionPerformed

    private void chkUSU_MOSTRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUSU_MOSTRAActionPerformed
        if (chkUSU_MOSTRA.isSelected()) {

            passUSU_SENHA.setEchoChar('\u0000'); // tem como funcionalidade remover a mascara da senha e mostrar a senha.
            lblMOSTRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-exibir-senha.png")));

        } else {

            passUSU_SENHA.setEchoChar(senha);
            lblMOSTRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-ocultar-senha.png")));
        }
    }//GEN-LAST:event_chkUSU_MOSTRAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRAR;
    private javax.swing.JButton btnENTRAR;
    private javax.swing.JCheckBox chkUSU_MOSTRA;
    public static javax.swing.JTextField edtUSU_LOGIN;
    private javax.swing.JLabel lblLOGO;
    private javax.swing.JLabel lblMOSTRA;
    private javax.swing.JLabel lblSENHA;
    private javax.swing.JLabel lblUSUARIO;
    private javax.swing.JPasswordField passUSU_SENHA;
    // End of variables declaration//GEN-END:variables
}
