package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String>listÜlke=new ArrayList<>(List.of("alamanya","mlata","malta","yunanistan"));
        ArrayList<String>listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara"));

        //nCopies(int,obj);  int elemanlı bir obj oluşan list ataması yapar.
        ArrayList<String>yeniList=new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println(yeniList);

        //addAll();bir listeyi diğer listeye olduğu gibi ekler

        listÜlke.addAll(listŞehir);//ülkelerin kuyruğuna şehirler eklendi

        System.out.println(listÜlke);

        listŞehir.addAll(3,listÜlke);

        System.out.println(listŞehir);

        //task--> 1 den 10 a kadar sayıları bir liste atayıp prin eden

        ArrayList<Integer>sayi=new ArrayList<>();

        for (int i = 1; i <=10; i++) {

            sayi.add(i);

        }

        System.out.println(sayi);


    }
}
