package J36_Map;

import java.util.HashMap;

public class C10_remove {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.remove(); girilen entr mapte varsa siler ve true return eder yoksa false return eder

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.remove(\"Saturn\") = " + hm.remove("Saturn"));// key le de siler

        // key ve value de doğru girilmeli yoksa false return eder silmez.

        System.out.println("hm.remove(\"MediaMarkt\",\"183 Dolar\") = " + hm.remove("MediaMarkt", "183 Dolar"));

        // olmayan key null return eder

        System.out.println("hm.remove(\"ebikGabık\") = " + hm.remove("ebikGabık"));

        System.out.println("hm = " + hm);
    }
}
