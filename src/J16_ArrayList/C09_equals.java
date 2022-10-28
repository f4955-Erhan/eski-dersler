package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_equals {
    public static void main(String[] args) {

        // iki listin index ve eleman eşitliğine bakar true yada false return eder.

        List<String>list1=new ArrayList<>(Arrays.asList("a","b"));
        List<String>list2=new ArrayList<>(Arrays.asList("A","b"));
        List<String>list3=new ArrayList<>(Arrays.asList("a","b"));

        System.out.println(list1.equals(list2));
        System.out.println(list2.equals(list3));
        System.out.println(list1.equals(list3));


    }
}
