package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */

        System.out.println("ltfen pasword giriniz  : ");
        String kelime = scan.nextLine();

        if (kelime.charAt(0)>='A' && kelime.charAt(0)<='Z' && kelime.charAt(kelime.length()-1)>='0'
                &&kelime.charAt(kelime.length()-1)<='9'&&kelime.length()>=6)
        {
            System.out.println("password geçerli");

        }else System.out.println("geçersiz password");





    }
}
