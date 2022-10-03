package j04_AritmeticOPerators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("üç basamaklı bir sayının basamak değerleri için 3 basamaklı bir sayı giriniz:");
        int s= scan.nextInt();

        System.out.println(s+"sayısının 1 ler basamağı="+(s%10));
        System.out.println(s+"sayısının 10 lar basamağı="+((s%100)-(s%10))/10);
        System.out.println(s+"sayısının 100 ler basamağı="+(s/100));




    }
}
