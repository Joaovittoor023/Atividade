import java.util.Scanner;

public class Projeto21 {
// estrutura while

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        // digite 0 para finalizar a soma dos numeros

        System.out.println(soma);

        sc.close();
    }
}
