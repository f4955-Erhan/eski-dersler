package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

        //kullanıcıdan veeri almak için 3 adım takip edilir
        //1.adım : Scanner Classtan obje create edilir !! ezberle

        Scanner scan = new Scanner(System.in);
/*
        // 2. adım : kullanıcıdan istnen veri için bildirim (sout)

        System.out.println("adınızı giriniz:");

        //3.adım : kullanıcının girdiği veri data type ine göre veriable atılır.

        String isim =scan.nextLine();
        //kullanıcıdan gelen string tipinde isim verisi scan objesi nextline metoduyla atandı

        System.out.println("isim = " + isim);


        System.out.print("karenin kenar değerini giriniz:");

        int kenar = scan.nextInt();

        System.out.println("alan=" +(kenar*kenar) + "çevre=" +(kenar*4));
*/
        /*
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
                 Output : Yilda 12.41 kg seker kullaniyorsunuz

        System.out.println("günlük içtiğniz çay sayısını giriniz :");//çay için 2 adım
        int caySayisi=scan.nextInt();//çay için 3 adım

        System.out.println("şeker sayinizi giriniz : "); // şeker için 2. adım
        int seker=scan.nextInt();// seker için 3 adım

        System.out.println("yıllık seker tüketiminiz : "+(caySayisi*seker*1.7*365)/1000+"kg");
*/

        System.out.println("isminizi giriniz");
        char ch= scan.nextLine().charAt(0);
        System.out.println("isminizin ilk karakteri= " + ch);

        /*
        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);
        */





    }
}
