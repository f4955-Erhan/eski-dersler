package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {
        //isEmpty () listin boş olmasını kontrol eder true/false retun eder
        //clear() listin elemanlarını siler
        ArrayList<String> listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara","bayburt","yozgart"));
        System.out.println(listŞehir.isEmpty());// boşmu bakıldı dolu
        listŞehir.clear(); // boşalt dedim
        System.out.println(listŞehir); // baktık boşalmış
        System.out.println(listŞehir.isEmpty());// boşmu kontrol et dedim baktı boşalmış dedi

    }
}
