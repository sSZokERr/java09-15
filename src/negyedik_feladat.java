import java.util.Scanner;

public class negyedik_feladat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A harom oldal: ");
        double elso = sc.nextDouble();
        double masodik = sc.nextDouble();
        double harmadik = sc.nextDouble();

        if ((elso+masodik > harmadik) && (masodik + harmadik > elso) && (harmadik+elso>masodik)) {
            System.out.println("Valos haromszog");
            double kerulet = elso + masodik + harmadik;
        }
        else {
            System.out.println("Nem haromszog");
        }

    }
}
