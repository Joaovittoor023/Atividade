import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Projeto19 {
    public static void main (String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        System.out.println(" [1] DOMINGO \n [2] SEGUNDA \n [3] TERÇA \n [4] QUARTA \n [5] QUINTA \n [6] SEXTA \n [7] SÁBADO");

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
            default:
                dia = "invalido";
                break;
        }
        System.out.println("Dia da semana escolhido: " + dia);

        sc.close();
    }
}
