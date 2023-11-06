import java.util.Scanner;

public class lista01_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();
        System.out.println("Qual o seu salário?") ;
            double salario = sc.nextDouble();
        System.out.println("Nome do funcionário: "+ nome);
        System.out.printf("Salário: %.2f%n", salario);
        System.out.printf("O funcionário %s tem um salário de R$ %.2f", nome, salario);

    }
}
