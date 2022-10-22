package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1. tam sayıyı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2. tam sayıyı giriniz");
        int sayi2 = scan.nextInt();
        int büyükSayi ;
        int kücükSayi;
        if (sayi1>sayi2){
            büyükSayi=sayi1;
            kücükSayi=sayi2;

        }else {
            büyükSayi =sayi2;
            kücükSayi=sayi1;
        }


        for (int i = kücükSayi+1; i < büyükSayi; i++) {

            System.out.print(i+", ");
        }

        System.out.println("********");

        while ((kücükSayi+1)<büyükSayi){

            kücükSayi++;
            System.out.print(kücükSayi+", ");

        }

    }
}
