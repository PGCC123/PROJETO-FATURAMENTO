package faturamento.controller;

import faturamento.dao.ClienteDAO;
import faturamento.dao.FuncionarioDAO;
import faturamento.model.ClienteModel;
import faturamento.model.FuncionarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private List<ClienteModel> listacliente;

    public ArrayList<ClienteModel> consultar(String filtro) throws SQLException {
        listacliente = new ClienteDAO().consultar(filtro);
        return (ArrayList<ClienteModel>) listacliente;
    }
    
    public void excluir(ClienteModel cliente) throws SQLException {
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.excluir(cliente);
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.adicionar(cliente);
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.alterar(cliente);
    }

    public void gravar(String operacao, ClienteModel cliente) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
}
