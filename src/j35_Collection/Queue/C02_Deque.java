package j35_Collection.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque: double ended Queue -> Queue larde FİFO  deque larda ise hem FİFO hem LİFO geçerlidir.
        yani ilk giren ilk çıkar -> FİFO
        son giren ilk çıakr -> LİFO
         */

        Deque<String>dq1=new LinkedList<>(Arrays.asList("küşleme","önkol","böbrek yatağı","ezme","haydari"));
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.add(\"humus\") = " + dq1.add("humus"));
        System.out.println("dq1 = " + dq1);//insertion order LinkedList olduğu için

        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//silmeden ilk elemanı verir
        System.out.println("dq1.peekLast() = " + dq1.peekLast());//islmeden son elemanı verir

        /*
        get first method boş listi NoSuchElementException fırlattırır
        method deque collection peek method ise null return eder
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        //System.out.println("dq1.getFirst() = " + dq1.getFirst());//NoSuchElementException


        Deque<String>dq2=new LinkedList<>(Arrays.asList("kek","borek","kete","gumuç","kartol"));
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());

        dq2.clear();
        System.out.println("dq2 = " + dq2);

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());


    }
}
