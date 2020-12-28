/*
Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as
notas têm pesos respectivos de 1, 2 e 3)
 */
package lista02;

// ALEXANDRE MENEZES GOMES ADS 1° PERIODO.

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        
        double n1,n2,n3;
        
        System.out.println("BEM VINDO AO CALCULADOR DE MÉDIA PONDERADA ! ");

        System.out.println("Informe a nota 1:");
        n1 = leitor.nextDouble();
        System.out.println("Informe a nota 2:");
        n2 = leitor.nextDouble();
        System.out.println("Informe a nota 3:");
        n3 = leitor.nextDouble();
        System.out.println("A média ponderada do aluno será:");
        System.out.println ((n1*1 + n2*2 +n3*3 )/6);

    }
    
    
}
