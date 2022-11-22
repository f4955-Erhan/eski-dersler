package J36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.putAll(map1); girilen map i istenen map e girer



        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        HashMap<String, String> hm1 = new HashMap<>();

        hm.put("erzurum", "cağkebap");
        hm.put("bursa", "tahinli");
        hm.put("kayseri", "pastırma");
        hm.put("van", "otluPeyir");
        hm.put("adana", "kebap");
        hm.put("urfa", "çiğKöfte");

        System.out.println("hm1 = " + hm1);

        hm.putAll(hm1);

        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);

        HashMap<String, String> hm2 = new HashMap<>(hm1);// hm2 isimli boş map a hm1 map i eklendi
        HashMap<String, String> hm3 = hm1;// hm3 isimli boş map a hm1 map i eklendi

        System.out.println("hm2 = " + hm2);
        System.out.println("hm3 = " + hm3);

    }
}
