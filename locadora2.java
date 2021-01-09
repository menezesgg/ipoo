
import java.util.Scanner;

/* Escreva um programa para ler a quantidade de vídeos que uma locadora de vídeos possui e o valor que ela
cobra por cada locação. Este programa deverá imprimir as seguintes informações:
a. Sabendo-se que 1/3 dos vídeos são alugadas por mês, exiba o faturamento anual da locadora.
b. Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor da locação. Sabendose que 1/10 dos vídeos alugados no mês são devolvidas com atraso, calcule o valor ganho com multas
por mês.
c. Sabendo-se ainda que 2% dos vídeos se estragam ao longo do ano, e 1/10 do total é comprado para
reposição, exiba a quantidade de vídeos que a locadora terá no final do ano. */

public class locadora2 {
 public static void main (String[] args){
     Scanner leitor = new Scanner (System.in);
     
     double totalDeVideo,valorcobrado,fitascompradas=1;
     
     System.out.println("BEM VINDO AO LOCADORA PLUS 1.0");
     
     System.out.println("QUAL A QUANTIDADE TOTAL DE VIDEO NESSA LOCADORA ?");
     totalDeVideo = leitor.nextDouble();
     
     System.out.println("QUAL É O VALOR DA LOCACAO? ");
     valorcobrado = leitor.nextDouble();
     
     System.out.println ("O FATURAMENTO ANUAL SERÁ DE: ");
     System.out.println (totalDeVideo*valorcobrado/3*12);
     System.out.println("O VALOR COM 10 % DE JUROS SERÁ:");
     System.out.println((totalDeVideo*valorcobrado/3)*0.1*0.1);
     System.out.println("A QUANTIDADE DE VIDEO QUE TERA NO ANO SERA: ");
     System.out.println((totalDeVideo*0.98)+fitascompradas*10);

}
}