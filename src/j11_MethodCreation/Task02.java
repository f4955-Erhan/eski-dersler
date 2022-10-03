package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //isim soyisim baş harfleri büyüt ve birleştir

        System.out.println("isim giriniz : ");
        String isim = scan.nextLine().toLowerCase().trim();

        System.out.println("soyisim giriniz : ");
        String soyIsim = scan.nextLine().toLowerCase().trim();

        sonHaliGetir(isim,soyIsim);
        System.out.println(sonHaliGetir(isim,soyIsim));



}

    private static String sonHaliGetir(String a, String b) {

        a = a.toUpperCase().charAt(0)+a.substring(1);
        b = b.toUpperCase().charAt(0)+b.substring(1);

        return a+" "+b ;
    }


}
