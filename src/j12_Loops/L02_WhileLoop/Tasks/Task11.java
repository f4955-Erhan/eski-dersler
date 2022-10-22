package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int aded = 0;
        int sayi;

        do {
            System.out.println("lütfen bir sayı giriniz : ");
            sayi = scan.nextInt();
            toplam += sayi;
            aded++;

        } while (sayi != 0);
        System.out.println("girilen " + aded + " sayının toplamı = " + toplam);


    }
}
