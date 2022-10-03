package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //bakiye başlangıç bakiyesi 1000 tl öğrenme , para yatırma ve  çekme çıkış işlemleri yapılan ATM app create ediniz

        System.out.println("bakiyeniz 1000 TL dir");
        System.out.println(" yapacağınız işlemi lütfen tuşlayınız. ");
        System.out.println(" ek hesaplı toplam bakiyeniz ---> 1 ");
        System.out.println(" hesaba para yatırma ---> 2 ");
        System.out.println(" hesaptan para çekme  ---> 3 ");
        System.out.println(" çıkış için ---> 0 ");
        System.out.print("------>   :");


        int bakiye = 1000;
        int ATM = scan.nextInt();

        switch (ATM) {
            case 1:
                System.out.println("(mevcut 1000 TL)+(ek hesaap =2000TL)= 3000 TL bakiyeniz mevcuttur");
                break;

            case 2:
                System.out.println("para yatırma işlemindesiniz");
                System.out.println("yatıracağınız para miktarını giriniz:");
                int yatpara = scan.nextInt();
                bakiye += yatpara;
                System.out.println("bakiyeniz :" + bakiye +" "+"TL dir");

                break;

            case 3:
                System.out.println("para çekme işlemindesiniz!");
                System.out.println("çekilecek para miktarını giriniz :");
                int cekilen = scan.nextInt();
                if (bakiye < cekilen) {
                    System.out.println("dikkat yetersiz bakiye !!!");
                    System.out.println("devam içi--> 1 sonlandırmak için 0 ı tuşlayınız.");
                    String devam = scan.next().toLowerCase();

                    if (devam.equals("1")) {
                        int ekhesap = 2000;
                        int topbakiye = ekhesap + bakiye;
                        bakiye -= cekilen;
                        topbakiye -= cekilen;
                        System.out.println("çekilen tutar= " + cekilen + " " + "ek hesap bakiyenizden kalan= " + (topbakiye));
                        System.out.println("gerçek bakiyeniz :"+" "+ (topbakiye - ekhesap)+" "+"TL dir");

                    } else {
                        System.out.println("işlem sonlandırıldı.");
                    }


                } else {
                    bakiye -= cekilen;
                    System.out.println("kalan bakiyeniz :" + bakiye+" "+"TL dir");

                }
                break;

            case 0:
                System.out.println("çıkış yaaptınız.");
                break;

            default:
                System.out.println("hatalı giriş!!! tekrar deneyiniz.");
                break;


        }
    }
}
