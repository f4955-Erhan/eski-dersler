package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("paralel kenar için 'p' , dikdörtgen için 'd' veya üçgen için 'ü' harfini giriniz : ");
        String tercih = scan.next().toLowerCase().trim();
        System.out.println("taban uzunluğunu giriniz : ");
        int taban = scan.nextInt();
        System.out.println("yüksekliği giriniz : ");
        int yükseklik = scan.nextInt();

        tercihEt(tercih, taban, yükseklik);
    }
    private static void tercihEt(String tercih, int taban, int yükseklik) {
        switch (tercih) {
            case "p":
                paralelAlanBul(taban, yükseklik);
                break;

            case "d":
                dikdörtgenAlanBul(taban, yükseklik);
                dikdörtgenÇevreBul(taban, yükseklik);
                break;

            case "ü":
                üçgenAlanBul(taban, yükseklik);
                break;

            default:
                System.out.println("hatalı işlem!!!");

        }
    }
    private static void üçgenAlanBul(int taban, int yükseklik) {
        int alan = (taban * yükseklik) / 2;
        System.out.println("üçgenin alanı = " + alan);
    }
    private static void dikdörtgenÇevreBul(int taban, int yükseklik) {
        int dÇevre = (2 * taban) + (2 * yükseklik); // 2*(taban+yükseklik) de aynısı...
        System.out.println("dikdörtgen çevre = " + dÇevre);
    }
    private static void dikdörtgenAlanBul(int taban, int yükseklik) {
        int dAlan = taban * yükseklik;
        System.out.println("dikdörtgenin alanı = " + dAlan);
    }
    private static void paralelAlanBul(int taban, int yükseklik) {
        int pAlan = taban * yükseklik ;
        System.out.println("paralel kenar alanı =" + pAlan);
    }


}
