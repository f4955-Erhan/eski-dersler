package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */
   static List<String>meyveler=new ArrayList<>(Arrays.asList("elma","muz","portakal","mandalina","kivi","elma","portakal"));

    public static void main(String[] args) {
        System.out.println("portakal listimizde kaç adet = "+getCount(meyveler, "portakal"));

    }
    public static int getCount(List<String> meyveler, String portakal) {
        int adet = 0;
        for (String a:meyveler) {
            if (a.equalsIgnoreCase("portakal")){
               adet++;
            }
        }
        return adet;
    }
}
