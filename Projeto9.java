import java.util.Scanner;

public class Projeto9 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(" A é o menor " + a);
        } else if (b < c) {
            System.out.println(" B é o menor " + b);
        } else  {
            System.out.println(" C é o menor " + c);
        }


        sc.close();
    }
}
