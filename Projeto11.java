import java.util.Scanner;
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Projeto11 {
    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if (num % 2 ==0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
