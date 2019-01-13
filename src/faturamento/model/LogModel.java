package faturamento.model;

public class LogModel {
    
    private int LOG_CODIGO;
    private String LOG_USUARIO;
    private String LOG_DATA;
    private String LOG_HORA;

    public LogModel() {
    
    }

    public LogModel(int LOG_CODIGO, String LOG_USUARIO, String LOG_DATA, String LOG_HORA) {
        this.LOG_CODIGO = LOG_CODIGO;
        this.LOG_USUARIO = LOG_USUARIO;
        this.LOG_DATA = LOG_DATA;
        this.LOG_HORA = LOG_HORA;
    }

    public int getLOG_CODIGO() {
        return LOG_CODIGO;
    }

    public void setLOG_CODIGO(int LOG_CODIGO) {
        this.LOG_CODIGO = LOG_CODIGO;
    }

    public String getLOG_USUARIO() {
        return LOG_USUARIO;
    }

    public void setLOG_USUARIO(String LOG_USUARIO) {
        this.LOG_USUARIO = LOG_USUARIO;
    }

    public String getLOG_DATA() {
        return LOG_DATA;
    }

    public void setLOG_DATA(String LOG_DATA) {
        this.LOG_DATA = LOG_DATA;
    }

    public String getLOG_HORA() {
        return LOG_HORA;
    }

    public void setLOG_HORA(String LOG_HORA) {
        this.LOG_HORA = LOG_HORA;
    }
}
