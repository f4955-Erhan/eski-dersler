package j15_Arrays.odev;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */


        String eskiCümle = "Hello World";

        String yeniCümle[]=eskiCümle.split("");

        for (int i = 0; i < yeniCümle.length; i++) {

            if (yeniCümle[i].equals("o")){

                yeniCümle[i]="K";
            }
        }

        System.out.println(Arrays.toString(yeniCümle)+yeniCümle.length);

    }
}