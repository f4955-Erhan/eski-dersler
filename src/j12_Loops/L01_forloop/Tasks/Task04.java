package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayı giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("2. sayı giriniz : ");
        int sayi2 = scan.nextInt();

        if (sayi1 < sayi2) {
            for (int i = sayi1; i < sayi2; i++) {
                if (i%2==0){
                    System.out.print(i+" ");
                }

            }

        }else System.out.println("hatalı giriş");
    }}