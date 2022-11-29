package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
        /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        //lambda-> stream API

        maxElemanBul(sayilar);

    }
    /*
    listin çift elemanlarının kaelerinin en büyüğünü print ediniz.
     */

    public  static  void maxElemanBul(List<Integer> sayilar) {

        Optional<Integer> maxEleman= sayilar.//optional null değer atama riskine karşı datacast int için
                stream().//akış başladı
                        filter(C01_LambdaExpression::ciftMi).//filreleme yapıldı
                        map(t->t*t).//karesi alındı
                        reduce(Math::max);//filtrelenip karesi alınan eleamnların max elamana göre reduce azaltıldı
                        //reduce(Integer::max);//specific class daha hızlı çalışır

        System.out.println(maxEleman);
    }



}
