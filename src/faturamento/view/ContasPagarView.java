package faturamento.view;

import faturamento.controller.ContatoController;
import faturamento.controller.EnderecoController;
import faturamento.controller.FuncionarioController;
import faturamento.model.ContatoModel;
import faturamento.model.EnderecoModel;
import faturamento.model.FuncionarioModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ContasPagarView extends IMenu {

    private String operacao;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {

        Boolean ativar = (operacao.equals("") ? false : true);

        this.operacao = operacao;
    }

    public ContasPagarView() {
        this.setPreferredSize(new Dimension(930, 530));
        this.initComponents();
        this.setLocationRelativeTo(null);

        this.inativarCampos();

        edtCON_CODIGO.setVisible(false);
        edtEND_CODIGO.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        pnlDADOS = new javax.swing.JPanel();
        lblFUN_CODIGO = new javax.swing.JLabel();
        edtFUN_CODIGO = new javax.swing.JTextField();
        edtFUN_NOME = new javax.swing.JTextField();
        lblFUN_NOME = new javax.swing.JLabel();
        lblFUN_CPF = new javax.swing.JLabel();
        edtFUN_CPF = new javax.swing.JTextField();
        lblFUN_DTADMISSAO = new javax.swing.JLabel();
        edtFUN_DTDEMISSAO = new javax.swing.JTextField();
        lblFUN_DTDEMISSAO = new javax.swing.JLabel();
        edtFUN_DTADMISSAO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblFUN_DTADMISSAO1 = new javax.swing.JLabel();
        edtFUN_CPF1 = new javax.swing.JTextField();
        lblFUN_CPF1 = new javax.swing.JLabel();
        pnlENDERECO = new javax.swing.JPanel();
        lblEND_ENDERECO = new javax.swing.JLabel();
        edtEND_ENDERECO = new javax.swing.JTextField();
        lblEND_NUMERO = new javax.swing.JLabel();
        edtEND_NUMERO = new javax.swing.JTextField();
        lblEND_BAIRRO = new javax.swing.JLabel();
        edtEND_BAIRRO = new javax.swing.JTextField();
        lblEND_CIDADE = new javax.swing.JLabel();
        edtEND_CIDADE = new javax.swing.JTextField();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        btnLIMPAR = new javax.swing.JButton();
        btnSALVAR = new javax.swing.JButton();
        btnNOVO = new javax.swing.JButton();
        btnPESQUISA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema - Cadastro de Funcionários");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-cadastro.png"))); // NOI18N
        lblTITULO.setText("CADASTRO DE CONTAS A PAGAR");
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 70));

        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.setFocusable(false);

        pnlDADOS.setBorder(null);

        lblFUN_CODIGO.setText("Código");

        edtFUN_CODIGO.setEditable(false);
        edtFUN_CODIGO.setToolTipText("");

        edtFUN_NOME.setToolTipText("Digite o nome completo do funcionário");

        lblFUN_NOME.setText("Fornecedor");

        lblFUN_CPF.setText("Número");

        edtFUN_CPF.setToolTipText("Digite o CPF do funcionário");
        edtFUN_CPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtFUN_CPFKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtFUN_CPFKeyReleased(evt);
            }
        });

        lblFUN_DTADMISSAO.setText("Emissão");

        edtFUN_DTDEMISSAO.setToolTipText("Digite a data de demissão do funcionário");
        edtFUN_DTDEMISSAO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtFUN_DTDEMISSAOKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtFUN_DTDEMISSAOKeyReleased(evt);
            }
        });

        lblFUN_DTDEMISSAO.setText("Vencimento");

        edtFUN_DTADMISSAO.setToolTipText("Digite a data de admissão do funcionário");
        edtFUN_DTADMISSAO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtFUN_DTADMISSAOKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtFUN_DTADMISSAOKeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblFUN_DTADMISSAO1.setText("Histórico");

        edtFUN_CPF1.setToolTipText("Digite o CPF do funcionário");
        edtFUN_CPF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtFUN_CPF1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtFUN_CPF1KeyReleased(evt);
            }
        });

        lblFUN_CPF1.setText("Boleto");

        javax.swing.GroupLayout pnlDADOSLayout = new javax.swing.GroupLayout(pnlDADOS);
        pnlDADOS.setLayout(pnlDADOSLayout);
        pnlDADOSLayout.setHorizontalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlDADOSLayout.createSequentialGroup()
                                .addComponent(lblFUN_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(393, 393, 393))
                            .addGroup(pnlDADOSLayout.createSequentialGroup()
                                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFUN_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtFUN_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtFUN_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(lblFUN_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDADOSLayout.createSequentialGroup()
                                                .addComponent(lblFUN_CPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(edtFUN_CPF1)))
                                    .addComponent(edtFUN_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFUN_DTADMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtFUN_DTADMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtFUN_DTDEMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFUN_DTDEMISSAO)))
                    .addComponent(lblFUN_DTADMISSAO1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlDADOSLayout.setVerticalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblFUN_CODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFUN_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFUN_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFUN_CPF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtFUN_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(edtFUN_CPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addComponent(lblFUN_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFUN_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFUN_DTADMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFUN_DTDEMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtFUN_DTADMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(edtFUN_DTDEMISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFUN_DTADMISSAO1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jTabbedPane.addTab("Dados Conta", pnlDADOS);

        pnlENDERECO.setBorder(null);

        lblEND_ENDERECO.setText("Valor");

        edtEND_ENDERECO.setToolTipText("Digite o endereço completo do funcionário");

        lblEND_NUMERO.setText("Pagamento");

        edtEND_NUMERO.setToolTipText("Digite o número da residência do funcionário");

        lblEND_BAIRRO.setText("Juros");

        edtEND_BAIRRO.setToolTipText("Digite o bairro da residência do funcionário");

        lblEND_CIDADE.setText("Desconto");

        edtEND_CIDADE.setToolTipText("Digite o nome da cidade do funcionário");

        javax.swing.GroupLayout pnlENDERECOLayout = new javax.swing.GroupLayout(pnlENDERECO);
        pnlENDERECO.setLayout(pnlENDERECOLayout);
        pnlENDERECOLayout.setHorizontalGroup(
            pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_ENDERECO)
                            .addComponent(edtEND_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_BAIRRO)
                            .addComponent(edtEND_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_CIDADE)
                            .addGroup(pnlENDERECOLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblEND_NUMERO)
                    .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        pnlENDERECOLayout.setVerticalGroup(
            pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlENDERECOLayout.createSequentialGroup()
                            .addComponent(lblEND_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(edtEND_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlENDERECOLayout.createSequentialGroup()
                            .addComponent(lblEND_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(edtEND_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addComponent(lblEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblEND_NUMERO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Pagamento", pnlENDERECO);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 880, 330));

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/iconAlterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        getContentPane().add(btnALTERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, 40));

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
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

        btnPESQUISA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-pesquisa.png"))); // NOI18N
        btnPESQUISA.setText("Pesquisar");
        btnPESQUISA.setFocusable(false);
        btnPESQUISA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPESQUISAActionPerformed(evt);
            }
        });
        getContentPane().add(btnPESQUISA, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIMPARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLIMPARMouseClicked

        this.limpar();

    }//GEN-LAST:event_btnLIMPARMouseClicked

    private void btnSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse funcionário?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (validacao()) {

                try {

                    EnderecoModel enderecomodel = new EnderecoModel();
                    ContatoModel contatomodel = new ContatoModel();

                    FuncionarioModel funcionariomodel = new FuncionarioModel();

                    enderecomodel.setEND_CODIGO(Integer.parseInt(edtEND_CODIGO.getText()));
                    enderecomodel.setEND_LOGRADOURO(cbxEND_LOGRADOURO.getSelectedItem().toString());
                    enderecomodel.setEND_ENDERECO(edtEND_ENDERECO.getText());
                    enderecomodel.setEND_NUMERO(edtEND_NUMERO.getText());
                    enderecomodel.setEND_BAIRRO(edtEND_BAIRRO.getText());
                    enderecomodel.setEND_CIDADE(edtEND_CIDADE.getText());
                    enderecomodel.setEND_CEP(edtEND_CEP.getText());
                    enderecomodel.setEND_UF(cbxEND_UF.getSelectedItem().toString());

                    funcionariomodel.setEND_MODEL(enderecomodel);

                    contatomodel.setCON_CODIGO(Integer.parseInt(edtCON_CODIGO.getText()));
                    contatomodel.setCON_TELEFONE(edtCON_TELEFONE.getText());
                    contatomodel.setCON_CELULAR(edtCON_CELULAR.getText());
                    contatomodel.setCON_EMAIL(edtCON_EMAIL.getText());

                    funcionariomodel.setCON_MODEL(contatomodel);

                    funcionariomodel.setFUN_CODIGO(Integer.parseInt(edtFUN_CODIGO.getText()));
                    funcionariomodel.setFUN_NOME(edtFUN_NOME.getText());
                    funcionariomodel.setFUN_CPF(edtFUN_CPF.getText());
                    funcionariomodel.setFUN_RG(edtFUN_RG.getText());
                    funcionariomodel.setFUN_CTPS(edtFUN_CTPS.getText());
                    funcionariomodel.setFUN_SALARIO(Double.parseDouble(edtFUN_SALARIO.getText()));
                    funcionariomodel.setFUN_DTADMISSAO(edtFUN_DTADMISSAO.getText());
                    funcionariomodel.setFUN_DTDEMISSAO(edtFUN_DTDEMISSAO.getText());

                    FuncionarioController funcionariocontroller = new FuncionarioController();
                    funcionariocontroller.gravar(getOperacao(), funcionariomodel);

                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
                    this.limpar();
                    this.inativarCampos();

                } catch (HeadlessException | NumberFormatException | SQLException erro) {

                    JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSALVARActionPerformed

    private void edtFUN_CPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_CPFKeyReleased
        String campo = edtFUN_CPF.getText();
        if (campo.length() == 11) {
            String cpf;
            cpf = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + campo.charAt(2) + "." + campo.charAt(3) + campo.charAt(4) + campo.charAt(5) + "." + campo.charAt(6) + campo.charAt(7) + campo.charAt(8) + "-" + campo.charAt(9) + campo.charAt(10));
            edtFUN_CPF.setText(cpf);
        }
    }//GEN-LAST:event_edtFUN_CPFKeyReleased

    private void edtFUN_CPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_CPFKeyTyped
        int quantidade = 11;
        if (edtFUN_CPF.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtFUN_CPFKeyTyped

    private void edtFUN_DTADMISSAOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_DTADMISSAOKeyReleased
        String campo = edtFUN_DTADMISSAO.getText();
        if (campo.length() == 8) {
            String data;
            data = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + "/" + campo.charAt(2) + campo.charAt(3) + "/" + campo.charAt(4) + campo.charAt(5) + campo.charAt(6) + campo.charAt(7));
            edtFUN_DTADMISSAO.setText(data);
        }
    }//GEN-LAST:event_edtFUN_DTADMISSAOKeyReleased

    private void edtFUN_DTADMISSAOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_DTADMISSAOKeyTyped
        int quantidade = 8;
        if (edtFUN_DTADMISSAO.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtFUN_DTADMISSAOKeyTyped

    private void edtFUN_DTDEMISSAOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_DTDEMISSAOKeyReleased
        String campo = edtFUN_DTDEMISSAO.getText();
        if (campo.length() == 8) {
            String data;
            data = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + "/" + campo.charAt(2) + campo.charAt(3) + "/" + campo.charAt(4) + campo.charAt(5) + campo.charAt(6) + campo.charAt(7));
            edtFUN_DTDEMISSAO.setText(data);
        }
    }//GEN-LAST:event_edtFUN_DTDEMISSAOKeyReleased

    private void edtFUN_DTDEMISSAOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_DTDEMISSAOKeyTyped
        int quantidade = 8;
        if (edtFUN_DTDEMISSAO.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtFUN_DTDEMISSAOKeyTyped

    private void btnNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVOActionPerformed
        this.ativarCampos();
        this.limpar();

        setOperacao("incluir");
    }//GEN-LAST:event_btnNOVOActionPerformed

    private void btnPESQUISAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPESQUISAActionPerformed
        this.dispose();
        PesquisaFuncionarioView pesquisa = new PesquisaFuncionarioView(this, true);
        pesquisa.setVisible(true);        
    }//GEN-LAST:event_btnPESQUISAActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        this.ativarCampos();
        
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir esse funcionário?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
                try {

                    EnderecoModel enderecomodel = new EnderecoModel();
                    ContatoModel contatomodel = new ContatoModel();

                    FuncionarioModel funcionariomodel = new FuncionarioModel();

                    enderecomodel.setEND_CODIGO(Integer.parseInt(edtEND_CODIGO.getText()));
                    enderecomodel.setEND_LOGRADOURO(cbxEND_LOGRADOURO.getSelectedItem().toString());
                    enderecomodel.setEND_ENDERECO(edtEND_ENDERECO.getText());
                    enderecomodel.setEND_NUMERO(edtEND_NUMERO.getText());
                    enderecomodel.setEND_BAIRRO(edtEND_BAIRRO.getText());
                    enderecomodel.setEND_CIDADE(edtEND_CIDADE.getText());
                    enderecomodel.setEND_CEP(edtEND_CEP.getText());
                    enderecomodel.setEND_UF(cbxEND_UF.getSelectedItem().toString());

                    funcionariomodel.setEND_MODEL(enderecomodel);

                    contatomodel.setCON_CODIGO(Integer.parseInt(edtCON_CODIGO.getText()));
                    contatomodel.setCON_TELEFONE(edtCON_TELEFONE.getText());
                    contatomodel.setCON_CELULAR(edtCON_CELULAR.getText());
                    contatomodel.setCON_EMAIL(edtCON_EMAIL.getText());

                    funcionariomodel.setCON_MODEL(contatomodel);

                    funcionariomodel.setFUN_CODIGO(Integer.parseInt(edtFUN_CODIGO.getText()));
                    funcionariomodel.setFUN_NOME(edtFUN_NOME.getText());
                    funcionariomodel.setFUN_CPF(edtFUN_CPF.getText());
                    funcionariomodel.setFUN_RG(edtFUN_RG.getText());
                    funcionariomodel.setFUN_CTPS(edtFUN_CTPS.getText());
                    funcionariomodel.setFUN_SALARIO(Double.parseDouble(edtFUN_SALARIO.getText()));
                    funcionariomodel.setFUN_DTADMISSAO(edtFUN_DTADMISSAO.getText());
                    funcionariomodel.setFUN_DTDEMISSAO(edtFUN_DTDEMISSAO.getText());

                    FuncionarioController funcionariocontroller = new FuncionarioController();
                    funcionariocontroller.excluir(funcionariomodel);

                    JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso!", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
                    this.limpar();
                    this.inativarCampos();

                } catch (HeadlessException | NumberFormatException | SQLException erro) {

                    JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            
        }      
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtFUN_CPF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_CPF1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFUN_CPF1KeyTyped

    private void edtFUN_CPF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtFUN_CPF1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFUN_CPF1KeyReleased

    public void limpar() {

        edtFUN_CODIGO.setText("0");
        edtEND_CODIGO.setText("0");
        edtCON_CODIGO.setText("0");

        edtFUN_NOME.setText("");
        edtFUN_DTADMISSAO.setText("");
        edtFUN_DTDEMISSAO.setText("");
        edtFUN_CPF.setText("");
        edtFUN_RG.setText("");
        edtFUN_CTPS.setText("");
        edtFUN_SALARIO.setText("");

        edtEND_ENDERECO.setText("");
        edtEND_BAIRRO.setText("");
        edtEND_CEP.setText("");
        edtEND_CIDADE.setText("");
        edtEND_NUMERO.setText("");
        cbxEND_LOGRADOURO.setSelectedItem("Selecionar");
        cbxEND_UF.setSelectedItem("Selecionar");

        edtCON_CELULAR.setText("");
        edtCON_EMAIL.setText("");
        edtCON_TELEFONE.setText("");
    }

    private boolean validacao() {

        String menssagemerro = "";

        if (edtFUN_NOME.getText() == null || edtFUN_NOME.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtFUN_NOME.setBorder(border);

            menssagemerro += "Nome inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtFUN_NOME.setBorder(border);
        }

        if (edtFUN_DTADMISSAO.getText() == null || edtFUN_DTADMISSAO.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtFUN_DTADMISSAO.setBorder(border);

            menssagemerro += "Admissão inválida\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtFUN_DTADMISSAO.setBorder(border);

        }

        if (edtFUN_CPF.getText() == null || edtFUN_CPF.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtFUN_CPF.setBorder(border);

            menssagemerro += "CPF inválido\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtFUN_CPF.setBorder(border);

        }

        if (edtFUN_RG.getText() == null || edtFUN_RG.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtFUN_RG.setBorder(border);

            menssagemerro += "RG inválido\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtFUN_RG.setBorder(border);
        }

        if (edtFUN_CTPS.getText() == null || edtFUN_CTPS.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtFUN_CTPS.setBorder(border);

            menssagemerro += "CTPS inválida\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtFUN_CTPS.setBorder(border);
        }

        if (menssagemerro.length() == 0) {

            return true;

        } else {

            JOptionPane.showMessageDialog(null, "Os campos abaixo são obrigatórios\n\n" + menssagemerro, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void ativarCampos() {

        edtFUN_CPF.setEditable(true);
        edtFUN_CTPS.setEditable(true);
        edtFUN_DTADMISSAO.setEditable(true);
        edtFUN_DTDEMISSAO.setEditable(true);
        edtFUN_NOME.setEditable(true);
        edtFUN_RG.setEditable(true);
        edtFUN_SALARIO.setEditable(true);

        edtEND_BAIRRO.setEditable(true);
        edtEND_CEP.setEditable(true);
        edtEND_CIDADE.setEditable(true);
        edtEND_ENDERECO.setEditable(true);
        edtEND_NUMERO.setEditable(true);

        edtCON_CELULAR.setEditable(true);
        edtCON_EMAIL.setEditable(true);
        edtCON_TELEFONE.setEditable(true);
        
        cbxEND_LOGRADOURO.setEnabled(true);
        cbxEND_UF.setEnabled(true);

        btnSALVAR.setEnabled(true);    
         
    }

    public void inativarCampos() {

        edtFUN_CPF.setEditable(false);
        edtFUN_CTPS.setEditable(false);
        edtFUN_DTADMISSAO.setEditable(false);
        edtFUN_DTDEMISSAO.setEditable(false);
        edtFUN_NOME.setEditable(false);
        edtFUN_RG.setEditable(false);
        edtFUN_SALARIO.setEditable(false);

        edtEND_BAIRRO.setEditable(false);
        edtEND_CEP.setEditable(false);
        edtEND_CIDADE.setEditable(false);
        edtEND_ENDERECO.setEditable(false);
        edtEND_NUMERO.setEditable(false);

        edtCON_CELULAR.setEditable(false);
        edtCON_EMAIL.setEditable(false);
        edtCON_TELEFONE.setEditable(false);

        btnSALVAR.setEnabled(false);
        btnALTERAR.setEnabled(false);
        btnEXCLUIR.setEnabled(false);
        
        cbxEND_LOGRADOURO.setEnabled(false);
        cbxEND_UF.setEnabled(false);
    }
    
    public void ativarBotoes() {
        
        btnALTERAR.setEnabled(true);
        btnEXCLUIR.setEnabled(true);
        
        btnNOVO.setEnabled(false);
    }
    
   public void mostrar(FuncionarioModel funcionario) {
       
        edtFUN_CODIGO.setText(String.valueOf(funcionario.getFUN_CODIGO()));
        edtFUN_NOME.setText(String.valueOf(funcionario.getFUN_NOME()));
        edtFUN_CPF.setText(String.valueOf(funcionario.getFUN_CPF()));
        edtFUN_CTPS.setText(String.valueOf(funcionario.getFUN_CTPS()));
        edtFUN_DTADMISSAO.setText(funcionario.getFUN_DTADMISSAO());
        edtFUN_DTDEMISSAO.setText(funcionario.getFUN_DTDEMISSAO());
        edtFUN_RG.setText(String.valueOf(funcionario.getFUN_RG()));
        edtFUN_SALARIO.setText(String.valueOf(funcionario.getFUN_SALARIO()));
        
        edtEND_CODIGO.setText(String.valueOf(funcionario.getEND_MODEL().getEND_CODIGO()));
        cbxEND_LOGRADOURO.setSelectedItem(funcionario.getEND_MODEL().getEND_LOGRADOURO());
        edtEND_ENDERECO.setText(String.valueOf(funcionario.getEND_MODEL().getEND_ENDERECO()));
        edtEND_NUMERO.setText(String.valueOf(funcionario.getEND_MODEL().getEND_NUMERO()));
        edtEND_BAIRRO.setText(String.valueOf(funcionario.getEND_MODEL().getEND_BAIRRO()));
        edtEND_CIDADE.setText(String.valueOf(funcionario.getEND_MODEL().getEND_CIDADE()));
        edtEND_CEP.setText(String.valueOf(funcionario.getEND_MODEL().getEND_CEP()));
        cbxEND_UF.setSelectedItem(funcionario.getEND_MODEL().getEND_UF());
        
        edtCON_CODIGO.setText(String.valueOf(funcionario.getCON_MODEL().getCON_CODIGO()));
        edtCON_CELULAR.setText(funcionario.getCON_MODEL().getCON_CELULAR());
        edtCON_TELEFONE.setText(funcionario.getCON_MODEL().getCON_TELEFONE());
        edtCON_EMAIL.setText(funcionario.getCON_MODEL().getCON_EMAIL());    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JButton btnNOVO;
    private javax.swing.JButton btnPESQUISA;
    private javax.swing.JButton btnSALVAR;
    private javax.swing.JTextField edtEND_BAIRRO;
    private javax.swing.JTextField edtEND_CIDADE;
    private javax.swing.JTextField edtEND_ENDERECO;
    private javax.swing.JTextField edtEND_NUMERO;
    private javax.swing.JTextField edtFUN_CODIGO;
    private javax.swing.JTextField edtFUN_CPF;
    private javax.swing.JTextField edtFUN_CPF1;
    private javax.swing.JTextField edtFUN_DTADMISSAO;
    private javax.swing.JTextField edtFUN_DTDEMISSAO;
    public javax.swing.JTextField edtFUN_NOME;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEND_BAIRRO;
    private javax.swing.JLabel lblEND_CIDADE;
    private javax.swing.JLabel lblEND_ENDERECO;
    private javax.swing.JLabel lblEND_NUMERO;
    private javax.swing.JLabel lblFUN_CODIGO;
    private javax.swing.JLabel lblFUN_CPF;
    private javax.swing.JLabel lblFUN_CPF1;
    private javax.swing.JLabel lblFUN_DTADMISSAO;
    private javax.swing.JLabel lblFUN_DTADMISSAO1;
    private javax.swing.JLabel lblFUN_DTDEMISSAO;
    private javax.swing.JLabel lblFUN_NOME;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel pnlDADOS;
    private javax.swing.JPanel pnlENDERECO;
    // End of variables declaration//GEN-END:variables
}
