import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float media = 0;
        String nome = "";
        
        System.out.println("Prezado(a) aluno(a), informe seu nome e pressione ENTER:");
        nome = e.nextLine();
        
        System.out.printf("Olá %s, informe sua primeira nota e pressione ENTER:\n", nome);
        n1 = e.nextFloat();
        
        System.out.printf("Agora %s, informe sua segunda nota e pressione ENTER:\n", nome);
        n2 = e.nextFloat();
        
        System.out.printf("Estamos terminando %s, informe sua terceira nota e pressione ENTER:\n", nome);
        n3 = e.nextFloat();
        
        media = (n1 + n2 + n3)/3;
        
        if (media < 3) {
            System.out.printf("%s, sua média é %f, infelizmente você está reprovado(a), procure nossa secretaria!\n", nome, media);
        } else if ((media >= 3) && (media < 7)){
            System.out.printf("%s, sua média é %f, você fará exame final!\n", nome, media);
        } else {
            System.out.printf("%s, sua média é %f, você está aprovado(a), boas férias!\n", nome, media);
        }
    }
}
