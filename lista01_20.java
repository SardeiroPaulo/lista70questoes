import java.util.Scanner;

public class lista01_20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para ver se é par ou impar: ");
        int n = sc.nextInt();


        if ( (n %2) != 0) {
            System.out.println("IMPAR");

        }
        else {
            System.out.println("PAR");
        }
    }
}
