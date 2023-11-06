import java.util.Scanner;

public class lista01_17 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade do carro: ");
        double velocidade = sc.nextDouble();

        double multa = (velocidade - 80) * 5;

        if ( velocidade > 80) {
            System.out.println("Multado, valor R$: " + multa);
        }
        else {
            System.out.println("Sem multa");
        }

    }
}
