package j13_Break_Continue.HaftanınTaskiii;

import java.util.Random;
import java.util.Scanner;

public class T03_TasKagitMakas {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas


        int gameOver = 3;
        int numberOfFirstWin = 0;
        int numberOfComWin = 0;
        do {
            System.out.println("taş için (T) , kağıt için (K) , makas için (M) yi yazınız. : ");

            System.out.println("1.oyuncu tercihi : ");
            char oyuncu1 = scan.next().toUpperCase().charAt(0);

            computerRandom();


            if ((oyuncu1 == 'T' && computerRandom() == 'T') || (oyuncu1 == 'M' && computerRandom() == 'M') || (oyuncu1 == 'K' &&  computerRandom() == 'K')) {
                System.out.println("üç oyuncuda aynı seçimi yaptı , kimse puan kazanamadı");

            } else if ((oyuncu1 == 'T' && computerRandom() == 'M') || (oyuncu1 == 'K' && computerRandom() == 'T')
                    || (oyuncu1 == 'M' && computerRandom() == 'K')) {
                numberOfFirstWin++;
            } else if ((computerRandom() == 'T' && oyuncu1 == 'M') || (computerRandom() == 'K' && oyuncu1 == 'T')
                    || (computerRandom() == 'M' && oyuncu1 == 'K')) {
                numberOfComWin++;
            } else {
                System.out.println("hata!!!");
            }
            gameOver--;
        } while (gameOver >= 1);
        System.out.println("computer = " + numberOfComWin);
        System.out.println("oyuncu1 : " + numberOfFirstWin);
    }
    private static char computerRandom() {
        int a = ((int) (Math.random() * 3));
        char karar = ' ';
        switch (a) {

            case 0:
                karar = 'T';
                break;
            case 1:
                karar = 'M';
                break;
            case 2:
                karar = 'K';
                break;
        }
        return karar;
    }

}












