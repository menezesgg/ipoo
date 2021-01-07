
import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        float peso = 0f;
        float altura = 0f;
        float imc = 0f;
        Scanner e = new Scanner(System.in);
        
        System.out.println("Prezado(a) usuário(a), digite seu peso em Kg, pressione ENTER: ");
        peso = e.nextFloat();
        
        System.out.println("Prezado(a) usuário(a), digite sua altura em m, pressione ENTER: ");
        altura = e.nextFloat();
        
        imc = ((peso)/(altura*altura));
        
        if (imc < 18.5){
            System.out.printf("Para %f, peso abaixo do normal!\n", imc);
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.printf("Para %f, peso normal!\n", imc);
        } else if ((imc > 24.9) && (imc <= 29.9)) {
            System.out.printf("Para %f, excesso de peso!\n", imc);
        } else if ((imc > 29.9) && (imc <= 34.9)) {
            System.out.printf("Para %f, obesidade classe 1l!\n", imc);
        } else if ((imc > 34.9) && (imc <= 39.9)) {
            System.out.printf("Para %f, obesidade classe 2l!\n", imc);
        } else {
            System.out.printf("Para %f, obesidade classe 3l!\n", imc);
        }
    }
}
