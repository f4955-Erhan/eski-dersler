package J36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.getOrDefault(); girilen key map te varsa key e ait value yoksa default değer return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        // key varsa valuesi return edilir
        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikGabık\") = " + hm.getOrDefault("Ebay", "ebikGabık"));

        //key yoksa null return edilir
        System.out.println("hm.getOrDefault(\"olmayan\",\"ebikgabık\") = " + hm.getOrDefault("olmayan", "ebikgabık"));
    }
}
