import java.util.Scanner;

public class lista01_21 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano para saber se é bissexto: ");
        int ano = sc.nextInt();

        if ( ano %4 == 0 && ano %100 !=0 || ano %400 ==0){
            System.out.println("BISSEXTO");
        }
        else {
            System.out.println("Não é bissexto");
        }

    }
}
