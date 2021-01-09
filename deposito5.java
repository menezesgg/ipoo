
import java.util.Scanner;

/*
 Escreva um programa para ler o valor de um depósito 
 e o valor da taxa de juros e calcular e imprimir o valor
 dos rendimentos e o valor total depois do rendimento.
 */
//ALEXANDRE MENEZES GOMES ADS 1° PERIODO
public class deposito5 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        double valorT,taxaJ ;
        
        System.out.println("QUAL O VALOR DO DEPOSITO? ");
        valorT = leitor.nextDouble();
        
        System.out.println("QUAL É A TAXA DE JUROS? ");
        taxaJ = leitor.nextDouble();
        
        valorT= (valorT)+taxaJ/100;
        
        System.out.println("O VALOR DOS RENDIMENTOS SERÁ DE: " + valorT/taxaJ + " REAIS ");
        
        System.out.println("O VALOR TOTAL COM OS RENDIMENTOS É: " + valorT + taxaJ +" REAIS ");
        
    }
    
}
