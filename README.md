# ipoo
ALEXANDRE  MENEZES GOMES 
ANALIZE E DESENVOLVIMENTO DE SISTEMAS
FACULDADE FANAP
PROFESSOR JOFRRE MOTA E PABLLO BORGES CARDOSO
2° PERIOD
LISTA DE APLICATIVOS SOLICITADOS COMO EXERCICIO .


Questão 1 (Teórica) – Em toda linguagem de programação existem os operadores lógicos e aritméticos, assim tomando como referência a linguagem de programação Java, descreva abaixo quais são e suas respectivas funções destes operadores.

Resposta: 
Operadores Matemáticos
+ Soma
- Subtração
* Multiplicação
/ Divisão
% Resto da divisão inteira
Operadores Lógicos
> Maior
< Menor
>= Maior ou igual
<= Menor ou igual
== Igual
!= Diferente
! Negação
&& Disjunção inclusiva (e)
|| Disjunção exclusiva (ou)

Questão 2 (Teórica) – Em toda linguagem de programação existem tipos de dados/variáveis que recebem conteúdos, tomando como exemplo a linguagem de programação Java, quais são os 8 (oito) tipos primitivos? 
Resposta: 
TIPOS PRIMITIVOS EM JAVA

Categoria: Números inteiros

Byte = 1 byte exemplo: private byte n;

Short  = 2 bytes exemplo: private short n2;

Int = 4 bytes exemplo: private int n3;

Long = 8 bytes Exemplo: private long n4;

Categoria: Números reais ou ponto flutuante
 
Float = 4 bytes (32 bits) Exemplo: private float n5;

Double  = 8 bytes (64 bits) Exemplo: private double n6;

Boolean: Só pode assumer 1 de 2 status, verdadeiro (true) ou false (false). Exemplo private boolean status;

UNICODE char: 16 bits. Exemplo: private char a;

Questão 3 (Teórica) – Em todo o mundo da programação de computadores existem problemas de caráter natural de um escopo, existe o erro de truncamento, explique este problema contextualizando.
Resposta: Teoricamente o truncamento pode ser explicado como um erro na hora de adicionar casas decimais a um valor dentro de um código, e contextualizando a ideia, podemos colocar como exemplo quando um desenvolvedor pretende realizar operações para alcançar extremas precisão dentro de um sistema, para evitar perdas monetárias.


Questão 4 (Teórica) – Em toda linguagem de programação existem as estruturas de controle de fluxo e decisão, assim tomando como referência a linguagem de programação Java, descreva a estrutura if/else, condições de uso e escreva um pequeno trecho de código exemplificando. 
Resposta: 
São estruturas condicionais que permitem ao sistema, avaliar uma expressão como sendo verdadeira ou falsa, de acordo com o resultado dessa verificação, executar uma ou outra rotina. O tipo resultante dessa expressão sempre será do tipo Boolean. 
Sintax completa:

if (condição) {
  execução caso condição seja verdadeira;
} else {
  execução caso condição seja falsa;
}
 
Questão 5 (Teórica) – Em toda linguagem de programação existe o ciclo de vida de um programa, assim tomando como referência a linguagem de programação Java, explique o que este ciclo e sua aplicação dentro dos programas.
Resposta: Entrada de dados pode ser exemplificada com a utilização do método Scanner, onde informações são inseridas pelo usuário ao sistema, onde reserva um espaço na memória principal. Quando o sistema recebe essas informações ele executa o sue Processamento, realizando o que se deseja obter e, por fim, acontece a Saída de dados, retornando ao usuário o que se deseja receber.

Questão 6 (Prática) – Faça um programa em Java que receba dois números inteiros e retorne o resto da divisão inteira.
import javax.swing.JOptionPane;

public class RestoDaDivisaoInteira {
    public static void main(String[] args){
        
        int dividendo = 0;
        int divisor = 0;
        int resto = 0;
        
        dividendo = Integer.parseInt(JOptionPane.showInputDialog("Caro(a)"
                + " usuário(a), digite o número que represente o dividendo e"
                + " pressione ENTER:"));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Caro(a)"
                + " usuário(a), digite o número que represente o divisor e "
                + "pressione ENTER:"));
        resto = dividendo % divisor;
        JOptionPane.showMessageDialog(null, "O resto da divisão inteira entre: "
        + dividendo + ", e " + divisor + ", é: " + resto);
    }
}
 
Questão 7 (Prática) – Faça um programa em Java que receba quatro  números reais, calcule sua média aritmética e retorne para o usuário o resultado.
import javax.swing.JOptionPane;

public class Questao7 {

    public static void main(String[] args) {

        float n1 = 0f;
        float n2 = 0f;
        float n3 = 0f;
        float n4 = 0f;
        float mediaArt = 0f;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o primeiro número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n2 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o segundo número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n3 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o terceiro número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n4 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o quarto número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        mediaArt = (n1 + n2 + n3 + n4) / 4;

        JOptionPane.showMessageDialog(null, "A média Aritmética calculada dos"
                + " números, " + n1 + ", " + n2 + ", " + n3 + " e " + n4 
                + " é: " + mediaArt);
    }
}

Questão 8 (Prática) – Utilizando da questão 7, altere o código solicitando ao usuário que digite seu nome, assim ao apresentar o resultado do cálculo será a seguinte mensagem: “Prezado Pabllo, sua média é 7,0!”
public class Questao8 {

    public static void main(String[] args) {

        String nome = "";
        float n1 = 0f;
        float n2 = 0f;
        float n3 = 0f;
        float n4 = 0f;
        float mediaArt = 0f;
        
        nome = (JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o seu nome e pressione ENTER: "));

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o primeiro número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n2 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o segundo número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n3 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o terceiro número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        n4 = Float.parseFloat(JOptionPane.showInputDialog("Prezado(a)"
                + " usuário(a), digite o quarto número qualquer, no formato"
                + " (*.*) e pressione ENTER: "));

        mediaArt = (n1 + n2 + n3 + n4) / 4;

        JOptionPane.showMessageDialog(null, "Prezado " + nome + ", sua média é " + mediaArt + "!");
    }
}
Questão 9 (Prática) – Faça um programa em Java que escreva a seguinte mensagem na tela, “Olá alunos(as) da FANAP!”.
Resposta:
import javax.swing.JOptionPane;

public class Questao9 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá alunos(as) da FANAP!");
    }
}


