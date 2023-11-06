import java.util.Scanner;

public class lista01_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um outro número");
        int n2 = sc.nextInt();



        System.out.printf("A soma dos números é: %d", n1 + n2);
        sc.close();
    }
}
