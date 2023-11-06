import java.util.Scanner;

public class lista01_14 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos iniciar, digite os dados a seguir para calcular o valor a ser pago: ");
        System.out.println("Digite a quantidade de dias que o carro foi utilizado: ");
        int dias = sc.nextInt();
        System.out.println("Digite a quantidade de Kms percorridos: ");
        double km = sc.nextDouble();



        double valorFinal = (90 * dias) + (0.20 * km);

        System.out.printf("O valor a ser pago pelo aluguel do carro é: R$ %.2f", valorFinal);

        sc.close();

    }
}
