import java.util.Scanner;

public class lista01_16 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular quanto tempo de vida você ja perdeu!");
        System.out.println("Para isso preciso que me diga, quantos cigarros fuma por dia? ");
        int cigarro = sc.nextInt();
        System.out.println("E a quantos anos você fuma? ");
        int tempo = sc.nextInt();

        double tempoPerdido = cigarro * 10 * 365;
        double conversaoDiasHoras = tempoPerdido / 60 / 24;

        System.out.printf("Você ja perdeu: %.2f dias da sua vida", conversaoDiasHoras);

        sc.close();
    }
}
