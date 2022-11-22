package J36_Map;

import java.util.HashMap;

public class C02_keySet_Values {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.keyset(); map key değerleri set e atayıp return eder
        //map.values(); map value değerleri collectiona  atayıp return eder

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");//value dağeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");//Apple store key'deki value 333 Euro iken 500 Euro olarak update etti.
        hm.put("MediaMarkt", "183 Euro");
        //map sout komutuna parametre olarak print edilir...
        System.out.println("hm = " + hm);//{null=222 Euro, Saturn=300 Euro, Ebay=null, Apple store=500 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        // hm key ve value değerlerini satır satır prin ediniz

        for (String key : hm.keySet()) {

            System.out.print(key+" ");
        }
        System.out.println();
        for (String value : hm.values()) {

            System.out.print(value + " ");
        }

    }

}
