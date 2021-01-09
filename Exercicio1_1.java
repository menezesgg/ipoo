
import javax.swing.JOptionPane;

/*
Exercício 1.1 – Refatore o exercício 1,
mas agora utilize para entrada e saída de dados a 
classe estática JOptionPane.
 */

/**
 *
 * @author T.i
 */
public class Exercicio1_1 {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("usuario informe o primeiro numero");
        int n1 = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("usuario informe o segundo numero");
        int n2 = Integer.parseInt(num2);
       int soma = n1 + n2;
       JOptionPane.showMessageDialog(null, "A soma entre " +n1 + "+ " + n2 + " é  "   + soma);

    }

}
