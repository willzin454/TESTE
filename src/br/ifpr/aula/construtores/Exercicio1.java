package br.ifpr.aula.construtores;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        int a = teclado.nextInt();

        System.out.println("Informe a porcentagem de aumento: ");
        float b = teclado.nextInt();

        double novoSalario = novoSalario(a, b);
        imprimir(novoSalario);
    }
    static double novoSalario(int a, double b){
        double salario = ((a/100)*b); 
        double aumento = salario + a;
        return aumento;
    }
    static void imprimir(double x){
        System.out.println("O novo salario e: "+x);
    }
}