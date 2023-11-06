import java.util.Scanner;

public class lista01_12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o valor do produto para ver o desconto: ");
        double x = sc.nextDouble();

        double desconto = x * 0.05;
        double valorFinal = x - desconto;
        System.out.printf("PREÇO PROMOCIONAL R$: %.2f", valorFinal);


        sc.close();

    }
}
