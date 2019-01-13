package faturamento.dao;

import faturamento.conexao.Conexao;
import faturamento.model.LogModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LogDao {
    
    private Connection conexao = null;

    public LogDao() {
        this.conexao = Conexao.getConexao();
        
    }
    
    public void adicionar(LogModel logmodel) throws SQLException {
        
        String SQL = "INSERT INTO LOG_USU (LOG_USUARIO, LOG_DATA, LOG_HORA) VALUES (?,?,?)";
        
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, logmodel.getLOG_USUARIO());
        stmt.setString(2, logmodel.getLOG_DATA());
        stmt.setString(3, logmodel.getLOG_HORA());
        
        stmt.execute();
        stmt.close();
    }    
}
