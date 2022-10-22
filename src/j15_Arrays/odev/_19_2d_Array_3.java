package j15_Arrays.odev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String metin [][]={{"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};

        for (int i = 0; i < metin.length; i++) {
            for (int j = 0; j < metin[i].length; j++) {

                if (metin[i][j].equals("ohio")){

                    metin[i][j]="Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(metin));


    }
}

