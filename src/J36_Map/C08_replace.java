package J36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.replace(); girilen value deerinin ilgili key de update edilir return eder

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Amazon\",\"300 Euro\") = " + hm.replace("Amazon", "300 Euro"));//296 Euro return ve yeni değeri atar
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"kemal\",\"ebik gabık\") = " + hm.replace("kemal", "ebik gabık"));// null

    }
}
