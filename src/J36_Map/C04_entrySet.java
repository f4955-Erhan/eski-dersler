package J36_Map;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.entrySet(); girilen map in key value tum datalarını return eder
        //keyler unıque olduğu için tekrarlı olmaz


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.entrySet() = " + hm.entrySet());
                       //< key , value>
        for (Map.Entry<String, String>e :hm.entrySet()) {

            System.out.print("e.getValue() = " + e.getValue()+", ");
        }






        }

    }

