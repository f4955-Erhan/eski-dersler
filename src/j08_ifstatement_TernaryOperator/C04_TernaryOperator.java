package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // TASK-> girilen pozitif bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        System.out.println("pozitif bir tam sayı giriniz :");
        int sayi = scan.nextInt();

        String sonuc = sayi >= 10 ? "iki basamaklı ve daha fazla basamaklı" : "tek basamaklı";
        System.out.println("sonuc = " + sonuc);


    }
}
