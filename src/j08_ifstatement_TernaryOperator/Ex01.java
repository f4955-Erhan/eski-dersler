package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("bir tam sayı giriniz:");
        int sayi1 = sc.nextInt();

        if (sayi1 < 0) {
            System.out.println("sayı negatiftir");
        } else if (sayi1 > 0) {
            System.out.println("sayı pozitiftir");

        } else System.out.println("sayı sıfıra eşittir");


    }
}
