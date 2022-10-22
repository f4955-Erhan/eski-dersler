package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // equals() metodu index ve value kontrolu yapar true false return eder..

        int sayi1[] = {12, 43, 454, 21, 4, 2};
        int sayi2[] = {43, 454, 12, 4, 2, 21};

        System.out.println(Arrays.toString(sayi1));
        System.out.println(Arrays.toString(sayi2));

        System.out.println(Arrays.equals(sayi1, sayi2));

        Arrays.sort(sayi1);
        Arrays.sort(sayi2);

        System.out.println(Arrays.toString(sayi1));
        System.out.println(Arrays.toString(sayi2));

        System.out.println(Arrays.equals(sayi1, sayi2));

        //array i stringe çevirme toStrin(arr) verilen arr i string data type döndürür

        int rakamlar[]={1,2,3,4,5};
        String str = Arrays.toString(rakamlar);// bu şekilde array i stringe atadık ancak köşeli parantezler, boşluk ve virgül dahil

        System.out.println("ra = "+str);// [1,2,3,4,5]
        System.out.println(str.substring(6));
    }
}
