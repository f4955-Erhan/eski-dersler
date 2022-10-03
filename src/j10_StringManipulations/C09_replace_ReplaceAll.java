package j10_StringManipulations;

import java.util.Scanner;

public class C09_replace_ReplaceAll {
    public static void main(String[] args) {


        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         *

         */

        Scanner scan = new Scanner(System.in);

        String str1 = "bir güldür güldürür bir gündür soldurur...";

        String yenistr1 = str1.replace("gül","kül");

        String yenistr2 = str1.replace('g','k');

        System.out.println(yenistr1);
        System.out.println(yenistr2);

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        String yenistr3 = str1.replaceFirst("ü","u");
        System.out.println("yenistr3 = " + yenistr3);


             // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
             //1-replace() methodu char kabul eder ama replaceAll kabul etmez
             //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        String cumle = "sağ salim 46 lik dunya halim";

       String yenicumle = cumle.replaceAll("\\s","€");
       String yenicumle2 = cumle.replaceAll("\\S","€");
       String yenicumle3 = cumle.replaceAll("\\w","€");
       String yenicumle4 = cumle.replaceAll("\\W","€");
       String yenicumle5 = cumle.replaceAll("\\d","€");
       String yenicumle6 = cumle.replaceAll("\\D","€");

        System.out.println(yenicumle);
        System.out.println(yenicumle2);
        System.out.println(yenicumle3);
        System.out.println(yenicumle4);
        System.out.println(yenicumle5);
        System.out.println(yenicumle6);

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        System.out.println("lütfen isim giriniz : ");
        String isim = scan.nextLine();

        System.out.println("lütfen soyisim giriniz: ");
        String soyİsim = scan.nextLine();

        System.out.println("16 haneli kart numaranızı giriniz : ");
        String kartNumarası = scan.next();

        String yeniIsim = isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyIsim = soyİsim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniKartNo= "**** **** **** "+kartNumarası.substring(12);

        System.out.println("İsim : " +yeniIsim+" "+"Soyisim : "+yeniSoyIsim +"\n"+"kart numarası : "+yeniKartNo);


    }
}
