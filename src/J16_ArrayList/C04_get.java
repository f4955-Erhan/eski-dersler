package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_get {
    public static void main(String[] args) {

        // get() listte istenen elemanı return eder..

        ArrayList<String> listÜlke=new ArrayList<>(List.of("alamanya","cibuti","malta","yunanistan"));
        ArrayList<String>listŞehir=new ArrayList<>(List.of("bursa","sivas","erzurum","ankara"));

        System.out.println(listŞehir.get(3));

        System.out.println(listŞehir.get(11));// olmayan elamanı çağırırsak RTE hatası verir.

    }
}
