package j17_ForEachLoop;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet sayı gireceksiniz");
        int sayi[] = new int[scan.nextInt()];

        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            System.out.println(i + ". indexi giriniz : ");

            sayi[i] = scan.nextInt();
            toplam += sayi[i];
        }
        System.out.println(toplam);

    }
}
