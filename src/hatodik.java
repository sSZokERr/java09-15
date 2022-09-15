import java.util.Scanner;

public class hatodik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mennyi pontot sikerült elérned? ");
        int pont = sc.nextInt();
        if (pont < 42){
            System.out.println("Elégtelen");
        }else if(pont <= 57 && pont >=43) {
            System.out.println("Elégséges");
        } else if (pont <=72 && pont >= 58) {
            System.out.println("Közepes");
        } else if (pont <= 87 && pont >= 73) {
            System.out.println("Jó");
        }else {
            System.out.println("Jeles");
        }
    }
}
