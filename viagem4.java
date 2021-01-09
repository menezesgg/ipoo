
import java.util.Scanner;

/*
Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma
viagem, sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a
velocidade média. Utilizar as seguintes fórmulas:
a. distância = tempo x velocidade
b. litros usados = distância / 12
 */
//ALEXANDRE MENEZES GOMES ADS 1° PERIODO

public class viagem4 {
    public static void main (String[] args){
        
        Scanner leitor = new Scanner (System.in);
        
        double tempo,velocidadeMedia,distancia,litrosUsados;
        
        System.out.println("QUAL O TEMPO DA VIAGEM? ");
        tempo = leitor.nextDouble();
        
        System.out.println("QUAL A VELOCIDADE MEDIA? ");
        velocidadeMedia = leitor.nextDouble();
        
        distancia = tempo*velocidadeMedia;
        litrosUsados = distancia/12;
        
        
        System.out.println("Distancia percorrida: " +  distancia + " km.");
        System.out.println("Combustivel utilizado: " + litrosUsados + " litros.");
    }
    
}
