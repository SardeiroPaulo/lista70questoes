import java.util.Scanner;

public class lista01_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você tem para saber quantos dolares pode comprar: ");
        double x = sc.nextDouble();

        double dolar = x / 4.98;

        System.out.printf("Você pode comprar: %.2f dolares", dolar);

        sc.close();
    }
}
