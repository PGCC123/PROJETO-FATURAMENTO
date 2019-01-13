package faturamento.dao;

import faturamento.conexao.Conexao;
import faturamento.model.ContatoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDAO {

    private Connection conexao = null;

    public ContatoDAO() {
        this.conexao = Conexao.getConexao();
    }

    public int ultimoContato() throws SQLException {

        int maxid = 1;

        String SQL = ("SELECT IFNULL(MAX(CON_CODIGO),1) FROM CONTATO");

        PreparedStatement stm = conexao.prepareStatement(SQL);
        ResultSet rs = stm.executeQuery();
        rs.next();
        maxid = rs.getInt(1);
        rs.close();
        stm.close();

        return maxid;
    }

    public void adicionar(ContatoModel contato) throws SQLException {

        String SQL = "INSERT INTO CONTATO (CON_TELEFONE, CON_CELULAR, CON_EMAIL)"
                + "VALUES (?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, contato.getCON_TELEFONE());
        stmt.setString(2, contato.getCON_CELULAR());
        stmt.setString(3, contato.getCON_EMAIL());
        stmt.execute();
        stmt.close();
    }

    public void alterar(ContatoModel contato) throws SQLException {

        String SQL = "UPDATE CONTATO "
                + "SET CON_TELEFONE = ?, CON_CELULAR = ?, CON_EMAIL = ? WHERE CON_CODIGO = ?";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, contato.getCON_TELEFONE());
        stmt.setString(2, contato.getCON_CELULAR());
        stmt.setString(3, contato.getCON_EMAIL());
        stmt.setInt(4, contato.getCON_CODIGO());
        stmt.execute();
        stmt.close();
    }

    public void excluir(ContatoModel contato) throws SQLException {

        String SQL = "DELETE FROM ENDERECO WHERE END_CODIGO = ?";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setInt(1, contato.getCON_CODIGO());
        stmt.execute();
        stmt.close();

    }

    public ArrayList<ContatoModel> consultar(String condicao) throws SQLException {

        ArrayList<ContatoModel> lista = null;
        PreparedStatement stmt;
        ResultSet rs;
        String SQL = "SELECT * FROM CONTATO";

        if (!condicao.equals("")) {
            SQL += " WHERE " + condicao;
        }

        stmt = conexao.prepareStatement(SQL);
        rs = stmt.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {

            ContatoModel contatomodel = new ContatoModel();

            contatomodel.setCON_CODIGO(rs.getInt("CON_CODIGO"));
            contatomodel.setCON_TELEFONE(rs.getString("CON_TELEFONE"));
            contatomodel.setCON_CELULAR(rs.getString("CON_CELULAR"));
            contatomodel.setCON_EMAIL(rs.getString("CON_EMAIL"));

            lista.add(contatomodel);

        }

        rs.close();
        stmt.close();
        return lista;
    }
}
