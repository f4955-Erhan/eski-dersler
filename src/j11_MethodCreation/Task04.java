package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        secim();
    }

    public static void secim() {

        System.out.println("seç bakem");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiye();
                break;

            case 2:
                paraYatır();
                break;

            case 3:
                paraçek();
                break;

            case 4:
                çıkış();
                break;

            default:
                System.out.println();
        }
    }
    private static void çıkış() {
        System.out.println("by by");
    }

    private static void paraçek() {
        System.out.println("çekilecek miktarı giriniz : ");
        int çekilecekMiktar= scan.nextInt();
        if (çekilecekMiktar<= bakiye){

            bakiye-=çekilecekMiktar;
            System.out.println("işlem tamam kalan bakiye : "+bakiye);

        }else System.out.println("bakiye yetersiz");

        karar();
    }

    private static void paraYatır() {
        System.out.println("yatırılacak miktar giriniz :");
        int yatırılacakmiktar= scan.nextInt();
        bakiye+=yatırılacakmiktar;

        System.out.println("top bakiye : "+bakiye);

        karar();
    }

    private static void bakiye() {

        System.out.println("bakiyeniz : " + bakiye);

        karar();
    }

    public static void karar() {
        System.out.println("işleme devam etmek için 1 çıkış için 0");

        int karar = scan.nextInt();

        if (karar == 1) {
            secim();

        } else if (karar==0){

          çıkış();

        }else System.out.println("hatalı giriş");

    }


}
