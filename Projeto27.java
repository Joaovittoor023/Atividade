import java.util.Scanner;

public class Projeto27 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for ( int i = 0 ; i < N ; ++i) {
            int num = sc.nextInt();
            soma = soma + num;
        }

        System.out.println(soma);

        sc.close();
    }
}
