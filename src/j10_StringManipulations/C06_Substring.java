package j10_StringManipulations;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */

        String str="java bilen sırtı yere gelmez";

        String yeniStr = str.substring(10);
        System.out.println(str.substring(10));

        String sonOnkrktr = str.substring(str.length()-10);
        System.out.println(sonOnkrktr);

        //ilk on karakteri yazdır.
        System.out.println(str.substring(0, 10));

        //ilk karakteri yazdır.
        str.substring(0,1);
        System.out.println(str);

        // girilen 4 harfli kelimeyi terseten yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle yahut kelime giriniz : ");

        String kelime= scan.next();

        if (kelime.length()!=4){
            System.out.println("4 harfli kelime giriniz lütfen !!!");
        }else {
            System.out.print(kelime.substring(3));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1) );




        }





    }
}
