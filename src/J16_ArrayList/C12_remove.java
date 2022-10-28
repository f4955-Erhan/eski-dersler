package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        //remove() listten istenen elemanı siler.
        ArrayList<String>listÜlke=new ArrayList<>(List.of("alamanya","mlata","malta","yunanistan"));
        ArrayList<String> listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara","bayburt","yozgart"));

        System.out.println(listŞehir.remove("bursa"));
        System.out.println(listŞehir.remove(2));

        System.out.println(listŞehir);

        // tekrarlı eleman varsa ilkini siler.

        //removeAll() tümünü siler

        listŞehir.addAll(listÜlke);
        System.out.println(listŞehir);//ülke list eklendi

        listŞehir.removeAll(listÜlke);
        System.out.println(listŞehir);// şehir list çıakrıldı

    }
}
