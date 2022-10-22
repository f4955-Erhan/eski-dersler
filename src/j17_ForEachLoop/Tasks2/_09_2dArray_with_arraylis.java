package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int sayi[][]={{1, 2, 3},{4, 5, 6},{7, 8, 9}};


        ArrayList<Integer>sayilar=new ArrayList<>();


        for (int a[]: sayi) {
            for (int b : a) {

                sayilar.add(b);

            }

        }
        System.out.println(sayilar);





    }
}