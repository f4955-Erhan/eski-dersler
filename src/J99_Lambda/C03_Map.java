package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        ciftKarePrint(sayilar);
        System.out.println();
        tekKüpPrint(sayilar);
        System.out.println();
        ciftKarekokPrint(sayilar);




    }//main sonu

    // Task : Functional Programming ile listin cift elemanlarinin
    // karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer>sayi){

        sayi.stream().//List elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendi
                map(t->t*t).//aakıstaki çift elemanlar karesi alınarak update edildi
                forEach(C01_LambdaExpression::yazdır);//akışta filtrelene çif elemanların karesi alınıp yazdırıldı

    }

    /*
    listin tek elamnlarının küplerinin 1 fazlası
     */

    public static void tekKüpPrint(List<Integer>sayi){

        sayi.stream().//List elemanlar akışa alındı
                filter(t->t%2==1).//akıştaki tek elemanlar filtrelendi
                map(t->t*t*t+1).//aakıstaki tek elemanlar küpü alınarak update edildi
                forEach(C01_LambdaExpression::yazdır);//akışta filtrelene çif elemanların karesi alınıp yazdırıldı

    }
//üsttekinin ikinci yolu
    public static void tekKüpPrint1(List<Integer>sayi){

        sayi.stream().//List elemanlar akışa alındı
                filter(t->t%2==1).//akıştaki tek elemanlar filtrelendi
                map(t->(int)Math.pow(t,3)+1).//aakıstaki tek elemanlar küpü alınarak update edildi
                forEach(C01_LambdaExpression::yazdır);//akışta filtrelene çif elemanların karesi alınıp yazdırıldı

    }

    /*
// Task : Functional Programming ile listin cift elemanlarinin
karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
     */

    public static void ciftKarekokPrint(List<Integer>sayi){

        sayi.stream().//List elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendi
                map(t->(int)Math.sqrt(t)).//aakıstaki tek elemanlar küpü alınarak update edildi
                forEach(C01_LambdaExpression::yazdır);//akışta filtrelene çif elemanların karesi alınıp yazdırıldı

    }

}
