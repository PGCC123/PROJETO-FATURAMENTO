package faturamento.view;

import faturamento.controller.ClienteController;
import faturamento.model.ClienteModel;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class PesquisaClienteView extends javax.swing.JDialog {

    private final String colunas[] = {"CÓDIGO", "NOME", "CPF/CNPJ", "LIMITE DE CRÉDITO", "FÍSICA"};

    private ArrayList<ClienteModel> listacliente;
    private ClienteTableModel tabelacliente;

    public PesquisaClienteView(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tblCLIENTE.getModel();
        
        this.setPreferredSize(new Dimension(844, 435));
        this.setLocationRelativeTo(null);

        this.consultar();

        this.tamanhoColunas();

        //tblCLIENTE.getTableHeader().setBackground(Color.GRAY); //tem a funcionalidade de colocar um linha no cabeçalho da tabela

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        edtCONS_CODIGO1 = new javax.swing.JTextField();
        lblFUN_CODIGO = new javax.swing.JLabel();
        lblINTERMEDIARIA = new javax.swing.JLabel();
        edtCONS_CODIGO2 = new javax.swing.JTextField();
        edtCONS_CPF = new javax.swing.JTextField();
        lblFUN_CPF = new javax.swing.JLabel();
        lblFUN_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        btnCONSULTA = new javax.swing.JButton();
        btnLIMPAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCLIENTE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTITULO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-pesquisa-funcionario.png"))); // NOI18N
        lblTITULO.setText("PESQUISA DE CLIENTES");

        lblFUN_CODIGO.setText("Código");

        lblINTERMEDIARIA.setText("á");

        edtCONS_CPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCONS_CPFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCONS_CPFKeyTyped(evt);
            }
        });

        lblFUN_CPF.setText("CPF");

        lblFUN_NOME.setText("Nome");

        btnCONSULTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-pesquisa.png"))); // NOI18N
        btnCONSULTA.setText("Buscar");
        btnCONSULTA.setFocusable(false);
        btnCONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCONSULTAActionPerformed(evt);
            }
        });

        btnLIMPAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-limpar.png"))); // NOI18N
        btnLIMPAR.setText("Limpar");
        btnLIMPAR.setFocusable(false);
        btnLIMPAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLIMPARMouseClicked(evt);
            }
        });

        tblCLIENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCLIENTE.setFocusable(false);
        tblCLIENTE.setSelectionForeground(new java.awt.Color(16, 25, 19));
        tblCLIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCLIENTEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCLIENTE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFUN_CODIGO)
                            .addComponent(edtCONS_CODIGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblINTERMEDIARIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCONS_CODIGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFUN_CPF)
                            .addComponent(edtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFUN_NOME)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(edtCONS_NOME)
                                    .addGap(38, 38, 38)))
                            .addComponent(btnCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnLIMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTITULO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFUN_CODIGO)
                                .addGap(3, 3, 3)
                                .addComponent(edtCONS_CODIGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFUN_CPF)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCONS_CODIGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblINTERMEDIARIA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addComponent(lblFUN_NOME)
                        .addGap(6, 6, 6)
                        .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLIMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(770, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCONS_CPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCONS_CPFKeyTyped
        int quantidade = 11;
        if (edtCONS_CPF.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtCONS_CPFKeyTyped

    private void edtCONS_CPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCONS_CPFKeyReleased
        String campo = edtCONS_CPF.getText();
        if (campo.length() == 11) {
            String cpf;
            cpf = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + campo.charAt(2) + "." + campo.charAt(3) + campo.charAt(4) + campo.charAt(5) + "." + campo.charAt(6) + campo.charAt(7) + campo.charAt(8) + "-" + campo.charAt(9) + campo.charAt(10));
            edtCONS_CPF.setText(cpf);
        }
    }//GEN-LAST:event_edtCONS_CPFKeyReleased

    private void btnCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCONSULTAActionPerformed
        this.consultar();
        this.tamanhoColunas();
    }//GEN-LAST:event_btnCONSULTAActionPerformed

    private void btnLIMPARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLIMPARMouseClicked
        this.limpar();
        this.tamanhoColunas();
    }//GEN-LAST:event_btnLIMPARMouseClicked

    private void tblCLIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCLIENTEMouseClicked
        if (evt.getClickCount() == 2) {

            this.dispose();
            ClienteView clienteview = new ClienteView();
            clienteview.setVisible(true);
            clienteview.ativarBotoes();

            int selecionada = tblCLIENTE.getSelectedRow();

            clienteview.mostrar(listacliente.get(selecionada));
        }
    }//GEN-LAST:event_tblCLIENTEMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        ClienteView clienteview = new ClienteView();
        clienteview.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private String filtroConsulta() {

        String condicao = "";
        if (!edtCONS_CODIGO1.getText().trim().equals("")) {
            condicao += "(CLI_CODIGO >= " + edtCONS_CODIGO1.getText() + ")";
        }
        if (!edtCONS_CODIGO2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLI_CODIGO <= " + edtCONS_CODIGO2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLI_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }

        if (!edtCONS_CPF.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }

            condicao += "(CLI_CNPJ LIKE ('%" + edtCONS_CPF.getText() + "%'))";
        }

        return condicao;
    }

    private void consultar() {

        try {

            String condicao = filtroConsulta();
            ClienteController cliente = new ClienteController();
            listacliente = null;
            listacliente = cliente.consultar(condicao);

            if (listacliente.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Não há clientes cadastrados na base de dados\n"
                        + "verifique os filtros e efetue uma nova busca!", "Menssagem", JOptionPane.WARNING_MESSAGE);
  
            } else {

                tabelacliente = new ClienteTableModel(listacliente, colunas);
                tblCLIENTE.setModel(tabelacliente);
                tblCLIENTE.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na consulta do cliente\n" + ex.getMessage());
        }
    }

    public void limpar() {

        edtCONS_CODIGO1.setText("");
        edtCONS_CODIGO2.setText("");
        edtCONS_CPF.setText("");
        edtCONS_NOME.setText("");

    }
    
     public void tamanhoColunas() {
        
        tblCLIENTE.getColumnModel().getColumn(0).setPreferredWidth(30); // configuração de largura da coluna (codigo)
        tblCLIENTE.getColumnModel().getColumn(1).setPreferredWidth(175);// configuração de largura da coluna (nome)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCONSULTA;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JTextField edtCONS_CODIGO1;
    private javax.swing.JTextField edtCONS_CODIGO2;
    private javax.swing.JTextField edtCONS_CPF;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFUN_CODIGO;
    private javax.swing.JLabel lblFUN_CPF;
    private javax.swing.JLabel lblFUN_NOME;
    private javax.swing.JLabel lblINTERMEDIARIA;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JTable tblCLIENTE;
    // End of variables declaration//GEN-END:variables
}
