package faturamento.model;

public class FuncionarioModel {
    
    private int FUN_CODIGO;
    private String FUN_NOME;
    private String FUN_CPF;
    private String FUN_RG;
    private String FUN_CTPS;
    private double FUN_SALARIO;
    private String FUN_DTADMISSAO;
    private String FUN_DTDEMISSAO;
    
    private EnderecoModel END_MODEL;
    private ContatoModel CON_MODEL;

    public FuncionarioModel() {
    
    }
    
    public FuncionarioModel(int FUN_CODIGO, String FUN_NOME, String FUN_CPF, String FUN_RG, String FUN_CTPS, double FUN_SALARIO, String FUN_DTADMISSAO, String FUN_DTDEMISSAO, EnderecoModel END_MODEL, ContatoModel CON_MODEL) {
        this.FUN_CODIGO = FUN_CODIGO;
        this.FUN_NOME = FUN_NOME;
        this.FUN_CPF = FUN_CPF;
        this.FUN_RG = FUN_RG;
        this.FUN_CTPS = FUN_CTPS;
        this.FUN_SALARIO = FUN_SALARIO;
        this.FUN_DTADMISSAO = FUN_DTADMISSAO;
        this.FUN_DTDEMISSAO = FUN_DTDEMISSAO;
        this.END_MODEL = END_MODEL;
        this.CON_MODEL = CON_MODEL;
    }

    public int getFUN_CODIGO() {
        return FUN_CODIGO;
    }

    public void setFUN_CODIGO(int FUN_CODIGO) {
        this.FUN_CODIGO = FUN_CODIGO;
    }

    public String getFUN_NOME() {
        return FUN_NOME;
    }

    public void setFUN_NOME(String FUN_NOME) {
        this.FUN_NOME = FUN_NOME;
    }

    public String getFUN_CPF() {
        return FUN_CPF;
    }

    public void setFUN_CPF(String FUN_CPF) {
        this.FUN_CPF = FUN_CPF;
    }

    public String getFUN_RG() {
        return FUN_RG;
    }

    public void setFUN_RG(String FUN_RG) {
        this.FUN_RG = FUN_RG;
    }

    public String getFUN_CTPS() {
        return FUN_CTPS;
    }

    public void setFUN_CTPS(String FUN_CTPS) {
        this.FUN_CTPS = FUN_CTPS;
    }

    public double getFUN_SALARIO() {
        return FUN_SALARIO;
    }

    public void setFUN_SALARIO(double FUN_SALARIO) {
        this.FUN_SALARIO = FUN_SALARIO;
    }

    public String getFUN_DTADMISSAO() {
        return FUN_DTADMISSAO;
    }

    public void setFUN_DTADMISSAO(String FUN_DTADMISSAO) {
        this.FUN_DTADMISSAO = FUN_DTADMISSAO;
    }

    public String getFUN_DTDEMISSAO() {
        return FUN_DTDEMISSAO;
    }

    public void setFUN_DTDEMISSAO(String FUN_DTDEMISSAO) {
        this.FUN_DTDEMISSAO = FUN_DTDEMISSAO;
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
