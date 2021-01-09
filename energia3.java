
import java.util.Scanner;

/*
Sabendo-se que 100 quilowatts de energia custam 1/7 do salário mínimo (R$ 998,00 em 2019), fazer um
programa para receber o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e
calcular e imprimir:
a. o valor em reais de cada quilowatt
b. o valor em reais a ser pago
c. o novo valor a ser pago por esta residência com um desconto de 10%
 */

//ALEXANDRE MENEZES GOMES ADS 1° PERIODO

public class energia3 {
    public static void main (String[] args){
    Scanner leitor = new Scanner (System.in);  
    
    double valorSalario,valorQuilowatt,reaisQuilowatt,valorComDesconto;
    
    System.out.println("VALOR SALARIO MINIMO ? ");
    valorSalario = leitor.nextDouble();
    
    System.out.println("QUILOWATTS GASTOS ? ");
    valorQuilowatt = leitor.nextDouble();
    
     reaisQuilowatt = (valorSalario/7)/100;
     valorComDesconto = valorSalario/7;
    
 System.out.println("O valor em reais a ser pago é: "+ valorSalario/7);
 System.out.println("O valor em reais de cada quilowatt é: " + reaisQuilowatt);
 System.out.println("O novo valor a ser pago por esta residência com um desconto de 10% é: ");
 System.out.println((valorComDesconto-10)*100);

    }
}