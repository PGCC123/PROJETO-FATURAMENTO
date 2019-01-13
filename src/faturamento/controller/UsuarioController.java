package faturamento.controller;


import faturamento.dao.UsuarioDAO;
import faturamento.model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioController {

    private List<UsuarioModel> listausuarios;

    public ArrayList<UsuarioModel> consultar(String filtro) throws SQLException {
        listausuarios = new UsuarioDAO().consultar(filtro);
        return (ArrayList<UsuarioModel>) listausuarios;
    }

    public void excluir(UsuarioModel usuario) throws SQLException {
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuariodao.excluir(usuario);
    }

    public void adicionar(UsuarioModel usuario) throws SQLException {
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuariodao.adicionar(usuario);
    }

    public void alterar(UsuarioModel usuario) throws SQLException {
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuariodao.alterar(usuario);
    }

    public void gravar(String operacao, UsuarioModel usuario) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(usuario);
        } else if (operacao.equals("alterar")) {
            alterar(usuario);
        }
    }
}
