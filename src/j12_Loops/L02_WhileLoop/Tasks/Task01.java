package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner scan = new Scanner(System.in);

        int toplam =0;
        int sayiAdet =0;

        do {
            System.out.println("Lütfen sayi giriniz : ");
            int girilenSayi = scan.nextInt();

            toplam+=girilenSayi;
            sayiAdet++;

        }while (toplam < 333);

        System.out.println(sayiAdet+" adet sayinın toplamı = "+toplam);

    }
}
