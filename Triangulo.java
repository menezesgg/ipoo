/*
Faça um algoritmo para ler a base e a altura de um triângulo. Em seguida, escreva a área do mesmo. Obs.:
Área = ( Base * Altura ) / 2
 */
package lista02;

// ALEXANDRE MENZES GOMES ADS 1° PERIODO

import java.util.Scanner;

public class Triangulo {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        double base,altura;
        
        System.out.println("BEM VINDO AO CALCULADOR DE BASE E ALTURA DE UM TRIAGULO ! ");
        
        System.out.println("QUAL A BASE DO TRIAGULO ?");
        base = leitor.nextDouble();
        System.out.println("QUAL A ALTURA DO TRIANGULO ? ");
        altura = leitor.nextDouble();
        
        System.out.println("A ÁREA DO TRIANGULO É: " + (base*altura)/2);
    }
    
}
