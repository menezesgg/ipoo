/*
Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados
para um haras.
 */
package lista02;

//Alexandre Menezes Gomes Curso ADS 1° Periodo

import java.util.Scanner;


public class Ferraduras {
    public static void main (String[] args){
    Scanner leitor = new Scanner (System.in);        
        
       int a;
      System.out.println("Seja bem vindo ao calculador de ferraduras !");
      System.out.println("Qual a quantidade de cavalos comprados ?");
      a = leitor.nextInt();
      System.out.println("Será necessária " + a * 4 + " Ferraduras." + " para os " + a + " cavalos comprados!");
        
       
        
    }
    
}
