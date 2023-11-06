import java.util.Scanner;

public class lista01_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome  = sc.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        sc.close();

    }
}
