package faturamento.view;

import faturamento.model.ClienteModel;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private final NumberFormat BRL = NumberFormat.getCurrencyInstance();
    private final ArrayList<ClienteModel> linhascliente;
    String[] colunas;

    public ClienteTableModel(ArrayList<ClienteModel> arraycliente, String[] colunas) {
        this.colunas = colunas;
        linhascliente = arraycliente;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhascliente.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        ClienteModel cliente = (ClienteModel) linhascliente.get(row);
        switch (col) {
            case 0:
                return cliente.getCLI_CODIGO();
            case 1:
                return cliente.getCLI_NOME();
            case 2:
                return cliente.getCLI_CNPJ();
            case 3:
                return BRL.format(cliente.getCLI_LIMITECRED());
            case 4:
                return cliente.getCLI_FISICA();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de FuncionarioModel
    public void addLista(ArrayList<ClienteModel> cliente) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os funcionarios
        linhascliente.addAll(cliente);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
