import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Medence atmero: ");
        double atmero = scan.nextDouble();

        System.out.print("Medence melyseg: ");
        double melyseg = scan.nextDouble();

        double sugar = atmero/2.0;

        double  terfogat = sugar*sugar*Math.PI;
        System.out.printf("A medencebe %f.2 viz fer el",terfogat);

    }
}