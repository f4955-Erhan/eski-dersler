package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // iki stirng ortak eleamnlarını yazdırınız

        String metin1[] = {"nazım","erhan","kemal","mehmet"};
        String metin2[] = {"msuty","erhan","cemal","mehmet"};
        List<String >metin3=new ArrayList<>();
        for (String ortak :metin1){
            for (String ortak2:metin2) {

               if (ortak.equalsIgnoreCase(ortak2)){
                metin3.add(ortak);
               }
            }
        }
        if (metin3.isEmpty()){

            System.out.println("ortak isim yoktur "+metin3);
        }else System.out.println(metin3);



    }
}
