package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
         TASK :
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
         */

        System.out.println("lütfen bir sayı giriniz :");
        int sayi = scan.nextInt();

        String sonuc = sayi>=0? (sayi<10? "rakam" : "pozitif sayı") : "negatif sayı";

        System.out.println("sonuc = " + sonuc);





    }
}
