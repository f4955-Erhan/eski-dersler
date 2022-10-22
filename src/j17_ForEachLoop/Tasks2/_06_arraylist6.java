package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(List.of(5, 4, 6, 2, 1));
        hillNum(sayilar);
        System.out.println(hillNum(sayilar));
    }
    private static List<Integer> hillNum(List<Integer> sayilar) {
        List<Integer> koşulSayı = new ArrayList<>();
        for (int i = 1; i < sayilar.size() - 1; i++) {
            if (sayilar.get(i) < sayilar.get(i - 1) && sayilar.get(i) > sayilar.get(i + 1)) {
                koşulSayı.add(sayilar.get(i));
            }
        }
        return koşulSayı;
    }
}
