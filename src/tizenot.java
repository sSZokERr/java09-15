import java.util.Random;

public class tizenot {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        int[] tomb = new int[25];
        for (int i = 0; i<24; i++){
            tomb[i]=rnd.nextInt(101-0);
        }
        for (int k = 0; k<tomb.length; k++){
            if (k%2!=0){
                System.out.println(tomb[k]*tomb[k]);
            }
        }

    }
}
