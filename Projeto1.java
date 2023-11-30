import java.util.Locale;
import java.util.Scanner;

public class Projeto1 {
    // um programa que lê as medidas de largura e comprimento de um terreno retangular com uma casa decimal

    public  static void main(String[] Args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado;

        System.out.println("Digite a largura");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento");
        comprimento = sc.nextDouble();
        System.out.println("Digite o Metro Quadrado");
        metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.println("AREA = " + area);
        System.out.println("PREÇO = " + preco);


        sc.close();
    }
}

// Entrada de dados, processamento de dados e saída de dados.