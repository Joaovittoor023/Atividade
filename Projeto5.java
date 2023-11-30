import java.util.Locale;
import java.util.Scanner;

public class Projeto5 {
    //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod1, num1, cod2, num2;
        double preco1, preco2, total;

        System.out.println("Digite o codigo da peça 1");
        cod1 = sc.nextInt();

        System.out.println("digite a quantidade da peça 1");
        num1 = sc.nextInt();

        System.out.println("digite o codigo da peça 2");
        cod2 = sc.nextInt();

        System.out.println("digite a quantidade da peça 2");
        num2 = sc.nextInt();

        System.out.println("digite o preço da peça 1");
        preco1 = sc.nextDouble();

        System.out.println("digite o preço da peça 2");
        preco2 = sc.nextDouble();

        total = preco1 * num1 + preco2 * num2;

        System.out.println("VALOR A PAGAR R$: " + total);

        sc.close();
    }
}
