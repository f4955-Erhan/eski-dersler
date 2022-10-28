package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String>isimListesi=new ArrayList<>(Arrays.asList("erhan","melek","kemal","serpil","canan","ertuğ","kerim","rıza"));

        for (int i = 0; i < isimListesi.size(); i++) {
            if (isimListesi.get(i).toLowerCase().contains("a")){
                isimListesi.remove(i);
            }
        }
        System.out.println("yeni isim listesi "+isimListesi);





    }
}
