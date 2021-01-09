import java.util.Scanner;
/*
Exercício 2 – Utilizando a classe Scanner, faça um programa em Java que calcule a área de um quadrado onde a medida 
do lado é digitada pelo usuário em cm, apresente o resultado para o usuário.
Observação: Fórmula para cálculo da área Aq = lado2
 */

/**
 *
 * @author T.i
 */
public class Exercicio2 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Olá usuário ! informe a área do quadrado em cm² e precione enter: ");
        double lado = leitor.nextDouble();
        double areaQuadrado = lado*lado;
        System.out.println("Usuário, um quadrado cujo lado correnspondente a " + lado + " terá a área = " + areaQuadrado + " cm²" );
        
        
        
    }
    
}
