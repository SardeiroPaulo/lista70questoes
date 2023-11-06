import java.util.Scanner;

public class lista01_05 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double n2 = sc.nextDouble();



        System.out.printf("Sua média é %.1f", (n1 + n2) / 2);

        sc.close();


    }
}
