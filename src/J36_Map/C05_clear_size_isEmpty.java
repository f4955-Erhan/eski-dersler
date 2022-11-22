package J36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.size(); girilen map in entry(giriş:eleman) sayısını return eder
        //map.clear(); girilen map in entry(giriş:eleman) hepsini siler
        //map.isEmpty(); girilen map in entry(giriş:eleman) varlığını kontrol eder boolean return eder boş munun cevabını verir?



        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm = " + hm);
        System.out.println("hm.isEmpty() = " + hm.isEmpty());

    }
}
