package j04_AritmeticOPerators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("saat ve dakika girerek saniye hesaplama");


        System.out.println("saati giriniz=");
        int s = scan.nextInt();

        System.out.println("dakika giriniz");
        int d = scan.nextInt();

        System.out.println("saniye giriniz");
        int sn = scan.nextInt();

        System.out.println(s+"saat+" + d+"dakika"+"+"+sn+"saniye="+((s*3600)+(d*60)+(sn))+"saniye eder.");

    }

}
