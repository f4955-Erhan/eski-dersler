package j11_MethodCreation.tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */
public class Task15UcusProject {
    static Scanner scan = new Scanner(System.in);
    static double BşehirFiyat = 500 * 0.10;
    static double CşehirFiyat = 700 * 0.10;
    static double DşehirFiyat = 900 * 0.10;

    public static void main(String[] args) {
        System.out.println("uranüs turizme hoş geldiniz");
        seçimSehir();

    }

    private static void seçimSehir() {
        System.out.println("lütfen gideceğiniz şehri seçiniz : B , C , D  : ");
        String sehir = scan.next().toUpperCase().trim();


        switch (sehir) {
            case "B":
                Byön();
                break;

            case "C":
                Cyön();
                break;

            case "D":
                Dyön();
                break;

            default:
                System.out.println("hatalı işlem !!!");
                seçimSehir();


        }
    }

    private static void Dyön() {
        System.out.println("lütfen tarife seçiniz : \ntek yön için 1 giriniz. \ngidiş dönüş için 2 giriniz");
        int yön = scan.nextInt();
        if (yön == 1) {
            tekyönDhesap();

        } else if (yön == 2) {
            gidişDönüşDhesap();
        } else {System.out.println("lütfen seçiminizi doğru yapınız !!! ");
        Dyön();}
    }

    private static void gidişDönüşDhesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((DşehirFiyat * 2) - (DşehirFiyat * 2) * 0.50) * 0.20);

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((DşehirFiyat * 2) - (DşehirFiyat * 2) * 0.10) * 0.20);

        } else if (yas >= 65) {
            System.out.println(((DşehirFiyat * 2) - (DşehirFiyat * 2) * 0.30) * 0.20);

        } else if (yas < 65 && yas > 24) {
            System.out.println((DşehirFiyat * 2) * 0.80);

        } else{ System.out.println("hata !!!! :");
        gidişDönüşDhesap();}

    }

    private static void tekyönDhesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((DşehirFiyat) - (DşehirFiyat) * 0.50));

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((DşehirFiyat) - (DşehirFiyat) * 0.10));

        } else if (yas >= 65) {
            System.out.println(((DşehirFiyat) - (DşehirFiyat) * 0.30));

        } else if (yas < 65 && yas > 24) {
            System.out.println(DşehirFiyat);

        } else System.out.println("hata !!!! :");{
        gidişDönüşDhesap();}
    }


    private static void Cyön() {
        System.out.println("lütfen tarife seçiniz : \ntek yön için 1 giriniz. \ngidiş dönüş için 2 giriniz");
        int yön = scan.nextInt();
        if (yön == 1) {
            tekyönChesap();

        } else if (yön == 2) {
            gidişDönüşChesap();
        } else {System.out.println("lütfen seçiminizi doğru yapınız !!! ");
        Cyön();}
    }

    private static void gidişDönüşChesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((CşehirFiyat * 2) - (CşehirFiyat * 2) * 0.50) * 0.20);

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((CşehirFiyat * 2) - (CşehirFiyat * 2) * 0.10) * 0.20);

        } else if (yas >= 65) {
            System.out.println(((CşehirFiyat * 2) - (CşehirFiyat * 2) * 0.30) * 0.20);

        } else if (yas < 65 && yas > 24) {
            System.out.println((CşehirFiyat * 2) * 0.80);

        } else { System.out.println("hata !!!! :");
        gidişDönüşChesap();}

    }

    private static void tekyönChesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((CşehirFiyat) - (CşehirFiyat) * 0.50));

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((CşehirFiyat) - (CşehirFiyat) * 0.10));

        } else if (yas >= 65) {
            System.out.println(((CşehirFiyat) - (CşehirFiyat) * 0.30));

        } else if (yas < 65 && yas > 24) {
            System.out.println(CşehirFiyat);

        } else {System.out.println("hata !!!! :");
        tekyönChesap();}
    }


    private static void Byön() {
        System.out.println("lütfen tarife seçiniz : \ntek yön için 1 giriniz. \ngidiş dönüş için 2 giriniz : ");
        int yön = scan.nextInt();
        if (yön == 1) {
            tekyönBhesap();

        } else if (yön == 2) {
            gidişDönüşBhesap();
        } else{ System.out.println("lütfen seçiminizi doğru yapınız !!! ");
        Byön();}
    }

    private static void gidişDönüşBhesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((BşehirFiyat * 2) - (BşehirFiyat * 2) * 0.50) * 0.20);

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((BşehirFiyat * 2) - (BşehirFiyat * 2) * 0.10) * 0.20);

        } else if (yas >= 65) {
            System.out.println(((BşehirFiyat * 2) - (BşehirFiyat * 2) * 0.30) * 0.20);

        } else if (yas < 65 && yas > 24) {
            System.out.println((BşehirFiyat * 2) * 0.80);

        } else {
            System.out.println("hata !!!! :");
            gidişDönüşBhesap();
        }


    }

    private static void tekyönBhesap() {
        System.out.println("lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 12) {
            System.out.println(((BşehirFiyat) - (BşehirFiyat) * 0.50));

        } else if (yas <= 24 && yas >= 12) {
            System.out.println(((BşehirFiyat) - (BşehirFiyat) * 0.10));

        } else if (yas >= 65) {
            System.out.println(((BşehirFiyat) - (BşehirFiyat) * 0.30));

        } else if (yas < 65 && yas > 24) {
            System.out.println(BşehirFiyat);

        } else {
            System.out.println("hata !!!! :");
            tekyönBhesap();
        }

    }


}




