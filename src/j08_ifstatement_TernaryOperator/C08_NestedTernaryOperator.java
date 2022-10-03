package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
 /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
              %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */
        System.out.println("indirimli fiyat hesaplama");

        System.out.println("ürün miktarı giriniz");
        int urunmiktar = scan.nextInt();

        System.out.println("ürün fiyatı giriniz");
        int urunfiyat = scan.nextInt();

        double fatura =urunmiktar>100? (urunmiktar*urunfiyat-(urunfiyat*urunmiktar*0.33)) :(urunfiyat*urunmiktar);

        System.out.println("fatura = " + fatura);


    }
}
