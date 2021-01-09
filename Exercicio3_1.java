
//Exercício 3.1 – Refatore o exercício 3, mas agora utilize para entrada e saída de dados a classe estática JOptionPane.
 //Alexandre Menezes Gomes ADS 2° Periodo Faculdade: Fanap
import javax.swing.JOptionPane;
public class Exercicio3_1 {
    public static void main (String[] args){
        String lado = JOptionPane.showInputDialog(null,"Usuário Informe quantos metros possui o cubo e precione enter:");
        double lado1 = Double.parseDouble(lado);
        double resultado = lado1*lado1*lado1;
        JOptionPane.showMessageDialog(null,"O valor do volume do cubo será de: " + resultado + " MT³");
    }
    
}
