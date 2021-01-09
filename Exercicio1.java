
import java.util.Scanner;

/*
Exercício 1 – Utilizando da classe Scanner, faça um
programa em Java que obtendo dois números inteiros
positivos, calcule a soma e apresente o resultado ao
usuário.
 */

/**
 *
 * @author T.i
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("usuario informe o primeiro numero: ");
        int num1 = leitor.nextInt();
        System.out.println("usuario informe o segundo numero: ");
        int num2 = leitor.nextInt();
        int soma = num1 + num2;
               System.out.println("usuario a soma de " + num1 + " + " + num2 + " é = " + soma );

    }

}
