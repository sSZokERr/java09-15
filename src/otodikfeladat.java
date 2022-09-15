import java.util.Scanner;

public class otodikfeladat {
    public static void main(String[] args) {
        System.out.println("Teglalap oldalainak hossza:");
        Scanner sc = new Scanner(System.in);
        double elso = sc.nextDouble();
        double masodik = sc.nextDouble();
        sc.nextLine();

        if (elso == masodik){
            System.out.println("Ez egy negyzet");
        }else {
            System.out.print("Terulet (T) vagy Kerulet(K)?");
            String tvk = sc.nextLine();

            if (tvk .equals("t")){
                System.out.printf("A terulete: %f.2",2 * elso * masodik);
            }else if (tvk .equals("k")){
                System.out.printf("A kerulete: %f.2",elso + masodik);
            }
        }
    }
}
