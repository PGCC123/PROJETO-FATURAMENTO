package faturamento.model;

public class ContatoModel {
    
    private int CON_CODIGO;
    private String CON_TELEFONE;
    private String CON_CELULAR;
    private String CON_EMAIL;

    public ContatoModel() {
    
    }
    
    public ContatoModel(int CON_CODIGO, String CON_TELEFONE, String CON_CELULAR, String CON_EMAIL) {
        this.CON_CODIGO = CON_CODIGO;
        this.CON_TELEFONE = CON_TELEFONE;
        this.CON_CELULAR = CON_CELULAR;
        this.CON_EMAIL = CON_EMAIL;
    }

    public int getCON_CODIGO() {
        return CON_CODIGO;
    }

    public void setCON_CODIGO(int CON_CODIGO) {
        this.CON_CODIGO = CON_CODIGO;
    }

    public String getCON_TELEFONE() {
        return CON_TELEFONE;
    }

    public void setCON_TELEFONE(String CON_TELEFONE) {
        this.CON_TELEFONE = CON_TELEFONE;
    }

    public String getCON_CELULAR() {
        return CON_CELULAR;
    }

    public void setCON_CELULAR(String CON_CELULAR) {
        this.CON_CELULAR = CON_CELULAR;
    }

    public String getCON_EMAIL() {
        return CON_EMAIL;
    }

    public void setCON_EMAIL(String CON_EMAIL) {
        this.CON_EMAIL = CON_EMAIL;
    }   
}
