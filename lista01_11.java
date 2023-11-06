import java.util.Scanner;

public class lista01_11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar, a seguir digite os valores para calcular delta");
        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O valor de delta é: " + delta);

        sc.close();
    }
}
