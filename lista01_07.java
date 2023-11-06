import java.util.Scanner;

public class lista01_07 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver o seu dobro e a terceira parte dele: ");
        double n1 = sc.nextDouble();



        sc.close();
        // format calculando na saida do dado
        System.out.printf("O dobro do número é %.1f e a terça parte é %.2f", n1 * 2, n1 / 3);

    }
}
