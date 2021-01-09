
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 199x
 */
public class trabalhador01 {
    public static void main (String[] args){
            Scanner leitor = new Scanner (System.in);
            
            double salarioHora;
            int horasTrabalhadas,percentualDeDesconto;
          
System.out.println("QUAL O VALOR DO SALARIO HORA ? ");
salarioHora = leitor.nextDouble();
System.out.println("QUAL O NUMERO DE HORAS TRABALHADAS ? ");
horasTrabalhadas = leitor.nextInt();
System.out.println("QUAL O PERCENTUAL DE DESCONTO ? ");
percentualDeDesconto = leitor.nextInt();


System.out.println("O VALOR DO SALARIO BRUTO SERÁ DE: ");
System.out.println(salarioHora*horasTrabalhadas);
System.out.println("O VALOR DO SALRIO LIQUIDO SERÁ DE: ");
System.out.println((salarioHora*horasTrabalhadas)-percentualDeDesconto*100/10);

            
    }
    
}
