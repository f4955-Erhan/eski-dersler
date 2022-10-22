package j15_Arrays.odev;

import java.util.Arrays;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        int sayilar[] = {12, 14, 21, 23, 10, 4};

        int toplamSayilar =0;

        for (int i = 0; i < sayilar.length; i++) {
            toplamSayilar+=sayilar[i];
        }
        System.out.println(Arrays.toString(sayilar)+" array sayılarının ortalaması = "+toplamSayilar/sayilar.length);
    }
}