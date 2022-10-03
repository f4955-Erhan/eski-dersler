package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi yazınız : ");
        String isim = scan.nextLine().trim().toUpperCase();

        System.out.println("soyisim yazınız : ");
        String soyIsim = scan.next().trim().toUpperCase();

        System.out.println("16 haneli kart numaranızı aralarında boşluk bırakmadan giriniz : ");
        String kartNo = scan.next().trim();

        String yeniIsim = isim.charAt(0) + isim.substring(1, isim.indexOf(" ")).replaceAll("\\w", "*") + " "
                + isim.charAt(isim.indexOf(" ") + 1) + isim.substring(isim.indexOf(" ") + 2).replaceAll("\\w", "*");
        String yeniSoyIsim = soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\w", "*");

        String yeniKartNo = kartNo.substring(0,12).replaceAll("\\w","*") + kartNo.substring(12);

        System.out.println(yeniIsim+" "+yeniSoyIsim);
        System.out.println(yeniKartNo);



    }
}
