import java.util.Scanner;

public class lista01_15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias trabalhado para ver o seu salário: ");
        double dias = sc.nextDouble();

        double salario = dias * 8 * 25;

        System.out.println("Seu salário é: R$: "+ salario);
    }
}
