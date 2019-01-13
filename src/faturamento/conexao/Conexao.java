package faturamento.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String BANCO = "jdbc:mysql://localhost:3306/FATURAMENTO";
    private final static String USUARIO = "root";
    private final static String SENHA = "3080";
       
    private static Connection conexao;

    public Conexao() {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na classe de conexão do banco. \n" + ex.getMessage());
            conexao = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco.\n" + ex.getMessage());
            conexao = null;
        }
    }

    public static Connection getConexao() {
        return conexao;
    }
    
    public  static void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Falha ao fechar conexao.\n" + ex.getMessage());
        }
    }
}
