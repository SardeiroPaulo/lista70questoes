import java.util.Scanner;

public class lista01_13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário do funcionário, para ver o novo salário com aumento: ");
        double salario = sc.nextDouble();

        double aumento = salario * 0.15;
        double salarioFinal = salario + aumento;

        System.out.printf("Novo salário = R$: %.2f", salarioFinal);

        sc.close();

    }


}
