package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        System.out.println("bir tam sayı giriniz :");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("çift sayı");
        } else System.out.println("tek sayı");


        String sonuc = sayi % 2 == 0 ? ("sayi çift") : "sayi tek";
        System.out.println("sonuc = " + sonuc);


        String işlem = sayi >= 0 ? sayi == 0 ? "nötr" : "pozitif" : "negatif";
        System.out.println("işlem = " + işlem);




    }
}
