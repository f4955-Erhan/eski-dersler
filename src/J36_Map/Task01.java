package J36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
// task -> urun fiyatları toplamını hesaplayan code create ediniz..
 int count= 0;
 int count1= 0;

        for ( Map.Entry<String,Integer> a:map.entrySet()){

            count+=a.getValue();
        }

        for ( Integer w:map.values()){

            count1+=w;
        }

        System.out.println("count = " + count);
        System.out.println("count1 = " + count1);


    }
}
