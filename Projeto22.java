import java.util.Scanner;

public class Projeto22 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            X = sc.nextInt();
            Y = sc.nextInt();

        }
        // digite numeros iguais para finalizar o programa


        sc.close();
    }
}
