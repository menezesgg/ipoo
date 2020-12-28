package estruturarepeticao;
import javax.swing.JOptionPane;

public class TestandoFor1 {
    public static void main(String[] args) {
        int elementoInicial = 0;
        
        elementoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento inicial:"));
        
        for(int indice = elementoInicial; indice <= elementoInicial + 30; indice = indice + 1){
            System.out.println("Passo do laço for para indice: " + indice);
        }
        
    }
}
