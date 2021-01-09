import java.util.Scanner;
/*
Exercício 3 – Utilizando a classe Scanner, faça um programa em Java que calcule o volume de um cubo
onde a medida do lado é digitada pelo usuário em m, apresente o resultado para o usuário. 
Observação: Fórmula para cálculo do volume Vc = lado3
 */


//Alexandre Menezes Gomes ADS 2° Periodo Faculdade: Fanap
// Programação Orientada a Objetos. (P.O.O)

public class Exercicio3 {
    public static void main (String[] args){
        Scanner leitor = new Scanner  (System.in);
        System.out.println("Olá usuário, sejá bem vindo ao calculador de volume de um cubo !" );
        System.out.println(" Usuário Informe quantos metros possui o cubo e precione enter:");
        int volume = leitor.nextInt();
        int volumeDoCubo = volume*volume*volume;
        System.out.println("O valor do volume do cubo será de: " + volumeDoCubo + "MT²");
        
    }
    
}
