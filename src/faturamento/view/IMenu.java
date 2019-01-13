
/*Conteúdo: Menu
 *Autor: Carpezani
 *Data: 16/03/2018
 */
package faturamento.view;

import faturamento.conexao.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public abstract class IMenu extends JFrame {

    public IMenu() {

        Menu();

    }

    private void Menu() {

        JMenu cadastro = new JMenu("Cadastros");
        JMenuItem usuario = new JMenuItem("Cadastros de Usuários");
        JMenuItem funcionario = new JMenuItem("Cadastros de Funcionários");
        JMenuItem cliente = new JMenuItem("Cadastro de Clientes");
        JMenuItem fornecedor = new JMenuItem("Cadastro de Fornecedores");

        cadastro.add(usuario);
        usuario.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                CadastroView cadastroview;
                cadastroview = new CadastroView();
                usuario.setVisible(true);
            }
        });

        cadastro.add(funcionario);
        funcionario.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                FuncionarioView funcionarioview;
                funcionarioview = new FuncionarioView();
                funcionario.setVisible(true);

            }
        });

        cadastro.add(cliente);
        cliente.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                ClienteView clienteiew;
                clienteiew = new ClienteView();
                cliente.setVisible(true);
            }
        });

        /*   cadastro.add(produto);
        produto.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                ProdutoView produtoview;
                produtoview = new ProdutoView();
                produto.setVisible(true);

            }
        });

        /*  cadastro.add(usuario);
        usuario.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                UsuarioView usuarioview;
                usuarioview = new UsuarioView();
                usuario.setVisible(true);

            }
        }); 
        JMenu movimento = new JMenu("Movimentos");
        JMenuItem venda = new JMenuItem("Vendas");

        movimento.add(venda);
        venda.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Conexao objconexao;
                objconexao = new Conexao();

                dispose();
                VendaView vendaview;
                vendaview = new VendaView();
                vendaview.setVisible(true);
            }
        }); */
        JMenu opcoes = new JMenu("Ajuda");
        JMenuItem sobre = new JMenuItem("Sobre");
        JMenuItem sair = new JMenuItem("log off");

        opcoes.add(sobre);
        sobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(IMenu.this,
                        "Empresa: PLTEC LTDA"
                        + "\nContato: 0800 725 7979"
                        + "\nE-mail: contato@pltec.com.br");
            }
        });

        opcoes.add(sair);
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sair = JOptionPane.showConfirmDialog(null, "Deseja realizar log off?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (sair == JOptionPane.YES_NO_OPTION) {

                    Conexao objconexao;
                    objconexao = new Conexao();

                    dispose();
                    LoginView loginview;
                    loginview = new LoginView();
                    loginview.setVisible(true);

                } else {

                }
            }
        });

        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        barraMenu.add(cadastro);
        //barraMenu.add(movimento);
        barraMenu.add(opcoes);
        setJMenuBar(barraMenu);
    }
}
