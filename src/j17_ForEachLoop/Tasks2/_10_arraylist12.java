package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(List.of(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));

        rangeBtw(sayilar);
        System.out.println("bu aralıkta toplam sayı adedi "+rangeBtw(sayilar));

    }
    private static int rangeBtw(List<Integer> sayilar) {

        int count = 0;

        for (int a : sayilar) {

            if (a>=20&&a<=30){
                count++;
            }
        }
        return count;
    }


}