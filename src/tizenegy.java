import java.util.Scanner;

public class tizenegy {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("N értéke: ");
        int N = sc.nextInt() + 1;
        // Számok összeadása 1-től N-ig
        int out = 0;
        for (int i = 1; i < N; i++) {
            out = out + i;
        }
        // Kiírás
        System.out.println("Összeg: " + out);



    }
}