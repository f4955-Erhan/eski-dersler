package j13_Break_Continue.HaftanınTaskiii;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("topun bırakılacağı yüksekliği girelim : ");
        double yükseklik = scan.nextInt();
        int sekme = 0;
        double hareketMesafe = 0;

        do {
            sekme++;
            hareketMesafe += yükseklik ;
            yükseklik *=((double) 3/4);


        } while (yükseklik >=1);

        System.out.println("topumuzun sekme sayısı : " + sekme + " ve topun aldığı toplam mesafe :" + hareketMesafe);


    }
}
