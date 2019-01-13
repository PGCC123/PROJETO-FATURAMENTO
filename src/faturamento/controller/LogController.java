package faturamento.controller;

import faturamento.dao.LogDao;
import faturamento.model.LogModel;
import java.sql.SQLException;


public class LogController {

    public void adicionar(LogModel logmodel) throws SQLException {
        LogDao dao = new LogDao();
        dao.adicionar(logmodel);
    }

    public void gravar(String operacao, LogModel logmodel) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(logmodel);
        }
    }
}
