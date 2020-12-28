/*
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada
pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a
venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados.
 */
package lista02;

//Alexandre Menezes Gomes Curso ADS 1° Periodo

import java.util.Scanner;


public class Hotpao {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);
        
        double pao,broa,total,poupar;
        
       
        
        System.out.println("Seja bem vindo ao Sistema inteligente HotPão !");
        
        System.out.println("Qual foi a quantidade de pães vendidas ?");
        pao = leitor.nextDouble();
        
        System.out.println("Qual foi a quantidade de broas vendidas ?");
        broa = leitor.nextDouble();
        
       pao = pao * 0.12;
       broa = broa * 1.50;
       total = pao + broa ;
       poupar = ((pao + broa)/100)*10;
        
       System.out.println("Hoje voçê vendeu R$:" + total +".");
       System.out.println("Deve guardar na poupança R$:"+ poupar +".");
        
              
      
        
        
       
    }
    
}
