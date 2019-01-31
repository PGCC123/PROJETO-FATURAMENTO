package faturamento.view;

import faturamento.controller.ClienteController;
import faturamento.controller.ContatoController;
import faturamento.controller.EnderecoController;
import faturamento.model.ClienteModel;
import faturamento.model.ContatoModel;
import faturamento.model.EnderecoModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ClienteView extends IMenu {

    private String operacao;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {

        Boolean ativar = (operacao.equals("") ? false : true);

        this.operacao = operacao;
    }

    public ClienteView() {
        this.setPreferredSize(new Dimension(930, 530));
        this.initComponents();
        this.setLocationRelativeTo(null);

        this.inativarCampos();

        edtCON_CODIGO.setVisible(false);
        edtEND_CODIGO.setVisible(false);

        this.escolhaCliente(); //metodo que tem como funcionalidade alterar a mask de acordo com o tipo de cliente.
    }

    public void escolhaCliente() {

        cbxCLI_FISICA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbxCLI_FISICA.getSelectedItem().equals("FÍSICA")) {

                    lblCLI_CNPJ.setText("CPF");
                    lblCLI_INSCEST.setText("RG");
                    try {
                        edtCLI_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
                        edtCLI_INSCEST.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
                    } catch (ParseException ex) {
                        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (cbxCLI_FISICA.getSelectedItem().equals("JÚRIDICA")) {
                    lblCLI_CNPJ.setText("CNPJ");
                    lblCLI_INSCEST.setText("INSCEST");
                    try {
                        edtCLI_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
                        edtCLI_INSCEST.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
                    } catch (ParseException ex) {
                        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (cbxCLI_FISICA.getSelectedItem().equals("Selecionar")) {
                    lblCLI_CNPJ.setText("CPF/CNPJ");
                    lblCLI_INSCEST.setText("RG/INSCEST");

                    try {
                        edtCLI_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
                        edtCLI_INSCEST.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
                    } catch (ParseException ex) {
                        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        pnlDADOS = new javax.swing.JPanel();
        lblCLI_CODIGO = new javax.swing.JLabel();
        edtCLI_CODIGO = new javax.swing.JTextField();
        edtCLI_NOME = new javax.swing.JTextField();
        lblCLI_NOME = new javax.swing.JLabel();
        lblCLI_CNPJ = new javax.swing.JLabel();
        lblCLI_INSCEST = new javax.swing.JLabel();
        lblCLI_LIMITECRED = new javax.swing.JLabel();
        edtCLI_LIMITECRED = new javax.swing.JTextField();
        edtEND_CODIGO = new javax.swing.JTextField();
        edtCON_CODIGO = new javax.swing.JTextField();
        cbxCLI_FISICA = new javax.swing.JComboBox<>();
        lblCLI_FISICA = new javax.swing.JLabel();
        edtCLI_CNPJ = new javax.swing.JFormattedTextField();
        edtCLI_INSCEST = new javax.swing.JFormattedTextField();
        pnlENDERECO = new javax.swing.JPanel();
        lblEND_LOGRADOURO = new javax.swing.JLabel();
        cbxEND_LOGRADOURO = new javax.swing.JComboBox<>();
        lblEND_ENDERECO = new javax.swing.JLabel();
        edtEND_ENDERECO = new javax.swing.JTextField();
        lblEND_NUMERO = new javax.swing.JLabel();
        edtEND_NUMERO = new javax.swing.JTextField();
        lblEND_CEP = new javax.swing.JLabel();
        edtEND_CEP = new javax.swing.JTextField();
        lblEND_BAIRRO = new javax.swing.JLabel();
        edtEND_BAIRRO = new javax.swing.JTextField();
        lblEND_CIDADE = new javax.swing.JLabel();
        edtEND_CIDADE = new javax.swing.JTextField();
        lblEND_UF = new javax.swing.JLabel();
        cbxEND_UF = new javax.swing.JComboBox<>();
        pnlCONTATO = new javax.swing.JPanel();
        lblCON_TELEFONE = new javax.swing.JLabel();
        edtCON_TELEFONE = new javax.swing.JTextField();
        lblCON_CELULAR = new javax.swing.JLabel();
        edtCON_CELULAR = new javax.swing.JTextField();
        lblCON_EMAIL = new javax.swing.JLabel();
        edtCON_EMAIL = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlENDERECO_COBRANCA = new javax.swing.JPanel();
        lblCLI_COBR_LOGRADOURO = new javax.swing.JLabel();
        cbxCLI_COBR_LOGRADOURO = new javax.swing.JComboBox<>();
        lblCLI_COBR_ENDERECO = new javax.swing.JLabel();
        edtCLI_COBR_ENDERECO = new javax.swing.JTextField();
        lblCLI_COBR_NUMERO = new javax.swing.JLabel();
        edtCLI_COBR_NUMERO = new javax.swing.JTextField();
        lblCLI_COBR_CEP = new javax.swing.JLabel();
        lblCLI_COBR_BAIRRO = new javax.swing.JLabel();
        edtCLI_COBR_BAIRRO = new javax.swing.JTextField();
        lblCLI_COBR_CIDADE = new javax.swing.JLabel();
        edtCLI_COBR_CIDADE = new javax.swing.JTextField();
        lblCLI_COBR_UF = new javax.swing.JLabel();
        cbxCLI_COBR_UF = new javax.swing.JComboBox<>();
        edtCLI_COBR_CEP = new javax.swing.JTextField();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        btnLIMPAR = new javax.swing.JButton();
        btnSALVAR = new javax.swing.JButton();
        btnPESQUISA = new javax.swing.JButton();
        btnNOVO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema - Cadastro de Clientes");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTITULO.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTITULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-cliente.png"))); // NOI18N
        lblTITULO.setText("CADASTRO DE CLIENTES");
        getContentPane().add(lblTITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, 70));

        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.setFocusable(false);

        lblCLI_CODIGO.setText("Código");

        edtCLI_CODIGO.setEditable(false);
        edtCLI_CODIGO.setToolTipText("");

        edtCLI_NOME.setToolTipText("Digite o nome completo do funcionário");

        lblCLI_NOME.setText("Nome");

        lblCLI_CNPJ.setText("CPF/CNPJ");

        lblCLI_INSCEST.setText("RG/INSCEST");

        lblCLI_LIMITECRED.setText("Límite de Crédito");

        edtCLI_LIMITECRED.setToolTipText("Digite o salário do funcionário");

        edtEND_CODIGO.setEditable(false);
        edtEND_CODIGO.setToolTipText("");

        edtCON_CODIGO.setEditable(false);
        edtCON_CODIGO.setToolTipText("");

        cbxCLI_FISICA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "FÍSICA", "JÚRIDICA" }));
        cbxCLI_FISICA.setFocusable(false);

        lblCLI_FISICA.setText("Física/Júridica");

        edtCLI_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        edtCLI_INSCEST.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout pnlDADOSLayout = new javax.swing.GroupLayout(pnlDADOS);
        pnlDADOS.setLayout(pnlDADOSLayout);
        pnlDADOSLayout.setHorizontalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDADOSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(edtEND_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCON_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDADOSLayout.createSequentialGroup()
                        .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCLI_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDADOSLayout.createSequentialGroup()
                                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCLI_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCLI_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCLI_INSCEST, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCLI_INSCEST, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlDADOSLayout.createSequentialGroup()
                                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxCLI_FISICA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCLI_FISICA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 385, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDADOSLayout.setVerticalGroup(
            pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDADOSLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCLI_CODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(lblCLI_FISICA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCLI_FISICA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCLI_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCLI_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCLI_CNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCLI_INSCEST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCLI_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCLI_INSCEST, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCON_CODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(edtEND_CODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        jTabbedPane.addTab("Dados Pessoais", pnlDADOS);

        lblEND_LOGRADOURO.setText("Logradouro");

        cbxEND_LOGRADOURO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "RUA", "ALAMENDA", "AVENIDA", "BLOCO", "FAZENDA", "VILA" }));
        cbxEND_LOGRADOURO.setFocusable(false);

        lblEND_ENDERECO.setText("Endereço");

        edtEND_ENDERECO.setToolTipText("Digite o endereço completo do funcionário");

        lblEND_NUMERO.setText("Número");

        edtEND_NUMERO.setToolTipText("Digite o número da residência do funcionário");

        lblEND_CEP.setText("CEP");

        edtEND_CEP.setToolTipText("Digite o CEP do endereço do funcionário");
        edtEND_CEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtEND_CEPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEND_CEPKeyTyped(evt);
            }
        });

        lblEND_BAIRRO.setText("Bairro");

        edtEND_BAIRRO.setToolTipText("Digite o bairro da residência do funcionário");

        lblEND_CIDADE.setText("Cidade");

        edtEND_CIDADE.setToolTipText("Digite o nome da cidade do funcionário");

        lblEND_UF.setText("UF");

        cbxEND_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxEND_UF.setFocusable(false);

        javax.swing.GroupLayout pnlENDERECOLayout = new javax.swing.GroupLayout(pnlENDERECO);
        pnlENDERECO.setLayout(pnlENDERECOLayout);
        pnlENDERECOLayout.setHorizontalGroup(
            pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEND_LOGRADOURO)
                    .addComponent(cbxEND_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtEND_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEND_ENDERECO))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_NUMERO)
                            .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_CEP)
                            .addComponent(edtEND_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtEND_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEND_BAIRRO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEND_CIDADE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEND_UF)
                            .addComponent(cbxEND_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlENDERECOLayout.setVerticalGroup(
            pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECOLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblEND_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cbxEND_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEND_NUMERO, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(lblEND_CEP, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEND_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtEND_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtEND_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlENDERECOLayout.createSequentialGroup()
                        .addComponent(lblEND_ENDERECO, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEND_BAIRRO, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblEND_CIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblEND_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlENDERECOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEND_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEND_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEND_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        jTabbedPane.addTab("Endereço", pnlENDERECO);

        lblCON_TELEFONE.setText("Telefone");

        edtCON_TELEFONE.setToolTipText("Digite o número do telefone fixo do funcionário");
        edtCON_TELEFONE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCON_TELEFONEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCON_TELEFONEKeyTyped(evt);
            }
        });

        lblCON_CELULAR.setText("Celular");

        edtCON_CELULAR.setToolTipText("Digite o número de celular do funcionário");
        edtCON_CELULAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCON_CELULARKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCON_CELULARKeyTyped(evt);
            }
        });

        lblCON_EMAIL.setText("E-mail");

        edtCON_EMAIL.setToolTipText("Digite o endereço de e-mail do funcionário");

        javax.swing.GroupLayout pnlCONTATOLayout = new javax.swing.GroupLayout(pnlCONTATO);
        pnlCONTATO.setLayout(pnlCONTATOLayout);
        pnlCONTATOLayout.setHorizontalGroup(
            pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCONTATOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCON_EMAIL)
                    .addComponent(edtCON_EMAIL)
                    .addGroup(pnlCONTATOLayout.createSequentialGroup()
                        .addGroup(pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCON_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCON_TELEFONE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCON_CELULAR)
                            .addComponent(edtCON_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        pnlCONTATOLayout.setVerticalGroup(
            pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCONTATOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCON_TELEFONE, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(lblCON_CELULAR, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCONTATOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCON_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCON_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCON_EMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCON_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        jTabbedPane.addTab("Contato", pnlCONTATO);

        lblCLI_COBR_LOGRADOURO.setText("Logradouro");

        cbxCLI_COBR_LOGRADOURO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "RUA", "ALAMENDA", "AVENIDA", "BLOCO", "FAZENDA", "VILA" }));
        cbxCLI_COBR_LOGRADOURO.setFocusable(false);

        lblCLI_COBR_ENDERECO.setText("Endereço");

        edtCLI_COBR_ENDERECO.setToolTipText("Digite o endereço completo do funcionário");

        lblCLI_COBR_NUMERO.setText("Número");

        edtCLI_COBR_NUMERO.setToolTipText("Digite o número da residência do funcionário");

        lblCLI_COBR_CEP.setText("CEP");

        lblCLI_COBR_BAIRRO.setText("Bairro");

        edtCLI_COBR_BAIRRO.setToolTipText("Digite o bairro da residência do funcionário");

        lblCLI_COBR_CIDADE.setText("Cidade");

        edtCLI_COBR_CIDADE.setToolTipText("Digite o nome da cidade do funcionário");

        lblCLI_COBR_UF.setText("UF");

        cbxCLI_COBR_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxCLI_COBR_UF.setFocusable(false);

        edtCLI_COBR_CEP.setToolTipText("Digite o CEP do endereço do funcionário");
        edtCLI_COBR_CEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCLI_COBR_CEPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtCLI_COBR_CEPKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlENDERECO_COBRANCALayout = new javax.swing.GroupLayout(pnlENDERECO_COBRANCA);
        pnlENDERECO_COBRANCA.setLayout(pnlENDERECO_COBRANCALayout);
        pnlENDERECO_COBRANCALayout.setHorizontalGroup(
            pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCLI_COBR_LOGRADOURO)
                    .addComponent(cbxCLI_COBR_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_COBR_ENDERECO)
                            .addComponent(edtCLI_COBR_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_COBR_NUMERO)
                            .addComponent(edtCLI_COBR_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_COBR_CEP)
                            .addComponent(edtCLI_COBR_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCLI_COBR_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCLI_COBR_BAIRRO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_COBR_CIDADE)
                            .addComponent(edtCLI_COBR_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCLI_COBR_UF)
                            .addComponent(cbxCLI_COBR_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pnlENDERECO_COBRANCALayout.setVerticalGroup(
            pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCLI_COBR_LOGRADOURO, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCLI_COBR_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCLI_COBR_NUMERO, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(lblCLI_COBR_CEP, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCLI_COBR_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCLI_COBR_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCLI_COBR_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlENDERECO_COBRANCALayout.createSequentialGroup()
                        .addComponent(lblCLI_COBR_ENDERECO, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCLI_COBR_CIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCLI_COBR_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCLI_COBR_BAIRRO, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlENDERECO_COBRANCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCLI_COBR_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCLI_COBR_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCLI_COBR_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlENDERECO_COBRANCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlENDERECO_COBRANCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Endereço de Cobrança", jPanel1);

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

        btnPESQUISA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/faturamento/icone/icon-pesquisa.png"))); // NOI18N
        btnPESQUISA.setText("Pesquisar");
        btnPESQUISA.setFocusable(false);
        btnPESQUISA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPESQUISAActionPerformed(evt);
            }
        });
        getContentPane().add(btnPESQUISA, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 120, 40));

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
        if (JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse cliente?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (validacao()) {

                try {

                    EnderecoModel enderecomodel = new EnderecoModel();
                    ContatoModel contatomodel = new ContatoModel();

                    ClienteModel clientemodel = new ClienteModel();

                    enderecomodel.setEND_CODIGO(Integer.parseInt(edtEND_CODIGO.getText()));
                    enderecomodel.setEND_LOGRADOURO(cbxEND_LOGRADOURO.getSelectedItem().toString());
                    enderecomodel.setEND_ENDERECO(edtEND_ENDERECO.getText());
                    enderecomodel.setEND_NUMERO(edtEND_NUMERO.getText());
                    enderecomodel.setEND_BAIRRO(edtEND_BAIRRO.getText());
                    enderecomodel.setEND_CIDADE(edtEND_CIDADE.getText());
                    enderecomodel.setEND_CEP(edtEND_CEP.getText());
                    enderecomodel.setEND_UF(cbxEND_UF.getSelectedItem().toString());

                    clientemodel.setEND_MODEL(enderecomodel);

                    contatomodel.setCON_CODIGO(Integer.parseInt(edtCON_CODIGO.getText()));
                    contatomodel.setCON_TELEFONE(edtCON_TELEFONE.getText());
                    contatomodel.setCON_CELULAR(edtCON_CELULAR.getText());
                    contatomodel.setCON_EMAIL(edtCON_EMAIL.getText());

                    clientemodel.setCON_MODEL(contatomodel);

                    //inicio dos atributos da classe ClienteModel
                    clientemodel.setCLI_CODIGO(Integer.parseInt(edtCLI_CODIGO.getText()));
                    clientemodel.setCLI_FISICA(cbxCLI_FISICA.getSelectedItem().toString());
                    clientemodel.setCLI_NOME(edtCLI_NOME.getText());
                    clientemodel.setCLI_CNPJ(edtCLI_CNPJ.getText());
                    clientemodel.setCLI_INSCEST(edtCLI_INSCEST.getText());
                    clientemodel.setCLI_LIMITECRED(Double.parseDouble(edtCLI_LIMITECRED.getText()));

                    clientemodel.setCLI_COBR_LOGRADOURO(cbxCLI_COBR_LOGRADOURO.getSelectedItem().toString());
                    clientemodel.setCLI_COBR_ENDERECO(edtCLI_COBR_ENDERECO.getText());
                    clientemodel.setCLI_COBR_NUMERO(edtCLI_COBR_NUMERO.getText());
                    clientemodel.setCLI_COBR_CEP(edtCLI_COBR_CEP.getText());
                    clientemodel.setCLI_COBR_BAIRRO(edtCLI_COBR_BAIRRO.getText());
                    clientemodel.setCLI_COBR_CIDADE(edtCLI_COBR_CIDADE.getText());
                    clientemodel.setCLI_COBR_UF(cbxCLI_COBR_UF.getSelectedItem().toString());
                    //fim dos atributos da classe ClienteModel

                    ClienteController clientecontroller = new ClienteController();
                    clientecontroller.gravar(getOperacao(), clientemodel);

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
                    this.limpar();
                    this.inativarCampos();

                } catch (HeadlessException | NumberFormatException | SQLException erro) {

                    JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSALVARActionPerformed

    private void edtEND_CEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEND_CEPKeyReleased
        String campo = edtEND_CEP.getText();
        if (campo.length() == 8) {
            String cep;
            cep = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + campo.charAt(2) + campo.charAt(3) + campo.charAt(4) + "-" + campo.charAt(5) + campo.charAt(6) + campo.charAt(7));
            edtEND_CEP.setText(cep);
        }
    }//GEN-LAST:event_edtEND_CEPKeyReleased

    private void edtEND_CEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEND_CEPKeyTyped
        int quantidade = 8;
        if (edtEND_CEP.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtEND_CEPKeyTyped

    private void edtCON_TELEFONEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCON_TELEFONEKeyReleased
        String campo = edtCON_TELEFONE.getText();
        if (campo.length() == 10) {
            String fone1;
            fone1 = String.valueOf("" + "(" + campo.charAt(0) + campo.charAt(1) + ") " + campo.charAt(2) + campo.charAt(3) + campo.charAt(4) + campo.charAt(5) + "-" + campo.charAt(6) + campo.charAt(7) + campo.charAt(8) + campo.charAt(9));
            edtCON_TELEFONE.setText(fone1);
        }
    }//GEN-LAST:event_edtCON_TELEFONEKeyReleased

    private void edtCON_TELEFONEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCON_TELEFONEKeyTyped
        int quantidade = 10;
        if (edtCON_TELEFONE.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtCON_TELEFONEKeyTyped

    private void edtCON_CELULARKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCON_CELULARKeyReleased
        String campo = edtCON_CELULAR.getText();
        if (campo.length() == 10) {
            String fone2;
            fone2 = String.valueOf("" + "(" + campo.charAt(0) + campo.charAt(1) + ") " + campo.charAt(2) + campo.charAt(3) + campo.charAt(4) + campo.charAt(5) + "-" + campo.charAt(6) + campo.charAt(7) + campo.charAt(8) + campo.charAt(9));
            edtCON_CELULAR.setText(fone2);
        }
    }//GEN-LAST:event_edtCON_CELULARKeyReleased

    private void edtCON_CELULARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCON_CELULARKeyTyped
        int quantidade = 10;
        if (edtCON_CELULAR.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtCON_CELULARKeyTyped

    private void btnPESQUISAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPESQUISAActionPerformed
        this.dispose();
        PesquisaClienteView pesquisa = new PesquisaClienteView(this, true);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_btnPESQUISAActionPerformed

    private void btnNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVOActionPerformed
        this.ativarCampos();
        this.limpar();

        setOperacao("incluir");
    }//GEN-LAST:event_btnNOVOActionPerformed

    private void edtCLI_COBR_CEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCLI_COBR_CEPKeyReleased
        String campo = edtCLI_COBR_CEP.getText();
        if (campo.length() == 8) {
            String cep;
            cep = String.valueOf("" + campo.charAt(0) + campo.charAt(1) + campo.charAt(2) + campo.charAt(3) + campo.charAt(4) + "-" + campo.charAt(5) + campo.charAt(6) + campo.charAt(7));
            edtCLI_COBR_CEP.setText(cep);
        }
    }//GEN-LAST:event_edtCLI_COBR_CEPKeyReleased

    private void edtCLI_COBR_CEPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCLI_COBR_CEPKeyTyped
        int quantidade = 8;
        if (edtCLI_COBR_CEP.getText().length() >= quantidade) {
            evt.consume();
        }
    }//GEN-LAST:event_edtCLI_COBR_CEPKeyTyped

    public void limpar() {

        edtCLI_CODIGO.setText("0");
        edtEND_CODIGO.setText("0");
        edtCON_CODIGO.setText("0");
        edtCLI_NOME.setText("");
        edtCLI_CNPJ.setText("");
        edtCLI_INSCEST.setText("");
        edtCLI_LIMITECRED.setText("");

        cbxCLI_COBR_LOGRADOURO.setSelectedItem("Selecionar");
        edtCLI_COBR_ENDERECO.setText("");
        edtCLI_COBR_NUMERO.setText("");
        edtCLI_COBR_CEP.setText("");
        edtCLI_COBR_BAIRRO.setText("");
        edtCLI_COBR_CIDADE.setText("");
        cbxCLI_COBR_UF.setSelectedItem("Selecionar");

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

        if (edtCLI_NOME.getText() == null || edtCLI_NOME.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1);
            edtCLI_NOME.setBorder(border);

            menssagemerro += "Nome inválido!\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, (int) 1);
            edtCLI_NOME.setBorder(border);
        }

        if (edtCLI_CNPJ.getText().length() < 11 || edtCLI_CNPJ.getText().length() < 14 || edtCLI_CNPJ.getText() == null) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtCLI_CNPJ.setBorder(border);

            menssagemerro += "CPF/CNPJ inválido\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtCLI_CNPJ.setBorder(border);

        }

        if (edtCLI_INSCEST.getText().length() < 9 || edtCLI_INSCEST.getText().length() < 12 || edtCLI_INSCEST.getText() == null) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtCLI_INSCEST.setBorder(border);

            menssagemerro += "RG/INSCEST inválido\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtCLI_INSCEST.setBorder(border);
        }

        if (edtCLI_LIMITECRED.getText() == null || edtCLI_LIMITECRED.getText().length() == 0) {

            Border border = BorderFactory.createLineBorder(Color.RED, (int) 1.5);
            edtCLI_LIMITECRED.setBorder(border);

            menssagemerro += "Limíte de Crédito inválida\n";

        } else {

            Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
            edtCLI_LIMITECRED.setBorder(border);
        }

        if (menssagemerro.length() == 0) {

            return true;

        } else {

            JOptionPane.showMessageDialog(null, "Os campos abaixo são obrigatórios\n\n" + menssagemerro, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void ativarCampos() {

        edtCLI_CNPJ.setEnabled(true);
        edtCLI_NOME.setEnabled(true);
        edtCLI_INSCEST.setEnabled(true);
        edtCLI_LIMITECRED.setEnabled(true);

        edtCLI_COBR_ENDERECO.setEnabled(true);
        edtCLI_COBR_BAIRRO.setEnabled(true);
        edtCLI_COBR_CEP.setEnabled(true);
        edtCLI_COBR_CIDADE.setEnabled(true);
        edtCLI_COBR_NUMERO.setEnabled(true);

        edtEND_BAIRRO.setEnabled(true);
        edtEND_CEP.setEnabled(true);
        edtEND_CIDADE.setEnabled(true);
        edtEND_ENDERECO.setEnabled(true);
        edtEND_NUMERO.setEnabled(true);

        edtCON_CELULAR.setEnabled(true);
        edtCON_EMAIL.setEnabled(true);
        edtCON_TELEFONE.setEnabled(true);

        btnSALVAR.setEnabled(true);
        btnALTERAR.setEnabled(true);
        btnEXCLUIR.setEnabled(true);

        cbxCLI_COBR_LOGRADOURO.setEnabled(true);
        cbxCLI_COBR_UF.setEnabled(true);
        cbxCLI_FISICA.setEnabled(true);
        cbxEND_UF.setEnabled(true);
        cbxEND_LOGRADOURO.setEnabled(true);
    }

    public void inativarCampos() {

        edtCLI_CNPJ.setEnabled(false);
        edtCLI_NOME.setEnabled(false);
        edtCLI_INSCEST.setEnabled(false);
        edtCLI_LIMITECRED.setEnabled(false);

        edtCLI_COBR_ENDERECO.setEnabled(false);
        edtCLI_COBR_BAIRRO.setEnabled(false);
        edtCLI_COBR_CEP.setEnabled(false);
        edtCLI_COBR_CIDADE.setEnabled(false);
        edtCLI_COBR_NUMERO.setEnabled(false);

        edtEND_BAIRRO.setEnabled(false);
        edtEND_CEP.setEnabled(false);
        edtEND_CIDADE.setEnabled(false);
        edtEND_ENDERECO.setEnabled(false);
        edtEND_NUMERO.setEnabled(false);

        edtCON_CELULAR.setEnabled(false);
        edtCON_EMAIL.setEnabled(false);
        edtCON_TELEFONE.setEnabled(false);

        btnSALVAR.setEnabled(false);
        btnALTERAR.setEnabled(false);
        btnEXCLUIR.setEnabled(false);

        cbxCLI_COBR_LOGRADOURO.setEnabled(false);
        cbxCLI_COBR_UF.setEnabled(false);
        cbxCLI_FISICA.setEnabled(false);
        cbxEND_UF.setEnabled(false);
        cbxEND_LOGRADOURO.setEnabled(false);

    }

    public void ativarBotoes() {

        btnALTERAR.setEnabled(true);
        btnEXCLUIR.setEnabled(true);

        btnNOVO.setEnabled(false);
    }

    public void mostrar(ClienteModel cliente) {

        edtCON_CODIGO.setText(String.valueOf(cliente.getCLI_CODIGO()));
        cbxCLI_FISICA.setSelectedItem(cliente.getCLI_FISICA());
        edtCLI_NOME.setText(cliente.getCLI_NOME());
        edtCLI_CNPJ.setText(cliente.getCLI_CNPJ());
        edtCLI_INSCEST.setText(cliente.getCLI_INSCEST());
        edtCLI_LIMITECRED.setText(String.valueOf(cliente.getCLI_LIMITECRED()));

        edtEND_CODIGO.setText(String.valueOf(cliente.getEND_MODEL().getEND_CODIGO()));
        cbxEND_LOGRADOURO.setSelectedItem(cliente.getEND_MODEL().getEND_LOGRADOURO());
        edtEND_ENDERECO.setText(String.valueOf(cliente.getEND_MODEL().getEND_ENDERECO()));
        edtEND_NUMERO.setText(String.valueOf(cliente.getEND_MODEL().getEND_NUMERO()));
        edtEND_BAIRRO.setText(String.valueOf(cliente.getEND_MODEL().getEND_BAIRRO()));
        edtEND_CIDADE.setText(String.valueOf(cliente.getEND_MODEL().getEND_CIDADE()));
        edtEND_CEP.setText(String.valueOf(cliente.getEND_MODEL().getEND_CEP()));
        cbxEND_UF.setSelectedItem(cliente.getEND_MODEL().getEND_UF());

        edtCON_CODIGO.setText(String.valueOf(cliente.getCON_MODEL().getCON_CODIGO()));
        edtCON_CELULAR.setText(cliente.getCON_MODEL().getCON_CELULAR());
        edtCON_TELEFONE.setText(cliente.getCON_MODEL().getCON_TELEFONE());
        edtCON_EMAIL.setText(cliente.getCON_MODEL().getCON_EMAIL());

        cbxCLI_COBR_LOGRADOURO.setSelectedItem(cliente.getCLI_COBR_LOGRADOURO());
        edtCLI_COBR_ENDERECO.setText(String.valueOf(cliente.getCLI_COBR_ENDERECO()));
        edtCLI_COBR_NUMERO.setText(String.valueOf(cliente.getCLI_COBR_NUMERO()));
        edtCLI_COBR_BAIRRO.setText(String.valueOf(cliente.getCLI_COBR_BAIRRO()));
        edtCLI_COBR_CIDADE.setText(String.valueOf(cliente.getCLI_COBR_CIDADE()));
        edtCLI_COBR_CEP.setText(String.valueOf(cliente.getCLI_COBR_CEP()));
        cbxCLI_COBR_UF.setSelectedItem(cliente.getCLI_COBR_UF());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnLIMPAR;
    private javax.swing.JButton btnNOVO;
    private javax.swing.JButton btnPESQUISA;
    private javax.swing.JButton btnSALVAR;
    private javax.swing.JComboBox<String> cbxCLI_COBR_LOGRADOURO;
    private javax.swing.JComboBox<String> cbxCLI_COBR_UF;
    private javax.swing.JComboBox<String> cbxCLI_FISICA;
    private javax.swing.JComboBox<String> cbxEND_LOGRADOURO;
    private javax.swing.JComboBox<String> cbxEND_UF;
    private javax.swing.JFormattedTextField edtCLI_CNPJ;
    private javax.swing.JTextField edtCLI_COBR_BAIRRO;
    private javax.swing.JTextField edtCLI_COBR_CEP;
    private javax.swing.JTextField edtCLI_COBR_CIDADE;
    private javax.swing.JTextField edtCLI_COBR_ENDERECO;
    private javax.swing.JTextField edtCLI_COBR_NUMERO;
    private javax.swing.JTextField edtCLI_CODIGO;
    private javax.swing.JFormattedTextField edtCLI_INSCEST;
    private javax.swing.JTextField edtCLI_LIMITECRED;
    private javax.swing.JTextField edtCLI_NOME;
    private javax.swing.JTextField edtCON_CELULAR;
    private javax.swing.JTextField edtCON_CODIGO;
    private javax.swing.JTextField edtCON_EMAIL;
    private javax.swing.JTextField edtCON_TELEFONE;
    private javax.swing.JTextField edtEND_BAIRRO;
    private javax.swing.JTextField edtEND_CEP;
    private javax.swing.JTextField edtEND_CIDADE;
    private javax.swing.JTextField edtEND_CODIGO;
    private javax.swing.JTextField edtEND_ENDERECO;
    private javax.swing.JTextField edtEND_NUMERO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblCLI_CNPJ;
    private javax.swing.JLabel lblCLI_COBR_BAIRRO;
    private javax.swing.JLabel lblCLI_COBR_CEP;
    private javax.swing.JLabel lblCLI_COBR_CIDADE;
    private javax.swing.JLabel lblCLI_COBR_ENDERECO;
    private javax.swing.JLabel lblCLI_COBR_LOGRADOURO;
    private javax.swing.JLabel lblCLI_COBR_NUMERO;
    private javax.swing.JLabel lblCLI_COBR_UF;
    private javax.swing.JLabel lblCLI_CODIGO;
    private javax.swing.JLabel lblCLI_FISICA;
    private javax.swing.JLabel lblCLI_INSCEST;
    private javax.swing.JLabel lblCLI_LIMITECRED;
    private javax.swing.JLabel lblCLI_NOME;
    private javax.swing.JLabel lblCON_CELULAR;
    private javax.swing.JLabel lblCON_EMAIL;
    private javax.swing.JLabel lblCON_TELEFONE;
    private javax.swing.JLabel lblEND_BAIRRO;
    private javax.swing.JLabel lblEND_CEP;
    private javax.swing.JLabel lblEND_CIDADE;
    private javax.swing.JLabel lblEND_ENDERECO;
    private javax.swing.JLabel lblEND_LOGRADOURO;
    private javax.swing.JLabel lblEND_NUMERO;
    private javax.swing.JLabel lblEND_UF;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JPanel pnlCONTATO;
    private javax.swing.JPanel pnlDADOS;
    private javax.swing.JPanel pnlENDERECO;
    private javax.swing.JPanel pnlENDERECO_COBRANCA;
    // End of variables declaration//GEN-END:variables
}
