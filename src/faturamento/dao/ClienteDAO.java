package faturamento.dao;

import faturamento.conexao.Conexao;
import faturamento.model.ClienteModel;
import faturamento.model.ContatoModel;
import faturamento.model.EnderecoModel;
import faturamento.model.FuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private Connection conexao = null;

    public ClienteDAO() {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {

        EnderecoDAO enderecodao = new EnderecoDAO();
        enderecodao.adicionar(cliente.getEND_MODEL());

        ContatoDAO contatodao = new ContatoDAO();
        contatodao.adicionar(cliente.getCON_MODEL());

        int END_CODIGO = enderecodao.ultimoEndereco();

        int CON_CODIGO = contatodao.ultimoContato();

        String SQL = "INSERT INTO CLIENTE (END_CODIGO, CON_CODIGO, CLI_NOME, CLI_CNPJ, CLI_INSCEST, CLI_LIMITECRED, CLI_COBR_LOGRADOURO, CLI_COBR_ENDERECO, CLI_COBR_NUMERO, CLI_COBR_BAIRRO, CLI_COBR_CIDADE, CLI_COBR_CEP, CLI_COBR_UF)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setInt(1, END_CODIGO);
        stmt.setInt(2, CON_CODIGO);
        stmt.setString(3, cliente.getCLI_NOME());
        stmt.setString(4, cliente.getCLI_CNPJ());
        stmt.setString(5, cliente.getCLI_INSCEST());
        stmt.setDouble(6, cliente.getCLI_LIMITECRED());
        stmt.setString(7, cliente.getCLI_COBR_LOGRADOURO());
        stmt.setString(8, cliente.getCLI_COBR_ENDERECO());
        stmt.setString(9, cliente.getCLI_COBR_NUMERRO());
        stmt.setString(10, cliente.getCLI_COBR_BAIRRO());
        stmt.setString(11, cliente.getCLI_COBR_CIDADE());
        stmt.setString(12, cliente.getCLI_COBR_CEP());
        stmt.setString(13, cliente.getCLI_COBR_UF());
        stmt.execute();
        stmt.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {

        String SQL = "UPDATE CLIENTE "
                + "SET FUN_NOME = ?, FUN_CPF = ?, FUN_RG = ?, FUN_CTPS = ?, FUN_SALARIO = ?, FUN_DTADMISSAO = ?, FUN_DTDEMISSAO = ? WHERE FUN_CODIGO = ?";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, funcionario.getFUN_NOME());
        stmt.setString(2, funcionario.getFUN_CPF());
        stmt.setString(3, funcionario.getFUN_RG());
        stmt.setString(4, funcionario.getFUN_CTPS());
        stmt.setDouble(5, funcionario.getFUN_SALARIO());
        stmt.setString(6, funcionario.getFUN_DTADMISSAO());
        stmt.setString(7, funcionario.getFUN_DTDEMISSAO());
        stmt.setInt(8, funcionario.getFUN_CODIGO());
        stmt.execute();
        stmt.close();

    }

    public void excluir(ClienteModel cliente) throws SQLException {

        String SQL = "DELETE FROM CLIENTE WHERE CLI_CODIGO = ?";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setInt(1, cliente.getCLI_CODIGO());
        stmt.execute();
        stmt.close();
    }

    public ArrayList<ClienteModel> consultar(String condicao) throws SQLException {

        ArrayList<ClienteModel> lista = null;
        PreparedStatement stmt;
        ResultSet rs;
        String SQL = "SELECT * FROM FUNCIONARIO INNER JOIN ENDERECO ON ENDERECO.END_CODIGO = FUNCIONARIO.END_CODIGO INNER JOIN CONTATO ON CONTATO.CON_CODIGO = FUNCIONARIO.CON_CODIGO";

        if (!condicao.equals("")) {
            SQL += " WHERE " + condicao;
        }

        stmt = conexao.prepareStatement(SQL);
        rs = stmt.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {

            EnderecoModel enderecomodel = new EnderecoModel();
            ContatoModel contatomodel = new ContatoModel();

            FuncionarioModel funcionariomodel = new FuncionarioModel();

            enderecomodel.setEND_CODIGO(rs.getInt("END_CODIGO"));
            enderecomodel.setEND_LOGRADOURO(rs.getString("END_LOGRADOURO"));
            enderecomodel.setEND_ENDERECO(rs.getString("END_ENDERECO"));
            enderecomodel.setEND_NUMERO(rs.getString("END_NUMERO"));
            enderecomodel.setEND_BAIRRO(rs.getString("END_BAIRRO"));
            enderecomodel.setEND_CIDADE(rs.getString("END_CIDADE"));
            enderecomodel.setEND_CEP(rs.getString("END_CEP"));
            enderecomodel.setEND_UF(rs.getString("END_UF"));

            funcionariomodel.setEND_MODEL(enderecomodel);

            contatomodel.setCON_CODIGO(rs.getInt("CON_CODIGO"));
            contatomodel.setCON_TELEFONE(rs.getString("CON_TELEFONE"));
            contatomodel.setCON_CELULAR(rs.getString("CON_CELULAR"));
            contatomodel.setCON_EMAIL(rs.getString("CON_EMAIL"));

            funcionariomodel.setCON_MODEL(contatomodel);

            funcionariomodel.setFUN_CODIGO(rs.getInt("FUN_CODIGO"));
            funcionariomodel.setFUN_NOME(rs.getString("FUN_NOME"));
            funcionariomodel.setFUN_CPF(rs.getString("FUN_CPF"));
            funcionariomodel.setFUN_RG(rs.getString("FUN_RG"));
            funcionariomodel.setFUN_CTPS(rs.getString("FUN_CTPS"));
            funcionariomodel.setFUN_SALARIO(rs.getDouble("FUN_SALARIO"));
            funcionariomodel.setFUN_DTADMISSAO(rs.getString("FUN_DTADMISSAO"));
            funcionariomodel.setFUN_DTDEMISSAO(rs.getString("FUN_DTDEMISSAO"));

            lista.add(funcionariomodel);

        }

        rs.close();
        stmt.close();
        return lista;
    }
}
