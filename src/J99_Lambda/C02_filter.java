package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElStructured(sayilar);
        System.out.println();
        printCiftElFunctional(sayilar);
        System.out.println();
        printCiftElFunctional2(sayilar);
        System.out.println();
        printCiftElFunctional3(sayilar);
    }

    public static void printCiftElStructured(List<Integer>sayilar){//amele method

        for (Integer w:sayilar) {
            if (w%2==0){

                System.out.print(w+" ");
            }
        }
    }

    public static void printCiftElFunctional(List<Integer>sayilar){

        sayilar.stream().filter(t->t%2==0).forEach(C01_LambdaExpression::yazdır);

    }//amele method}

    public static void printCiftElFunctional2(List<Integer>sayilar){

        sayilar.stream().//list eleman akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akısdaki list elemanları çift olma şartına göre filtrelendi
                forEach(C01_LambdaExpression::yazdır);//C01 Class daki yazdır method refere(call) edildi

    }//amele method}

    /*
//Task : "Functional Programming":cincix code kullanarak list elemanlarının
 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
     */

    public static void printCiftElFunctional3(List<Integer>sayilar){

        sayilar.stream().filter(C01_LambdaExpression::otuzBeşdenKucuk).
               // filter(t->t<35&&t%2==0).forEach(C01_LambdaExpression::yazdır);
                filter(C01_LambdaExpression::ciftMi).forEach(C01_LambdaExpression::yazdır);
    }


    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk veya  çiftlerini
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.





}
