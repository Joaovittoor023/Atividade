import java.util.Scanner;
//tabuada

public class Projeto28 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }

        sc.close();
    }
}
