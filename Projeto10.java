import java.util.Scanner;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Projeto10 {
    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero");
        num = sc.nextInt();

        if (num < 0 ) {
            System.out.println("NEGATIVO: " + num );
        } else {
            System.out.println("POSITIVO: " + num);
        }


        sc.close();
    }
}
