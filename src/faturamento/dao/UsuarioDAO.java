package faturamento.dao;

import faturamento.conexao.Conexao;
import faturamento.model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    private Connection conexao = null;

    public UsuarioDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(UsuarioModel usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (USU_NOME, USU_SOBRENOME, USU_LOGIN, USU_SENHA, USU_CADASTRO, USU_ATIVO)"
                + " VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, usuario.getUSU_NOME());
        stmt.setString(2, usuario.getUSU_SOBRENOME());
        stmt.setString(3, usuario.getUSU_LOGIN());
        stmt.setString(4, usuario.getUSU_SENHA());
        stmt.setString(5, usuario.getUSU_CADASTRO());
        stmt.setString(6, usuario.getUSU_ATIVO());
        stmt.execute();
        stmt.close();
    }

    public void alterar(UsuarioModel usuario) throws SQLException {
        String sql = "UPDATE USUARIO SET USU_NOME = ?, USU_LOGIN = ?, "
                + "USU_SENHA = ?, USU_CADASTRO = ?, USU_ATIVO = ? WHERE USU_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, usuario.getUSU_NOME());
        stm.setString(2, usuario.getUSU_LOGIN());
        stm.setString(3, usuario.getUSU_SENHA());
        stm.setString(4, usuario.getUSU_CADASTRO());
        stm.setString(5, usuario.getUSU_ATIVO());
        stm.setInt(6, usuario.getUSU_CODIGO());
        stm.execute();
        stm.close();
    }

    public void excluir(UsuarioModel usuario) throws SQLException {
        String sql = "DELETE FROM USUARIO WHERE USU_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, usuario.getUSU_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<UsuarioModel> consultar(String condicao) throws SQLException {
        ArrayList<UsuarioModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM USUARIO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            UsuarioModel objusu = new UsuarioModel();
            objusu.setUSU_CODIGO(rs.getInt("USU_CODIGO"));
            objusu.setUSU_NOME(rs.getString("USU_NOME"));
            objusu.setUSU_LOGIN(rs.getString("USU_LOGIN"));
            objusu.setUSU_SENHA(rs.getString("USU_SENHA"));
            objusu.setUSU_CADASTRO(rs.getString("USU_CADASTRO"));
            objusu.setUSU_ATIVO(rs.getString("USU_ATIVO"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
