
import java.util.Random;
import java.util.Scanner;

public class nyolcas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fej(0) vagy iras(1)?");
        int tipp = sc.nextInt();

        //int rand = (int)(Math.random() * 2);

        Random rnd = new Random();
        int rand = rnd.nextInt(2);

        if (rand == tipp){
            System.out.printf("Eltalaltad! %s",rand);
        }else {
            System.out.printf("Nem nyert! %s",rand);
        }
    }
}


//Haromlabu operator
// (logikai feltetel) ? ertek ha igaz : feltetel ha hamis
