package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

          /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
        boolean basarılı = true;
       // string başarı=basarılı; doğal uyum olmayan veriable larda CTE hatsı verir.

        double d=17;
        System.out.println("d = " + d);

        int sayi1=33;
        int sayi2=7;
        System.out.println("sayi1/sayi2 = "  +sayi1 / sayi2 ) ;

        //java iki int sayıyı bölerken ondalık sonuç çıkarsa ondalık kısmı siler.

        byte b=127;
        int i = b ;

        System.out.println("i = " + i);

        int num = 354;
        double d1=17;

        System.out.println("d1 = " + d1);
        
        double db=d1/num;
        System.out.println("db = " + db);
        
        //iki farklı data type sayi işleme girerse java küçük olan data type türü için aw yapar sonucu büyük olan 
        //-data type olarak verir

        double d2=12.53;
        int num2= (int) d2;
        System.out.println("num2 = " + num2);
        
        int a=150;
        byte h= (byte) a;

        System.out.println("h = " + h);


        Scanner scan = new Scanner(System.in);

        System.out.println("ascıı değeri için bir karakter giriniz");
        char ch= scan.next().charAt(0);

        int chr= ch;

        System.out.println(ch+"ascıı değeri = " + chr);


    }
}
