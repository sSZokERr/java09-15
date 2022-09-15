import java.util.Scanner;

public class harmadik {
    public static void main(String[] args) {
        System.out.print("Kérek egy számot 1 és 100 között: ");
        Scanner sc = new Scanner(System.in);
        double szam = sc.nextDouble();
        if (szam - 1 > 100 - szam){
            System.out.printf("A megadott szám a 1 és 100 között van és ezek közül a 100-hoz van közelebb");
        }else {
            System.out.printf("A megadott szám a 1 és 100 között van és ezek közül a 1-hez van közelebb");
        }

        String doubleAsString = String.valueOf(szam);
        int indexOfDecimal = doubleAsString.indexOf(".");
        System.out.println("Double Number: " + szam);
        System.out.println("A szám egész része: " + doubleAsString.substring(0, indexOfDecimal));
        System.out.println("A szám tört része része: " + doubleAsString.substring(indexOfDecimal));
    }
}
