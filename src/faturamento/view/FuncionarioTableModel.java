package faturamento.view;

import faturamento.model.FuncionarioModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel {

    private ArrayList<FuncionarioModel> linhasfuncionario;
    String[] colunas;

    public FuncionarioTableModel(ArrayList<FuncionarioModel> arrayfuncionario, String[] colunas) {
        this.colunas = colunas;
        linhasfuncionario = arrayfuncionario;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhasfuncionario.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        FuncionarioModel funcionario = (FuncionarioModel) linhasfuncionario.get(row);
        switch (col) {
            case 0:
                return funcionario.getFUN_CODIGO();
            case 1:
                return funcionario.getFUN_NOME();
            case 2:
                return funcionario.getFUN_CPF();
            case 3:
                return funcionario.getFUN_CTPS();
            case 4:
                return funcionario.getFUN_DTADMISSAO();     
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de FuncionarioModel
    public void addLista(ArrayList<FuncionarioModel> funcionario) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os funcionarios
        linhasfuncionario.addAll(funcionario);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
