package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scan = new Scanner(System.in);

        int sayilar[] = new int[8];
        int bölünebilenTop = 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i + ". index için lütden sayı giriniz : ");
            sayilar[i] = scan.nextInt();

            if (sayilar[i] % 3 == 0) {
                bölünebilenTop++;
            }
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(bölünebilenTop + " adet sayımız 3 e tam bölünür : ");


    }

}
