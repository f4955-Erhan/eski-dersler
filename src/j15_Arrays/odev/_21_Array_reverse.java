package j15_Arrays.odev;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        int sayi = 123;

        String yeniSay[] = Integer.toString(sayi).split("");
        System.out.println(Arrays.toString(yeniSay));
        for (int i = yeniSay.length-1 ; i >=0; i--) {

            System.out.print(yeniSay[i]);
            
        }
    }
}


