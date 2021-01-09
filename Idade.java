/*
Faça um algoritmo que solicite a idade e o nome de quatro pessoas. Calcule e imprima a média aritmética das
idades
 */
package lista02;

// ALEXANDRE MENEZES GOMES ADS 1° PERIODO.

import java.util.Scanner;


public class Idade {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        String nome1, nome2, nome3, nome4;
        double  idade1, idade2, idade3, idade4;
        
        System.out.println("SEJA BEM VINDO AO CALCULADOR DE MÉDIA 1.0 ");

        
        System.out.println("PESSOA 01, QUAL É A SUA IDADE ?" );
        idade1 = leitor.nextDouble();
        System.out.println("PESSOA 01, QUAL É O SEU NOME ?" );
        nome1 = leitor.next();
        
        System.out.println("PESSOA 02, QUAL É A SUA IDADE ?" );
        idade2 = leitor.nextDouble();
        System.out.println("PESSOA 02, QUAL É O SEU NOME ?" );
        nome2 = leitor.next();

        System.out.println("PESSOA 03, QUAL É A SUA IDADE ?" );
        idade3 = leitor.nextDouble();
        System.out.println("PESSOA 03, QUAL É O SEU NOME ?" );
        nome3 = leitor.next();

        System.out.println("PESSOA 04, QUAL É A SUA IDADE ?" );
        idade4 = leitor.nextDouble();
        System.out.println("PESSOA 04, QUAL É O SEU NOME ?" );
        nome4 = leitor.next();
        
        System.out.println( "A MÉDIA ARITMÉTICA DE " + nome1 + ", " + nome2 + ", " + nome3+ " E " + nome4 + " É: ");
        System.out.println((idade1+idade2+idade3+idade4)/4);
    }
    
}
