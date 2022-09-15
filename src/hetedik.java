import java.util.Scanner;

public class hetedik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hanyadik hónapot írja ki?");
        int honap = sc.nextInt();

        switch (honap) {
            case 1:
                System.out.println("Január, Tél"); break;
            case 2:
                System.out.println("Február, Tél"); break;
            case 3:
                System.out.println("Március, Tavasz"); break;
            case 4:
                System.out.println("Április, Tavasz"); break;
            case 5:
                System.out.println("Május, Tavasz"); break;
            case 6:
                System.out.println("Június, Nyár"); break;
            case 7:
                System.out.println("Július, Nyár"); break;
            case 8:
                System.out.println("Agusztus, Nyár"); break;
            case 9:
                System.out.println("Szeptember, Ősz"); break;
            case 10:
                System.out.println("Október, Ősz"); break;
            case 11:
                System.out.println("November, Ősz"); break;
            case 12:
                System.out.println("December, Tél");
        }
    }
}
