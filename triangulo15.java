
import java.util.Scanner;

/*
Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os
valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
equilátero, isósceles ou escaleno.
Dicas:
• Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
terceiro;
• Triângulo Equilátero: três lados iguais;
• Triângulo Isósceles: quaisquer dois lados iguais;
• Triângulo Escaleno: três lados diferentes; 
 */
/**
 *
 * @author 199x
 */
public class triangulo15 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        double l1,l2,l3;
        System.out.println("informe o primeiro lado:");
        l1 = leitor.nextDouble();
        System.out.println("informe o segundo lado:");
        l2 = leitor.nextDouble();
        System.out.println("informe o terceiro lado:");
        l3 = leitor.nextDouble();
    if (l1 + l2 > l3){
            
    } if( l1 == l2 && l1 == l3){
        
    }
        System.out.println("Triângulo Equilátero");
        
    if(  l1 == l2 || l2 == l3 || l1 == l3){
        
    
        System.out.println("Triângulo Isósceles");
    if(  l1 != l2 && l3 || l2 != l1 && l3 || l1 != l3){
        
    }
        System.out.println("Triângulo Escaleno");

    else{
           
     System.out.println("É impossivel ser um triângulo"); 

    }
    
}
