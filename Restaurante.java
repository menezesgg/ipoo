/*
O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o
peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte
o peso do prato.
 */
package lista02;

//Alexandre Menezes Gomes ADS 1° PERIODO

import java.util.Scanner;


public class Restaurante {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
       double peso;
       
       System.out.println("Seja bem vindo ao restaurante Bem-bão! ");
       System.out.println("Informe agora o peso de sua comida:");
       peso = leitor.nextDouble();
       
       
       System.out.println("O valor a ser pago será : "+ peso * 12.00 + " R$.");
       
    }
}
