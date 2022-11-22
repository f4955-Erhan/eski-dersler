package j35_Collection.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue call interface olduğu için child class olan LinkedList ve PriorityQueue ile obje üretilir

        Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.

       Constructor secimine göre queue obj özellikleri belirlenir

       FİFO-> first in first out : ilk giren eleman il çıkar,eleman sona eklenirse
         */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("erhan","kemal","ziya","mehmet","ali"));
        System.out.println("q1 = " + q1);
        q1.add("kemal");
        System.out.println("q1 = " + q1);

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("erhan","kemal","ziya","mehmet","ali"));
        System.out.println("q2 = " + q2);
        q2.add("ramazan");
        System.out.println("q2 = " + q2);

        System.out.println("q2.element() = " + q2.element());//ilk elemanı silmeden return eder.
        System.out.println("q2.peek() = " + q2.peek());//baştaki elemanı return eder
        System.out.println("q2.remove() = " + q2.remove());//ilk elemanı siler ve return eder
        System.out.println("q2.poll() = " + q2.poll());//aliden sora başa erhan geldi erhanı siler return eder
        System.out.println("q2.offer(\"ziya\") = " + q2.offer("ziya"));
        //offer  queue collection a eleman ekler . ekleyebildiyse true yoksa false return eder
        // add ile yapıldığında eğer ekleyemez ise exception fırlatır


        /*
        pool ve remove farkı--> eger queue call boş ise remove NoSuchElementException fırlatır
        pool null return eder
         */

        q1.clear();//q1 elemanları silindi
        System.out.println("q1 = " + q1);
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1.remove() = " + q1.remove());









    }
}
