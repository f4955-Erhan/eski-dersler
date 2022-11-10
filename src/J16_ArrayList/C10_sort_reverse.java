package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {
    public static void main(String[] args) {
        //Collection.sort(list); verilen listi naturel sıralamaya sokar...
        // Collections.reverse(list); verilen listin trrs sıralamasını return eder .
        ArrayList<String> listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara","bayburt","yozgart"));

        Collections.sort(listŞehir);
        System.out.println(listŞehir);

        Collections.reverse(listŞehir);

        System.out.println(listŞehir);
        // reverse yapmak için sort yapmaya gerek yoktur.




    }
}
