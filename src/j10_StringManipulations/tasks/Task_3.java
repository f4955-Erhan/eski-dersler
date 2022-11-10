package j10_StringManipulations.tasks;

import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 1. isminizi giriniz : ");
        String isim1 = scan.next().toUpperCase().trim();

        System.out.println("lütfen 2. isminizi giriniz yoksa 0 yazarak devam ediniz : ");
        String isim2 = scan.next().toUpperCase().trim();

        System.out.println("lütfen soyisminizi giriniz : ");
        String soyIsim = scan.next().toUpperCase().trim();

        System.out.println("lütfen 16 haneli kart numaranızı giriniz : ");
        String kartno = scan.next().trim();

        String yeniIsim1 = isim1.charAt(0)+ isim1.substring(1).replaceAll("\\w", "*");
        String yeniIsim2 = isim2.charAt(0) + isim2.substring(1).replaceAll("\\w", "*");
        String yeniSoyIsım = soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\w", "*");
        String yeniKArtNo = kartno.substring(0, 12).replaceAll("\\d", "*") + kartno.substring(12);


        if (isim2.length() >= 2 && isim2.equals("0") != true  ){

            System.out.println("İsim : " + yeniIsim1 + " " + yeniIsim2 + "\nSoyisim : " + yeniSoyIsım + " \nKart NO : " + yeniKArtNo);

        } else if (isim2.equals("0") == true) {
            System.out.println("İsim : " + yeniIsim1 + "\nSoyisim : " + yeniSoyIsım + " \nKart NO : " + yeniKArtNo);

        } else System.out.println("hatalı giriş yaptınız!!!");

       //indexof (" ")+1


    }


}

