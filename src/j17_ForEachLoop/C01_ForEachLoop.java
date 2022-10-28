package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        /*
        for-each loop for loop un gelişmiş halidir
         1) clean code- yazım kolaylığı
         2)code okuma kolaylığı
         3)hata yapma riski azalır
         */

        List<Integer> sayilist = new ArrayList<>(Arrays.asList(16, 5, 2, 33, 22, 27, 41, 24));

        for (Integer a : sayilist) {
            System.out.print(a + " ");
        }

        //ilk üç eleman hariç

        for (Integer b : sayilist.subList(3, sayilist.size())) {

            if (b % 2 == 1) {

                System.out.println(b + " ");
            }

        }

        // 2ile 5 index elemanların toplmı
        int toplam = 0;
        for (Integer c : sayilist.subList(2, 6)) {
            toplam += c;

        }
        System.out.println(toplam);
    }
}
