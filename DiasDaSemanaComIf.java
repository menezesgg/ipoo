package estruturacondicional;


import javax.swing.JOptionPane;

public class DiasDaSemanaComIf {

    public static void main(String[] args) {

        int numero;
        String entrada = "";

        entrada = JOptionPane.showInputDialog("Informe um número:");
        numero = Integer.parseInt(entrada);

        if (numero == 1) {
            JOptionPane.showMessageDialog(null, numero + "-Domingo");
        } else if (numero == 2) {
            JOptionPane.showMessageDialog(null, numero + "-Segunda");
        } else if (numero == 3) {
            JOptionPane.showMessageDialog(null, numero + "-Terça");
        } else if (numero == 4) {
            JOptionPane.showMessageDialog(null, numero + "-Quarta");
        } else if (numero == 5) {
            JOptionPane.showMessageDialog(null, numero + "-Quinta");
        } else if (numero == 6) {
            JOptionPane.showMessageDialog(null, numero + "-Sexta");
        } else if (numero == 7) {
            JOptionPane.showMessageDialog(null, numero + "-Sabado");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido.");
        }
    }
}
