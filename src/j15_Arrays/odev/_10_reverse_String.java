package j15_Arrays.odev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String kelime = "Hello World";

        String kelime1[]=kelime.split("");

        String tersKelime="";

        for (int i = kelime1.length-1; i >=0 ; i--) {

           tersKelime+=kelime1[i];

        }
        System.out.println(tersKelime);
    }
}