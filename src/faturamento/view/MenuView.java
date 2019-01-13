package faturamento.view;

import faturamento.controller.LogController;
import faturamento.model.LogModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MenuView extends javax.swing.JFrame {

    public static LoginView usuario;

    String user = usuario.edtUSU_LOGIN.getText();

    private String operacao;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        this.operacao = operacao;
    }

    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);

        lblMENSAGEM.setText(user);
        lblCODIGO.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BARRA_MENU = new javax.swing.JToolBar();
        btnUSUARIOS = new javax.swing.JButton();
        btnCLIENTES = new javax.swing.JButton();
        btnFORNECEDORES = new javax.swing.JButton();
        btnFUNCIONARIOS = new javax.swing.JButton();
        btnFINANCEIRO = new javax.swing.JButton();
        btnLOGOFF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblHORA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDATA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMENSAGEM = new javax.swing.JLabel();
        lblCODIGO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iconTELA_INICIO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales System - Menu");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        BARRA_MENU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BARRA_MENU.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BARRA_MENU.setRollover(true);

        btnUSUARIOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-usuarios.png"))); // NOI18N
        btnUSUARIOS.setText("Usuários");
        btnUSUARIOS.setFocusable(false);
        btnUSUARIOS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUSUARIOS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUSUARIOS.setMaximumSize(new java.awt.Dimension(110, 45));
        btnUSUARIOS.setMinimumSize(new java.awt.Dimension(110, 45));
        btnUSUARIOS.setPreferredSize(new java.awt.Dimension(200, 45));
        btnUSUARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSUARIOSActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnUSUARIOS);

        btnCLIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-clientes.png"))); // NOI18N
        btnCLIENTES.setText("Clientes");
        btnCLIENTES.setFocusable(false);
        btnCLIENTES.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCLIENTES.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCLIENTES.setMaximumSize(new java.awt.Dimension(110, 45));
        btnCLIENTES.setMinimumSize(new java.awt.Dimension(110, 45));
        btnCLIENTES.setPreferredSize(new java.awt.Dimension(200, 45));
        btnCLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLIENTESActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnCLIENTES);

        btnFORNECEDORES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-fornecedores.png"))); // NOI18N
        btnFORNECEDORES.setText("Fornecedores");
        btnFORNECEDORES.setFocusable(false);
        btnFORNECEDORES.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFORNECEDORES.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFORNECEDORES.setMaximumSize(new java.awt.Dimension(110, 45));
        btnFORNECEDORES.setMinimumSize(new java.awt.Dimension(110, 45));
        btnFORNECEDORES.setPreferredSize(new java.awt.Dimension(200, 45));
        btnFORNECEDORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFORNECEDORESActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnFORNECEDORES);

        btnFUNCIONARIOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-funcionarios.png"))); // NOI18N
        btnFUNCIONARIOS.setText("Funcionários");
        btnFUNCIONARIOS.setFocusable(false);
        btnFUNCIONARIOS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFUNCIONARIOS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFUNCIONARIOS.setMaximumSize(new java.awt.Dimension(110, 45));
        btnFUNCIONARIOS.setMinimumSize(new java.awt.Dimension(110, 45));
        btnFUNCIONARIOS.setPreferredSize(new java.awt.Dimension(200, 45));
        btnFUNCIONARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFUNCIONARIOSActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnFUNCIONARIOS);

        btnFINANCEIRO.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        btnFINANCEIRO.setText("Financeiro");
        btnFINANCEIRO.setFocusable(false);
        btnFINANCEIRO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFINANCEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFINANCEIRO.setMaximumSize(new java.awt.Dimension(110, 45));
        btnFINANCEIRO.setMinimumSize(new java.awt.Dimension(110, 45));
        btnFINANCEIRO.setPreferredSize(new java.awt.Dimension(200, 45));
        btnFINANCEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFINANCEIROActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnFINANCEIRO);

        btnLOGOFF.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        btnLOGOFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-logoof.png"))); // NOI18N
        btnLOGOFF.setText("Log Off");
        btnLOGOFF.setFocusable(false);
        btnLOGOFF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLOGOFF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLOGOFF.setMaximumSize(new java.awt.Dimension(110, 45));
        btnLOGOFF.setMinimumSize(new java.awt.Dimension(110, 45));
        btnLOGOFF.setPreferredSize(new java.awt.Dimension(200, 45));
        btnLOGOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGOFFActionPerformed(evt);
            }
        });
        BARRA_MENU.add(btnLOGOFF);

        getContentPane().add(BARRA_MENU);
        BARRA_MENU.setBounds(0, 0, 160, 283);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hora:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 40, 50, 20);

        lblHORA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblHORA);
        lblHORA.setBounds(650, 40, 90, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 10, 50, 20);

        lblDATA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblDATA);
        lblDATA.setBounds(650, 10, 90, 20);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Acesse: www.pltec.com.br");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 250, 180, 20);
        getContentPane().add(lblMENSAGEM);
        lblMENSAGEM.setBounds(230, 250, 290, 20);

        lblCODIGO.setText("0");
        getContentPane().add(lblCODIGO);
        lblCODIGO.setBounds(170, 10, 8, 17);

        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 250, 56, 20);

        iconTELA_INICIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-fundo-menu.jpg"))); // NOI18N
        iconTELA_INICIO.setText("Usuário");
        getContentPane().add(iconTELA_INICIO);
        iconTELA_INICIO.setBounds(160, 0, 650, 280);

        setSize(new java.awt.Dimension(756, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUSUARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSUARIOSActionPerformed
        this.dispose();
        CadastroView usuarioview;
        usuarioview = new CadastroView();
        usuarioview.setVisible(true);
    }//GEN-LAST:event_btnUSUARIOSActionPerformed

    private void btnCLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLIENTESActionPerformed
        this.dispose();
        ClienteView clienteview;
        clienteview = new ClienteView();
        clienteview.setVisible(true);
    }//GEN-LAST:event_btnCLIENTESActionPerformed

    private void btnFORNECEDORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFORNECEDORESActionPerformed
        //this.dispose();
        //FornecedorView fornecedorview;
        //fornecedorview = new FornecedorView();
        //fornecedorview.setVisible(true);
    }//GEN-LAST:event_btnFORNECEDORESActionPerformed

    private void btnFUNCIONARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFUNCIONARIOSActionPerformed
        this.dispose();
        FuncionarioView funcionarioview;
        funcionarioview = new FuncionarioView();
        funcionarioview.setVisible(true);
    }//GEN-LAST:event_btnFUNCIONARIOSActionPerformed

    private void btnFINANCEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFINANCEIROActionPerformed
        //this.dispose();
        //PagamentoView pagamentoview;
        //pagamentoview = new PagamentoView();
        //pagamentoview.setVisible(true);
    }//GEN-LAST:event_btnFINANCEIROActionPerformed

    private void btnLOGOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGOFFActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realizar log off?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_NO_OPTION) {

            dispose();
            LoginView loginview;
            loginview = new LoginView();
            loginview.setVisible(true);

        } else {

        }
    }//GEN-LAST:event_btnLOGOFFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //funcionalidade de mostrar a data atual.
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        lblDATA.setText(data.format(new Date()));
        //funcionalidade de mostar a hora atual. 
        Timer time = new Timer(0, new MenuView.hora());
        time.start();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        setOperacao("incluir");

        try {

            LogModel logmodel = new LogModel();

            logmodel.setLOG_CODIGO(Integer.parseInt(lblCODIGO.getText()));
            logmodel.setLOG_USUARIO(lblMENSAGEM.getText());
            logmodel.setLOG_DATA(lblDATA.getText());
            logmodel.setLOG_HORA(lblHORA.getText());

            LogController logcontroller = new LogController();
            logcontroller.gravar(getOperacao(), logmodel);

        } catch (SQLException erro) {

            System.out.println("Erro SQL: " + erro.getMessage());

        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        setOperacao("incluir");

        try {

            LogModel logmodel = new LogModel();

            logmodel.setLOG_CODIGO(Integer.parseInt(lblCODIGO.getText()));
            logmodel.setLOG_USUARIO(lblMENSAGEM.getText());
            logmodel.setLOG_DATA(lblDATA.getText());
            logmodel.setLOG_HORA(lblHORA.getText());

            LogController logcontroller = new LogController();
            logcontroller.gravar(getOperacao(), logmodel);

        } catch (SQLException erro) {

            System.out.println("Erro SQL: " + erro.getMessage());

        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BARRA_MENU;
    private javax.swing.JButton btnCLIENTES;
    private javax.swing.JButton btnFINANCEIRO;
    private javax.swing.JButton btnFORNECEDORES;
    private javax.swing.JButton btnFUNCIONARIOS;
    private javax.swing.JButton btnLOGOFF;
    private javax.swing.JButton btnUSUARIOS;
    private javax.swing.JLabel iconTELA_INICIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCODIGO;
    private javax.swing.JLabel lblDATA;
    private javax.swing.JLabel lblHORA;
    private javax.swing.JLabel lblMENSAGEM;
    // End of variables declaration//GEN-END:variables

    //classe interna com funcionalidade de mostrar a hora atual.
    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Calendar now = Calendar.getInstance();
            lblHORA.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
