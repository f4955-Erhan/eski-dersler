package j04_AritmeticOPerators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("saniyeyi dakika ve saate çevirmek için lütfen 'saniye' giriniz:");

        int sn= sc.nextInt();

        System.out.println(sn+" saniye ="+(sn / 3600)+"saat"+","+((sn%3600)/60)+"dakika"+","+(sn%60)+"saniye eder");




    }
}
