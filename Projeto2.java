import java.util.Locale;
import java.util.Scanner;

// lê o raio do circulo e depois mostra o valor da área desse cirulo com quatro casas decimais.

    public class Projeto2 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double pi = 3.14159;
            double R, A;

            System.out.println("Digite o raio do circulo");
            R = sc.nextDouble();

            A = pi * R * R;

            System.out.printf("A=%.4f%n", A);

            sc.close();
        }
    }

