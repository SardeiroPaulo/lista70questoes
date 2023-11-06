import java.util.Scanner;

public class lista01_22 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();


        if (idade < 18){
            int y = 18 - idade;
            System.out.printf("Faltam %d ano(s) para o alistamento obrigátorio", y);
        }
        if (idade > 18) {
            int z = idade - 18;
            System.out.printf("Já se passaram %d ano(s) do alistamento", z);
        }

        sc.close();
    }
}
