package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        secondMax(sayilar);
        System.out.println(secondMax(sayilar));
    }

    private static List<Integer> secondMax(List<Integer> sayilar) {
        List<Integer> maxİki = new ArrayList<>();

        Collections.sort(sayilar);

        maxİki.add(sayilar.get(sayilar.size() - 2));

        return maxİki;
    }

}


