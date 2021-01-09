import javax.swing.JOptionPane;

/*
Questão 05 – Utilizando da linguagem de programação Java construa uma aplicação que calcule a velocidade média (VM)
segundo a observação dos exemplos abaixo, e para esta aplicação você deve utilizar obrigatoriamente a implementação 
do objeto JOptionPane para interação com o usuário. Como referência utiliza e fórmula abaixo:
 */

// Alexandre Menezes Gomes ADS 2° Periodo Fanap 03/04/2020

public class AtividadeBimestral{

    String d = JOptionPane.showInputDialog(null, "Usuario(a) informe a distançia da viagem percorrida : ");
    double distancia = Double.parseDouble(d);
    String t = JOptionPane.showInputDialog(null, "Usuario(a) informe o tempo da viagem percorrida : ");
    double tempo = Double.parseDouble(t);
    double velocidadeMedia = distancia/tempo;
JOptionPane.showMessageDialog(null,"A velocidade média é " + velocidadeMedia);
}
}

    
}
