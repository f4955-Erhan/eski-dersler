package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        getSum(sayilar);
        System.out.println(getSum(sayilar));
    }

    private static Integer getSum(List<Integer> sayilar) {
        int toplam = 0;
        for (int a: sayilar) {
            toplam+=a;

        }
        return toplam;
    }
}
