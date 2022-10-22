package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir asal sayı giriniz");

        int sayi = scan.nextInt();
        boolean asalMı=true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%2==0){
                asalMı=false;
                break;
            }
        }
        if (asalMı){

            System.out.println("asal sayıdır");

        }else System.out.println("asal değildir");

    }
}
