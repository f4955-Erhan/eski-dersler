package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        //indexof(); lsite içerisinde istenen elemanın index değerini return eder

        ArrayList<String> listÜlke=new ArrayList<>(List.of("alamanya","cibuti","malta","yunanistan"));
        ArrayList<String>listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara"));

        System.out.println(listÜlke.indexOf("malta"));//2
        System.out.println(listÜlke.indexOf("Zamba"));// -1 lsitede olmayan eleman indexi -1 return eder.

        listÜlke.add("cibuti");

        System.out.println(listÜlke);
        System.out.println(listÜlke.indexOf("cibuti"));// tekrarlı elemanlarda ilk sıra indexteki elemanı return eder.


        System.out.println(listÜlke.lastIndexOf("cibuti")); //tekrarlı elemanlardan sondan index geitir.


    }
}
