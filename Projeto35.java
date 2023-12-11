import java.util.Scanner;

public class Projeto35 {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
