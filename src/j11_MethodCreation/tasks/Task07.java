package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("üçüncü sayıyı giriniz : ");
        int sayi3 = scan.nextInt();

        küçükSayiyiBul(sayi1, sayi2, sayi3);

        System.out.println(küçükSayiyiBul(sayi1, sayi2, sayi3));

    }
    private static String küçükSayiyiBul(int a, int b, int c) {

        String sonuç = (a < b && a < c) ? ("en küçük sayı birinci sayıdır: " + a) : (b < a && b < c) ? ("en küçük sayı ikinci sayıdır: " + b) : ("en küçük sayı üçüncü sayıdır:" + c);

        return sonuç;
    }


}

