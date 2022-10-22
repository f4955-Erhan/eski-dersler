package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        List<String>kelimeler=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        getLength(kelimeler);
        System.out.println(getLength(kelimeler));
    }

    private static List<Integer> getLength(List<String> kelimeler) { //buradaki List<Integer> list return ediyoruz diye
        List<Integer>uzunluklar=new ArrayList<>();
        for (String uzunluk:kelimeler) {

           uzunluklar.add(uzunluk.length()) ;
        }
        return uzunluklar;
    }
}