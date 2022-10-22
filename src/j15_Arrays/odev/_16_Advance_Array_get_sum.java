package j15_Arrays.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */


        String euro = "€12 €23 €10 €2 €5 €2";

        String değişim= euro.replaceAll("€","");

        String euroArr[]=değişim.split(" ");
        System.out.println(Arrays.toString(euroArr));

        int sayTop=0;
        for (int i = 0; i < euroArr.length; i++) {

            sayTop+=Integer.parseInt(euroArr[i]);

        }
        System.out.println(sayTop);
    }
}