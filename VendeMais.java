/*
A imobiliária VENDEMAIS vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de
um terreno e depois exibir a área do terreno.
 */
package lista02;

//Alexandre Menezes Gomes Curso ADS 1° Periodo

import java.util.Scanner;


public class VendeMais {

    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
      double  base, altura;
      
           System.out.println("Seja bem vindo a imobiliária VENDE MAIS !" );
           
           System.out.println("Informe o valor da Base: ");
           base = leitor.nextDouble();
           System.out.println("Informe o valor da Altura: ");
           altura = leitor.nextDouble();
           Double resultado = (base * altura);
           System.out.println("A área do terreno é: " + resultado + " metros quadrados.");
           
    
    }
    
}
