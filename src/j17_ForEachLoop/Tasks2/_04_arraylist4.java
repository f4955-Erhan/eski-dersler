package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        String s1 = "blue";
        String s2 = "yellow";

        changeInArraylist(renkler, s1, s2);
        System.out.println(changeInArraylist(renkler, s1, s2));
    }

    private static List<String> changeInArraylist(List<String> renkler, String s1, String s2) {
        List<String> yeniRenkler = new ArrayList<>();

        for (String a : renkler) {

            if (a.equalsIgnoreCase(s1)) {
                a = s2;
                yeniRenkler.add(a);
            }else yeniRenkler.add(a);

            //  Collections.replaceAll(renkler,s1,s2);
        }
        return yeniRenkler;
    }
}
