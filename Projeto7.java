import java.util.Scanner;

public class Projeto7 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        double notaFinal;
        notaFinal = nota1 + nota2 / 2;

        System.out.println("Sua nota final é de: " + notaFinal);

        if (notaFinal < 50) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }

    }
}
