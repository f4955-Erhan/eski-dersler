package j10_StringManipulations;

import java.util.Scanner;

public class C11_ValueOf_Parse {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        //task string type verilen 2 adet bağış miktarını topla


        String a = "123a";
        String b ="213";
        String yenia= a.replaceAll("\\D","");

        int yena =Integer.valueOf(yenia);

        int bagisb = Integer.valueOf(b);// String içindeki b bagis değerini integer a atadı.

        System.out.println("toplam bagis = "+(yena + bagisb));






    }
}
