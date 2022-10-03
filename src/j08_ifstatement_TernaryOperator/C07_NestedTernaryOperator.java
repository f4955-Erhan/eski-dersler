package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        /*
        ASK :
        Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
        4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
        Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
        */
        System.out.println("pozitif bir tam sayı giriniz :");
        int sayi = scan.nextInt();

        String sonuc = sayi>999&&sayi<9999 ? "4 basamaklı" :(sayi%2==0? "dört basamaklı olmayan çift sayı":"dört basamaklı olmayan tek sayı.");

        System.out.println("sonuc = " + sonuc);

    }

}
