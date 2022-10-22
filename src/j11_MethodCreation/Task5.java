package j11_MethodCreation;

import java.io.BufferedReader;
import java.util.Scanner;

/* Iki kisinin oynayacagi bir kelime oyunu uretelim
 * Kurallar
 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
 *
 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
 *        ve 3.adima gecin
 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
 *        kazandigini yazip oyunu bitirin
 *
 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
 *          basa mi sona mi ekleyecegini sorun
 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
 *
 *      *   Devam etmek istemezse
 *          "Oyun bitti" yazin
 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
 */
public class Task5 {

    static Scanner Scan = new Scanner(System.in);
    static int oyuncu;
    static int oyuncu1 = 0;
    static int oyuncu2 = 0;
    static String kelime;
    static String kelimeEk = "";

    public static void main(String[] args) {
        System.out.println("kelime oyununa hoş geldiniz başlangıç 1. oyuncuyla olacaktır : ");
        oyuncu = oyuncu1;
        oyun();

    }

    public static void oyun() {
        System.out.println("sayın oyuncu lütfen kelime giriniz : ");
        kelime = Scan.next().toUpperCase().trim();

        kelimeKarar();

    }

    private static void kelimeKarar() {
        System.out.println("kelime = " + kelime + " kelimesini kabul ediyorsanız 'evet' etmiyorsanız 'hayır' yazınız ...");
        String cevap = Scan.next().trim().toUpperCase();
        switch (cevap) {
            case "EVET":
                oyuncu1 += kelime.length();
                OyunKarar();
                break;

            case "HAYIR":
                System.out.println("oyun bitti !!!! ");
                System.out.println("oyuncu1 =" + oyuncu1 +" "+"oyuncu2"+oyuncu2);
                break;

            default:
                System.out.println("hatalı giriş !!!");
                oyun();
        }
    }

    private static void OyunKarar() {
        System.out.println("eğer oyuna devam etmek istiyorsanız 'evet' yoksa 'hayır' yazınız :");
        String karar = Scan.next().toUpperCase().trim();

        switch (karar) {
            case "EVET":
                eklem();
                break;

            case "HAYIR":
                System.out.println("oyuncu1 =" + oyuncu1 +" "+"oyuncu2 = "+oyuncu2);

                break;

            default:
                System.out.println("hatalı giriş!!!");
                OyunKarar();

        }

    }

    private static void eklem() {
        System.out.println("kelime başa mı -->1 sona mı --->2 eklensin!! ");
        int tercih = Scan.nextInt();
        switch (tercih) {
            case 1:
                kelimeEk = kelime + kelimeEk;
                System.out.println("yeni kelimemiz = " + kelimeEk);
                sıraOyuncu();
                break;

            case 2:
                kelimeEk += kelime;
                System.out.println("yeni kelimemiz = " + kelimeEk);
                sıraOyuncu();
                break;

            default:
                System.out.println("hatalı giriş tekrarlayınız!!!");
                eklem();


        }


    }

    private static void sıraOyuncu() {
        System.out.println(" sıradaki oyuncuyu seçiniz 1 , 2  ");
        int sıra = Scan.nextInt();
        switch (sıra) {
            case 1:
                oyuncu = oyuncu1;
                oyun();
                break;

            case 2:
                oyuncu = oyuncu2;
                oyun();
                break;

            default:
                System.out.println("hata!!!");
                sıraOyuncu();

        }


    }
}
