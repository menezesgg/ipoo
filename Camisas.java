/*
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida
respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de
camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor
arrecadado.*/

package lista02;

//ALEXANDRE MENEZES GOMES ADS 1° PERIODO.

import java.util.Scanner;


public class Camisas {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);

        int p,m,g;

        System.out.println("Bem vindo ao soma Camisas plus ! ");

        System.out.println("Informe o valor de camisas pequenas:");
        p = leitor.nextInt();
        System.out.println("Informe o valor de camisas médias:");
        m = leitor.nextInt();
        System.out.println("informe o valor de camisas grandes:");
        g = leitor.nextInt();

        System.out.println("O valor arrecadado sera de ");
        System.out.println(p * 10 + m * 12 + g * 15 + " R$.");
    }
}
