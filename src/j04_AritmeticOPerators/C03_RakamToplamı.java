package j04_AritmeticOPerators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" üç basamaklı bir sayı giriniz:");
        int sayi= sc.nextInt();

        int birler=sayi%100;
        sayi/=10;
        int onlar = sayi%10;
        int yüzler =sayi/10;

        System.out.println("birler basamağı="+birler+"/n adfa");



    }
}
