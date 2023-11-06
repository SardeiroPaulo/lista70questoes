import java.util.Scanner;

public class lista01_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver o seu antecessor e sucessor: ");
        int n1 = sc.nextInt();

        System.out.printf("O número antecessor é %d e o sucessor é %d", n1 - 1, n1 + 1 );


        sc.close();
    }
}
