package faturamento.model;

public class ClienteModel {
    
    private int CLI_CODIGO;
    private String CLI_NOME;
    private String CLI_CNPJ;
    private String CLI_INSCEST;
    private double CLI_LIMITECRED;
    private String CLI_FISICA;
    
    private String CLI_COBR_LOGRADOURO;
    private String CLI_COBR_ENDERECO;
    private String CLI_COBR_NUMERRO;
    private String CLI_COBR_BAIRRO;
    private String CLI_COBR_CIDADE;
    private String CLI_COBR_CEP;
    private String CLI_COBR_UF;
    
    private EnderecoModel END_MODEL;
    private ContatoModel CON_MODEL;

    public ClienteModel() {
    
    }

    public ClienteModel(int CLI_CODIGO, String CLI_NOME, String CLI_CNPJ, String CLI_INSCEST, double CLI_LIMITECRED, String CLI_FISICA, String CLI_COBR_LOGRADOURO, String CLI_COBR_ENDERECO, String CLI_COBR_NUMERRO, String CLI_COBR_BAIRRO, String CLI_COBR_CIDADE, String CLI_COBR_CEP, String CLI_COBR_UF, EnderecoModel END_MODEL, ContatoModel CON_MODEL) {
        this.CLI_CODIGO = CLI_CODIGO;
        this.CLI_NOME = CLI_NOME;
        this.CLI_CNPJ = CLI_CNPJ;
        this.CLI_INSCEST = CLI_INSCEST;
        this.CLI_LIMITECRED = CLI_LIMITECRED;
        this.CLI_FISICA = CLI_FISICA;
        this.CLI_COBR_LOGRADOURO = CLI_COBR_LOGRADOURO;
        this.CLI_COBR_ENDERECO = CLI_COBR_ENDERECO;
        this.CLI_COBR_NUMERRO = CLI_COBR_NUMERRO;
        this.CLI_COBR_BAIRRO = CLI_COBR_BAIRRO;
        this.CLI_COBR_CIDADE = CLI_COBR_CIDADE;
        this.CLI_COBR_CEP = CLI_COBR_CEP;
        this.CLI_COBR_UF = CLI_COBR_UF;
        this.END_MODEL = END_MODEL;
        this.CON_MODEL = CON_MODEL;
    }

    public int getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    public void setCLI_CODIGO(int CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }

    public String getCLI_NOME() {
        return CLI_NOME;
    }

    public void setCLI_NOME(String CLI_NOME) {
        this.CLI_NOME = CLI_NOME;
    }

    public String getCLI_CNPJ() {
        return CLI_CNPJ;
    }

    public void setCLI_CNPJ(String CLI_CNPJ) {
        this.CLI_CNPJ = CLI_CNPJ;
    }

    public String getCLI_INSCEST() {
        return CLI_INSCEST;
    }

    public void setCLI_INSCEST(String CLI_INSCEST) {
        this.CLI_INSCEST = CLI_INSCEST;
    }

    public double getCLI_LIMITECRED() {
        return CLI_LIMITECRED;
    }

    public void setCLI_LIMITECRED(double CLI_LIMITECRED) {
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }

    public String getCLI_FISICA() {
        return CLI_FISICA;
    }

    public void setCLI_FISICA(String CLI_FISICA) {
        this.CLI_FISICA = CLI_FISICA;
    }

    public String getCLI_COBR_LOGRADOURO() {
        return CLI_COBR_LOGRADOURO;
    }

    public void setCLI_COBR_LOGRADOURO(String CLI_COBR_LOGRADOURO) {
        this.CLI_COBR_LOGRADOURO = CLI_COBR_LOGRADOURO;
    }

    public String getCLI_COBR_ENDERECO() {
        return CLI_COBR_ENDERECO;
    }

    public void setCLI_COBR_ENDERECO(String CLI_COBR_ENDERECO) {
        this.CLI_COBR_ENDERECO = CLI_COBR_ENDERECO;
    }

    public String getCLI_COBR_NUMERRO() {
        return CLI_COBR_NUMERRO;
    }

    public void setCLI_COBR_NUMERRO(String CLI_COBR_NUMERRO) {
        this.CLI_COBR_NUMERRO = CLI_COBR_NUMERRO;
    }

    public String getCLI_COBR_BAIRRO() {
        return CLI_COBR_BAIRRO;
    }

    public void setCLI_COBR_BAIRRO(String CLI_COBR_BAIRRO) {
        this.CLI_COBR_BAIRRO = CLI_COBR_BAIRRO;
    }

    public String getCLI_COBR_CIDADE() {
        return CLI_COBR_CIDADE;
    }

    public void setCLI_COBR_CIDADE(String CLI_COBR_CIDADE) {
        this.CLI_COBR_CIDADE = CLI_COBR_CIDADE;
    }

    public String getCLI_COBR_CEP() {
        return CLI_COBR_CEP;
    }

    public void setCLI_COBR_CEP(String CLI_COBR_CEP) {
        this.CLI_COBR_CEP = CLI_COBR_CEP;
    }

    public String getCLI_COBR_UF() {
        return CLI_COBR_UF;
    }

    public void setCLI_COBR_UF(String CLI_COBR_UF) {
        this.CLI_COBR_UF = CLI_COBR_UF;
    }

    public EnderecoModel getEND_MODEL() {
        return END_MODEL;
    }

    public void setEND_MODEL(EnderecoModel END_MODEL) {
        this.END_MODEL = END_MODEL;
    }

    public ContatoModel getCON_MODEL() {
        return CON_MODEL;
    }

    public void setCON_MODEL(ContatoModel CON_MODEL) {
        this.CON_MODEL = CON_MODEL;
    }
}
