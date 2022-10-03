package j04_AritmeticOPerators.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("çiftlikteki hayvanların toplam ayak sayısını hesaplama");

        System.out.println("lütfen inek sayısını giriniz:");
        int i = sc.nextInt();

        System.out.println("lütfen koyun sayısını giriniz:");
        int k = sc.nextInt();

        System.out.println("lütfen tavuk sayısını giriniz:");
        int t = sc.nextInt();

        System.out.println("çiftlikteki hayvanların toplam ayak sayısı="+((i*4)+(k*4)+(t*2)));

    }

}
