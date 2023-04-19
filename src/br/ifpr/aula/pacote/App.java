package br.ifpr.aula.pacote;

public class App {
    String x = "Bem 10";
    public static void main(String[] args) {
        App teste = new App();
        System.out.println(teste.x);
        teste.imprimir();
        
    }
    public void imprimir(){
        System.out.println(this.x);
    }
}