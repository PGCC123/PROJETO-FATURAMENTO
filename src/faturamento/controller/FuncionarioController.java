package faturamento.controller;

import faturamento.dao.FuncionarioDAO;
import faturamento.model.FuncionarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private List<FuncionarioModel> listafuncionario;

    public ArrayList<FuncionarioModel> consultar(String filtro) throws SQLException {
        listafuncionario = new FuncionarioDAO().consultar(filtro);
        return (ArrayList<FuncionarioModel>) listafuncionario;
    }
    
    public void excluir(FuncionarioModel funcionario) throws SQLException {
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.excluir(funcionario);
    }

    public void adicionar(FuncionarioModel funcionario) throws SQLException {
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.adicionar(funcionario);
    }

    public void alterar(FuncionarioModel funcionario) throws SQLException {
        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.alterar(funcionario);

    }

    public void gravar(String operacao, FuncionarioModel funcionario) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(funcionario);
        } else if (operacao.equals("alterar")) {
            alterar(funcionario);
        }
    }
}
