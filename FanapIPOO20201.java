import java.util.Scanner;

public class FanapIPOO20201 {

    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.println (" Olá usuario (a)! Informe seu peso: ");
    double peso = leitor.nextDouble();

    System.out.println (" Agora, Informe sua altura: ");
    double altura = leitor.nextDouble();

    double imc = (peso / (altura * altura));

    if (imc<18.5){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Abaixo da média. ");
    }
    if ((imc >=18.5) && (imc<24.9)){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Peso Normal ");
    }
    if ((imc >=25.0) && (imc< 29.9)){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Exesso de peso");
    }
    if ((imc >=30.0) && (imc<34.9)){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Obesidade classe 1 ");
    }
    if ((imc >=35.0) && (imc<39.9)){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Obesidade classe 2 ");
    }
    if (imc >=40.0){
        System.out.println(" Usuario (a)! Sua classificação de IMC é Obesidade classe 3");
    }
}
}
