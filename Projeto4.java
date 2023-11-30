import java.util.Locale;
import java.util.Scanner;

public class Projeto4 {
    //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    //decimais.

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num, horasTrabalhadas;
        double pagamento, salario;

        System.out.println("Digite o numero do funcionario: ");
        num = sc.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite quanto o valor hora: ");
        pagamento = sc.nextDouble();

        salario = horasTrabalhadas * pagamento;

        System.out.println("Este é o salario do funcionario: " + num);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
