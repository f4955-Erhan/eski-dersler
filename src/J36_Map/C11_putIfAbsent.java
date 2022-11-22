package J36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.putIfAbsent(); girilen key mapte yoksa entry(key,value) map e ekler ve null return eder
        //var ise eğer  key e ait value yi return eder

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.putIfAbsent(\"Ebay\",\"234 Euro\") = " + hm.putIfAbsent("Ebay", "234 Euro")); //234 Euro

        System.out.println("hm.putIfAbsent(\"ebik\",\"gabık\") = " + hm.putIfAbsent("ebik", "gabık")); // null return ve ekledi

        System.out.println("hm = " + hm);


    }
}
