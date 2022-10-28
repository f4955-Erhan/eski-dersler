package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {
    public static void main(String[] args) {
        ArrayList<String> listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara","bayburt","yozgart"));

        // sublist();  listeden istenen parçayı return eder.

        System.out.println(listŞehir.subList(2, 5));

        ArrayList<String>yeniList=new ArrayList<>(listŞehir.subList(2,6));

        System.out.println(yeniList);


    }
}
