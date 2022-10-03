package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        /*
        TASK ->Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("ehliyetiniz var mı?: var ise='E' yok ise='H' yazınız:");
        char ehliyet = scan.nextLine().toUpperCase().charAt(0);

        if (ehliyet == 'E') {
            System.out.println("kaç yıl tecrübeniz var yıl olarak giriniz");
            int tecrübe = scan.nextInt();
            if (tecrübe >= 7) {
                System.out.println("lütfen mesafe giriniz km cinsinden:");
                double mesafe = scan.nextDouble();
                if (mesafe >= 100000) {
                    System.out.println("kontak anahtarınızı buyurun.");
                } else System.out.println("mesafeniz:" + (100000 - mesafe) + "km eksik");
            } else System.out.println("tecrübeniz:" + (7 - tecrübe) + "yıl eksik");
        } else if (ehliyet == 'H') {
            System.out.println("önce ehliyet alınız");
        } else System.out.println("eksik ya da yanlış tuşlama yaptınız");


    }
}
