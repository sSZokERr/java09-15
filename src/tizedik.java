import java.util.Scanner;

public class tizedik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;
        int szam = 0;
        while(osszeg <= 100){
            szam=sc.nextInt();
            if (szam % 2 == 0){
                paros++;
            }else {
                paratlan++;
            }
            osszeg+=szam;
        }
        System.out.printf("Parosak szama: %s Paratlanok szama: %s",paros,paratlan);
    }
}
