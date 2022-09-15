import java.util.Scanner;

public class tizenketto {
    public static Scanner sc = new Scanner(System.in);
    public static void feladat12(){

        System.out.println("12. feladat");
        System.out.println("Összeg:");
        int osszeg = sc.nextInt();
        int osszegCalc = osszeg;
        if (0 > osszeg || osszeg >= 1000){
            tizenketto.feladat12();
        }
        // 1000 500 200 100 50 20 10 5
        short ezres = 0;
        short otszazas = 0;
        short ketszazas = 0;
        short szazas = 0;
        short otvenes = 0;
        short huszas = 0;
        short tizes = 0;
        short otos = 0;
        // ezres
        while(osszegCalc / 1000 >= 1){
            osszegCalc = osszegCalc - 1000;
            ezres++;
        }
        //otszazas
        while(osszegCalc / 500 >= 1){
            osszegCalc = osszegCalc - 500;
            otszazas++;
        }
        //ketszazas
        while(osszegCalc / 200 >= 1){
            osszegCalc = osszegCalc - 200;
            ketszazas++;
        }
        //szazas
        while(osszegCalc / 100 >= 1){
            osszegCalc = osszegCalc - 100;
            szazas++;
        }
        //otvenes
        while(osszegCalc / 50 >= 1){
            osszegCalc = osszegCalc - 50;
            otvenes++;
        }
        //huszas
        while(osszegCalc / 20 >= 1){
            osszegCalc = osszegCalc - 20;
            huszas++;
        }
        //tizes
        while(osszegCalc / 10 >= 1){
            osszegCalc = osszegCalc - 10;
            tizes++;
        }
        //otos
        while(osszegCalc / 5 >= 1){
            osszegCalc = osszegCalc - 5;
            otos++;
        }
        if (osszegCalc > 0){
            otos++;
        }
        System.out.println(osszeg + " kifizethető\n" + ezres + "db 1000-essel,\n" + otszazas + "db 500-assal,\n" + ketszazas + "db 200-assal,\n" + szazas + "db 100-assal,\n" + otvenes + "db 50-essel,\n" + huszas + "db 20-assal,\n" + tizes + "db 10-essel,\n" + otos + "db 5-össel.");


    }
}