package J36_Map;

import java.util.HashMap;

public class C03_Get {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.get(key); girilen key değerinin vvaluesini return eder


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Amazon\") = " + hm.get("Amazon"));
        System.out.println("hm.get(\"olmayan\") = " + hm.get("olmayan"));
        System.out.println("hm.get(12) = " + hm.get(12));

    }
}
