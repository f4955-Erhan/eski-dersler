package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3 harfli bir isim giriniz : ");
        String isim = scan.next();

        char hrf0 = isim.charAt(0);
        char hrf1 = isim.charAt(1);
        char hrf2 = isim.charAt(2);

        String farklilik = (isim.length() == 3) ? (hrf0 == hrf1 || hrf0 == hrf2 || hrf1 == hrf2) ? "aynı harfler mevcuttur"
                : "farklı harfler mevcuttur " : "hatalı giriş";

        System.out.println(farklilik);


    }
}