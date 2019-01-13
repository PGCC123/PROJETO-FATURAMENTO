package faturamento.dao;

import faturamento.conexao.Conexao;
import faturamento.model.EnderecoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnderecoDAO {

    private Connection conexao = null;

    public EnderecoDAO() {
        this.conexao = Conexao.getConexao();

    }

    public int ultimoEndereco() throws SQLException {

        int maxid = 1;

        String SQL = ("SELECT IFNULL(MAX(END_CODIGO),1) FROM ENDERECO");

        PreparedStatement stm = conexao.prepareStatement(SQL);
        ResultSet rs = stm.executeQuery();
        rs.next();
        maxid = rs.getInt(1);
        rs.close();
        stm.close();

        return maxid;
    }
    
    public void adicionar(EnderecoModel endereco) throws SQLException {
        
        String SQL = "INSERT INTO ENDERECO (END_LOGRADOURO, END_ENDERECO, END_NUMERO, END_BAIRRO, END_CIDADE, END_CEP, END_UF)"
                   + "VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, endereco.getEND_LOGRADOURO());
        stmt.setString(2, endereco.getEND_ENDERECO());
        stmt.setString(3, endereco.getEND_NUMERO());
        stmt.setString(4, endereco.getEND_BAIRRO());
        stmt.setString(5, endereco.getEND_CIDADE());
        stmt.setString(6, endereco.getEND_CEP());
        stmt.setString(7, endereco.getEND_UF());
        stmt.execute();
        stmt.close();
    }
    
     public void alterar(EnderecoModel endereco) throws SQLException {
         
        String SQL = "UPDATE ENDERECO "
                   + "SET END_LOGRADOURO = ?, END_ENDERECO = ?, END_NUMERO = ?, END_BAIRRO = ?, END_CIDADE = ?, END_CEP = ?, END_UF = ? WHERE END_CODIGO = ?";
        
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, endereco.getEND_LOGRADOURO());
        stmt.setString(2, endereco.getEND_ENDERECO());
        stmt.setString(3, endereco.getEND_NUMERO());
        stmt.setString(4, endereco.getEND_BAIRRO());
        stmt.setString(5, endereco.getEND_CIDADE());
        stmt.setString(6, endereco.getEND_CEP());
        stmt.setString(7, endereco.getEND_UF());
        stmt.setInt(8, endereco.getEND_CODIGO());
        stmt.execute();
        stmt.close();
    }

    public void excluir(EnderecoModel endereco) throws SQLException {
        
        String SQL = "DELETE FROM ENDERECO WHERE END_CODIGO = ?";
        
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setInt(1, endereco.getEND_CODIGO());
        stmt.execute();
        stmt.close();
    }
    
    public ArrayList<EnderecoModel> consultar(String condicao) throws SQLException {
        
        ArrayList<EnderecoModel> lista = null;
        PreparedStatement stmt;
        ResultSet rs;
        String SQL = "SELECT * FROM ENDERECO";
              
        if (!condicao.equals("")) {
            SQL += " WHERE " + condicao;
        }

        stmt = conexao.prepareStatement(SQL);
        rs = stmt.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {

            EnderecoModel enderecomodel = new EnderecoModel();
            
            enderecomodel.setEND_CODIGO(rs.getInt("END_CODIGO"));
            enderecomodel.setEND_LOGRADOURO(rs.getString("END_LOGRADOURO"));
            enderecomodel.setEND_ENDERECO(rs.getString("END_ENDERECO"));
            enderecomodel.setEND_NUMERO(rs.getString("END_NUMERO"));
            enderecomodel.setEND_BAIRRO(rs.getString("END_BAIRRO"));
            enderecomodel.setEND_CIDADE(rs.getString("END_CIDADE"));
            enderecomodel.setEND_CEP(rs.getString("END_CEP"));
            enderecomodel.setEND_UF(rs.getString(rs.getString("END_UF")));
            
            lista.add(enderecomodel);

        }

        rs.close();
        stmt.close();
        return lista;
    }
 
}
