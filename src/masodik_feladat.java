import java.util.Scanner;

public class masodik_feladat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A fal magassaga: ");
        double magas = sc.nextDouble();

        System.out.print("A fal szelessege: ");
        double szeles = sc.nextDouble();

        double csempe = szeles / 20 + (magas / 20 - szeles / 20);
        System.out.printf("%f db csempe fog kelleni", csempe);

    }


}
