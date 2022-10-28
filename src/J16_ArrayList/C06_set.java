package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

        // set(); listin elelmanını istenen indexe update eder.
        ArrayList<String> listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara"));

        listŞehir.set(2,"ervas");

        System.out.println(listŞehir);
        // listŞehir.set(11,"yenidünya"); olmayan index set edilirse RTE vrir.


    }
}
