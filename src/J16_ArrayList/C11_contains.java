package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        // contains () istenen elemanın varlığını kontrol eder
        ArrayList<String> listSehir = new ArrayList<>(List.of("bursa", "sivas", "erzurum", "ankara", "bayburt", "yozgart"));

        System.out.println(listSehir.contains("bursa"));
        System.out.println(listSehir.contains("zmada"));


    }
}
