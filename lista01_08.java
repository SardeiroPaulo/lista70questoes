import java.util.Scanner;

public class lista01_08 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma medida em metros para ver suas conversões: ");
        double x = sc.nextDouble();
            double km = x / 1000;
            double hm = x / 100;
            double dam = x / 10;
            double dm = x * 10;
            double cm = x * 100;
            double mm = x * 1000;

        System.out.println("A distancia de "+ x + "m corresnpode a: ");
        System.out.println(km + " Km");
        System.out.println(hm + " Hm");
        System.out.println(dam + " Dam");
        System.out.println(dm + " Dm");
        System.out.println(cm + " Cm");
        System.out.println(mm + " Mm");


        sc.close();
    }
}
