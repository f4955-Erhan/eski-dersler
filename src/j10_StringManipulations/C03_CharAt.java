package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index deki char değerini return eder.
        index değeri 0 dan başlar.
         */
        String sehir = "İstanbul";
        System.out.println(sehir.charAt(5));

        char besinciIndexKrktr = sehir.charAt(5);

        System.out.println("besinciIndexKrktr = " + besinciIndexKrktr);

        // son index karakteri

        System.out.println(sehir.charAt(sehir.length() - 1));

        //ilk index

        System.out.println(sehir.charAt(0));

        //System.out.println(sehir.charAt(10)); RTE verir index aşımı

        //task istanbul kelimesinin ortasındaki karakteri print eden


        //**********************kelimenin yerini girdim

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime = scan.nextLine().toUpperCase();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("kelimenin ortası mevcut değil");




    }
}
