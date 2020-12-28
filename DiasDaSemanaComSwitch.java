package estruturacondicional;

import javax.swing.JOptionPane;

public class DiasDaSemanaComSwitch {
    public static void main(String[] args) {
        int dia = 0;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Prezado(a) usuário(a), digite um número entre 1 a 7, inclusive:"));
    
        switch (dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Prezado(a) usuário(a), deve ser digitado um valor válido, 1 a 7, inclusive:");
                break;
        }
    }
    
}
