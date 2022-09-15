import java.util.Scanner;

public class tiyennegz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy szót");
        String be = sc.nextLine();
        System.out.println("Mit szeretne csinálni?");
        System.out.println("Nagy betűs (NB), Kis betűs (KB), Hossza (HO), Összehasonlítás (ÖH), Egy részét kiíratni (EK), Kilépni (KI)");
        while (sc.nextLine() == "ki"){

            System.out.println("Nagy betűs (NB), Kis betűs (KB), Hossza (HO), Összehasonlítás (ÖH), Egy részét kiíratni (EK), Kilépni (KI)");
            if (be == "NB"){
                System.out.println(be.toUpperCase());
            }else if (be == "KB") {
                System.out.println(be.toLowerCase());
            }else if (be == "HO"){
                System.out.println(be.length());
            }else if (be == "ÖH"){
                System.out.println("Második szöveg: ");
                String be2 = sc.nextLine();

            }else if (be == "EK"){
                System.out.println("Hanyadik karaktertől kezdje?");
                int egy = sc.nextInt();
                System.out.println("Hanyadik karakterig írja ki?");
                int ketto = sc.nextInt();
                System.out.println(be.substring(egy-1, ketto-1));
            }

        }
    }
}
