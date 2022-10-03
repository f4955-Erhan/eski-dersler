package j10_StringManipulations;

import java.util.Scanner;

public class C08_Equals_equalsIgnoreCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
                /*
                 str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
                */

        String str1 = "Merhaba";
        String str2 = "MerhabA";
        String str3 = "Merhaba ";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str3.equalsIgnoreCase(str1));// false boşluk karakterdir...!!!!


        String s1 = "songul hanım"; // strin pool = gömlek cebi primitive kolay ( çıkan para )
        String s2 = "songul hanım"; // strin pool = gömlek cebi primitive
        String s3 = new String("songul hanım"); // heap memory de saklanır nan primitive.. (cüzdan)
        String s4 = new String("songul hanım"); // heap memory de saklanır nan primitive..


        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3 == s4);//false
        System.out.println(s3.equals(s4));//true








    }
}
