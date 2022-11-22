package J36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.cotainsKey(); girilen key deerinin map de varlığını kontrol eder boolean return eder
        //map.cotainValue(); girilen value deerinin map de varlığını kontrol eder boolean return eder



        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));//true
        System.out.println("hm.containsKey(\"Kemal\") = " + hm.containsKey("Kemal"));//false

        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));//true
        System.out.println("hm.containsValue(\"155 dolar\") = " + hm.containsValue("155 dolar"));//false


    }
}
