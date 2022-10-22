package j12_Loops.L01_forloop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        System.out.println("0 ile 100 arası sayı giriniz : ");
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        if (sayi<=100&&sayi>=0){
            for (int i = sayi; i <100 ; i++) {
                if (sayi%4==0){
                    System.out.println(i+" ");
                }

            }

        }else System.out.println("sayıyı 0 ie arasında giriniz");

    }
}
