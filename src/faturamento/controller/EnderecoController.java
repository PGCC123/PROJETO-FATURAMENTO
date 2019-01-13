package faturamento.controller;

import faturamento.dao.EnderecoDAO;
import faturamento.model.EnderecoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoController {

    private List<EnderecoModel> listaendereco;

    public ArrayList<EnderecoModel> consultar(String filtro) throws SQLException {
        listaendereco = new EnderecoDAO().consultar(filtro);
        return (ArrayList<EnderecoModel>) listaendereco;
    }

    public void excluir(EnderecoModel endereco) throws SQLException {
        EnderecoDAO enderecodao = new EnderecoDAO();
        enderecodao.excluir(endereco);
    }

    public void adicionar(EnderecoModel endereco) throws SQLException {
        EnderecoDAO enderecodao = new EnderecoDAO();
        enderecodao.adicionar(endereco);
    }

    public void alterar(EnderecoModel endereco) throws SQLException {
        EnderecoDAO enderecodao = new EnderecoDAO();
        enderecodao.alterar(endereco);;

    }

    public void gravar(String operacao, EnderecoModel endereco) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(endereco);
        } else if (operacao.equals("alterar")) {
            alterar(endereco);
        }
    }
}
