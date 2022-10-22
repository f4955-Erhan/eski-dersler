package j13_Break_Continue.HaftanınTaskiii;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz : ");
        int num = scan.nextInt();
        PowersofTwo(num);
        System.out.println("sayımız = " + num + "  2 nin kuvvti midir = " + PowersofTwo(num));
    }
    private static boolean PowersofTwo(int num) {
        boolean a = true;
        for (int i = 2; i <= num; i *= 2) {

            if (num % i == 0) {
                a = true;

            } else
                a = false;
        }
        return a;
    }
}

