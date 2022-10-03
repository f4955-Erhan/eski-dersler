package j08_ifstatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*********indirim sorgulama*******");

        System.out.println("ürün adedi giriniz:");
        int adet = sc.nextInt();

        System.out.println("liste fiyatını giriniz:");
        double listefiyat = sc.nextDouble();

        System.out.println("müşteri kartınız var mı?:Evet='E' yahut Hayır='H'");
        char kart = sc.next().toUpperCase().charAt(0);

        if (kart == 'E') {
            if (adet > 10) {
                System.out.println("%20 indirim ile ücret:" + ((listefiyat * adet) - (listefiyat * adet * 0.20)) + "Tl dir.");
            } else
                System.out.println("%15 indirimle ile ücret:" + ((listefiyat * adet) - (listefiyat * adet * 0.15)) + "Tl dir.");
        } else if (adet > 10) {
            System.out.println("%15 indirimle ile ücret:" + ((listefiyat*adet) - (listefiyat * adet * 0.15)) + "Tl dir.");

        } else System.out.println("%10 indirimle ile ücret:" + ((listefiyat*adet) - (listefiyat * adet * 0.10)) + "Tl dir.");

    }


}


