import javax.swing.JOptionPane;
/*
Exercício 2.1 – Refatore o exercício 2, mas agora utilize para entrada e saída de dados a classe estática JOptionPane.
 */

/**
 *
 * @author T.i
 */
public class Exercicio2_1 {
    public static void main (String[] args){
        String lado = JOptionPane.showInputDialog(null,"Olá usuário ! informe a área do quadrado em cm² e precione enter:");
  double area = Double.parseDouble(lado);
  JOptionPane.showMessageDialog(null,"A área do quadrado será de: " + area*area + " CM²");
    }
    
}
