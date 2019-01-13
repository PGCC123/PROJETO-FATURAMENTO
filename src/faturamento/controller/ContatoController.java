package faturamento.controller;

import faturamento.dao.ContatoDAO;
import faturamento.model.ContatoModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoController {

    private List<ContatoModel> listacontato;

    public ArrayList<ContatoModel> consultar(String filtro) throws SQLException {
        listacontato = new ContatoDAO().consultar(filtro);
        return (ArrayList<ContatoModel>) listacontato;
    }

    public void excluir(ContatoModel contato) throws SQLException {
        ContatoDAO contatodao = new ContatoDAO();
        contatodao.excluir(contato);
    }

    public void adicionar(ContatoModel contato) throws SQLException {
        ContatoDAO contatodao = new ContatoDAO();
        contatodao.adicionar(contato);
    }

    public void alterar(ContatoModel contato) throws SQLException {
        ContatoDAO contatodao = new ContatoDAO();
        contatodao.alterar(contato);;

    }

    public void gravar(String operacao, ContatoModel contato) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(contato);
        } else if (operacao.equals("alterar")) {
            alterar(contato);
        }
    }
}
