package faturamento.model;

public class EnderecoModel {
    
    private int END_CODIGO;
    private String END_LOGRADOURO;
    private String END_ENDERECO;
    private String END_NUMERO;
    private String END_BAIRRO;
    private String END_CIDADE;
    private String END_CEP;
    private String END_UF;

    public EnderecoModel() {
    
    }
    
    public EnderecoModel(int END_CODIGO, String END_LOGRADOURO, String END_ENDERECO, String END_NUMERO, String END_BAIRRO, String END_CIDADE, String END_CEP, String END_UF) {
        this.END_CODIGO = END_CODIGO;
        this.END_LOGRADOURO = END_LOGRADOURO;
        this.END_ENDERECO = END_ENDERECO;
        this.END_NUMERO = END_NUMERO;
        this.END_BAIRRO = END_BAIRRO;
        this.END_CIDADE = END_CIDADE;
        this.END_CEP = END_CEP;
        this.END_UF = END_UF;
    }

    public int getEND_CODIGO() {
        return END_CODIGO;
    }

    public void setEND_CODIGO(int END_CODIGO) {
        this.END_CODIGO = END_CODIGO;
    }

    public String getEND_LOGRADOURO() {
        return END_LOGRADOURO;
    }

    public void setEND_LOGRADOURO(String END_LOGRADOURO) {
        this.END_LOGRADOURO = END_LOGRADOURO;
    }

    public String getEND_ENDERECO() {
        return END_ENDERECO;
    }

    public void setEND_ENDERECO(String END_ENDERECO) {
        this.END_ENDERECO = END_ENDERECO;
    }

    public String getEND_NUMERO() {
        return END_NUMERO;
    }

    public void setEND_NUMERO(String END_NUMERO) {
        this.END_NUMERO = END_NUMERO;
    }

    public String getEND_BAIRRO() {
        return END_BAIRRO;
    }

    public void setEND_BAIRRO(String END_BAIRRO) {
        this.END_BAIRRO = END_BAIRRO;
    }

    public String getEND_CIDADE() {
        return END_CIDADE;
    }

    public void setEND_CIDADE(String END_CIDADE) {
        this.END_CIDADE = END_CIDADE;
    }

    public String getEND_CEP() {
        return END_CEP;
    }

    public void setEND_CEP(String END_CEP) {
        this.END_CEP = END_CEP;
    }

    public String getEND_UF() {
        return END_UF;
    }

    public void setEND_UF(String END_UF) {
        this.END_UF = END_UF;
    } 
}
