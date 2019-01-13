package faturamento.principal;

import faturamento.conexao.Conexao;
import faturamento.view.FuncionarioView;
import faturamento.view.LoginView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal {

    Conexao objconexao;
    FuncionarioView funcionarioview;

    public Principal() {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        objconexao = new Conexao();
        //funcionarioview = new FuncionarioView();
        //funcionarioview.setVisible(true);
        //CadastroView cadastro = new CadastroView();
        //cadastro.setVisible(true);
        //PesquisaFuncionarioView pesquisa = new PesquisaFuncionarioView();
        //pesquisa.setVisible(true);

        LoginView login = new LoginView();
        login.setVisible(true);

    }

    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
