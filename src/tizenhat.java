import java.util.Scanner;

public class tizenhat {
    public static Scanner sc = new Scanner(System.in);
    public static int[] tomb = new int[5];
    public static void main(String[] args) {
        System.out.println("16. feladat");

        for (int i = 0; i < tomb.length; i++) {
            float index = i + 1;
            System.out.printf("Tömb %.0f. eleme: ", index);
            tomb[i] = sc.nextInt();
        }
        System.out.println("Elemek megadási sorrendben:");
        for (int i = 0; i < tomb.length; i++) {
            int index = i + 1;
            System.out.println(index + ". elem: " + tomb[i]);
        }
        System.out.println("Elemekvisszafelé");
        for (int i = 4; i >= 0; i--) {
            int index = i + 1;
            System.out.println(index + ". elem: " + tomb[i]);
        }
        tizenhat.indexBekeres();
    }
    public static void indexBekeres() {

        System.out.println("Kiírandó elem (1-5):");
        int index = sc.nextInt();
        if (index < 1 || index > 5) {
            tizenhat.indexBekeres();
        } else {
            System.out.println(tomb[index - 1]);
        }

    }
}