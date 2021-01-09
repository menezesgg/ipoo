/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo
para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros
ele conseguiu colocar no tanque.
 */
package lista02;

//Alexandre Menezes Gomes Curso ADS 1° Periodo

import java.util.Scanner;


public class Gasolina {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        
        double litroG;
        double valorpagamento = 4.75;
        
        System.out.println("Bem vindo ao posto de gasolina ! ");
        
        System.out.println("Quantos litros de gasolina deseja abastecer ? ");
        litroG = leitor.nextDouble();
        System.out.println("Voçê paga: " + litroG *valorpagamento + "R$");
       
        

        
    }
    
}
