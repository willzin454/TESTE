package br.ifpr.aula.pacote;

public class JogadorVolei {
    private String corCabelo;    //(esconde do cntl+space)
    String corPele;
    public String nome;
    protected String sobrenome;

    private String getcorCabelo(){
        return this.corCabelo;
    }
    public void setcorCabelo(String corCabelo){
        this.corCabelo = corCabelo;
    }
}