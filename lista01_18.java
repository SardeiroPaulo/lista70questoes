import java.util.Scanner;

public class lista01_18 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano que nasceu: ");
        int ano = sc.nextInt();

        int idade = 2023 - ano;

        if ( idade >= 16) {
            System.out.println("Já pode votar");
        }
        else {
            System.out.println("Não pode votar");
        }
        sc.close();
    }
}
