import java.util.Scanner;

public class lista01_10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar, a seguir digite os dados pedidos");
        System.out.println("Qual a altura da parede?");
        double altura = sc.nextDouble();
        System.out.println("Qual a largura da parede?");
        double largura = sc.nextDouble();

        double area = altura * largura;
        double tintaNecessaria = area / 2;

        System.out.printf("A area total da parede é de %.2f m e precisa de %.2f litros de tinta", area, tintaNecessaria);


    }
}
