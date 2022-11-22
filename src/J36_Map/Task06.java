package J36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
/*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */
        Scanner scan = new Scanner(System.in);
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"Lion");
        mp.put(2,"Tiger");
        mp.put(3,"Elephant");
        mp.put(4,"Cat");
        mp.put(5,"Dog");
        System.out.println("agam sayı giresen");
       int sayi = scan.nextInt();
        map1(mp,sayi);
        System.out.println("map1(mp,sayi) = " + map1(mp, sayi));


    }

    private static String map1(Map<Integer, String> mp, int sayi) {

        return mp.get(sayi);
    }
}
