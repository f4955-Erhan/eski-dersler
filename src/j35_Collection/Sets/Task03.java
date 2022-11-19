package j35_Collection.Sets;

import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Task03 {
    public static void main(String[] args) {
        //hashset ve three set tanımlayıp run sürelerini karşılaştırınız
        //Trick run süresi için System.currentTimeMillis() meth call ediniz

        long start1 = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Erhan");
        ts.add("remzi");
        ts.add("rüya");
        ts.add("zalım");
        ts.add("hulya");
        long finis1 = System.currentTimeMillis();

        System.out.println("start1-finis1 = " + (finis1- start1 ));


        long start2 = System.currentTimeMillis();

        HashSet<String> hs = new HashSet<>();
        hs.add("Hakkı");
        hs.add("zülfü");
        hs.add("ramiz");
        hs.add("acar");
        hs.add("reca");

        long finis2 = System.currentTimeMillis();

        System.out.println("start2-finis2 = " + (finis2 -  start2));


        System.currentTimeMillis();


    }
}
