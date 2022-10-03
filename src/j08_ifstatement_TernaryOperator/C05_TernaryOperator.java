package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek
        // oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner scan=new Scanner(System.in);

        System.out.println("bir tam sayı giriniz :");

        int sayi= scan.nextInt();


        // trick: ternary iki durum true ve false için farklı data type çıktısı veriyorso veriable atama yapmadan sout yapılmalı
        // ya da ternary çıktısı aynı data type strilazision yada cast edilmeli

        String sonuc= sayi%2==0 ? String.valueOf(sayi/2) : "girilen sayı tek sayı olduğu için tam sayı değildir.";
        System.out.println("sonuc = " + sonuc); // 1. çözüm

        System.out.println(sayi%2==0 ? sayi/2 : "girilen sayı tek sayı olduğu için tam sayı değildir." );// 2. çözüm




    }
}
