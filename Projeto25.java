import java.util.Scanner;

public class Projeto25 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 123) {
            System.out.println("Senha Invalida");

            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
