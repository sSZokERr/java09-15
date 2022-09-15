import java.util.Random;
import java.util.Scanner;

public class tizenharom {
    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
    public static void feladat13(){
        System.out.println("13. feladat");
        //int min = 1;
        //int max = 100;
        int gondoltSzam = r.nextInt(101-1) + 1;
        int tipp = 0;
        System.out.println(gondoltSzam);
        System.out.println("Találd ki a számot! (1-100)");
        do {
            System.out.print("\nTipp: ");
            tipp = sc.nextInt();
            if (tipp > gondoltSzam){
                System.out.println("A szám kissebb a megadottnál.");
            }else{
                System.out.println("A szám nagyobb a megadottnál.");
            }
        }while(tipp != gondoltSzam);
        System.out.println("Eltaláltad");

    }
}