package j15_Arrays;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
         TASK :
         $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.


         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String para[]=str.split(" ");

        int topDolar =0;
        int topEuro =0;

        for (int i = 0; i < para.length; i++) {

            if (para[i].contains("£")){

                topEuro+=Integer.parseInt(para[i].replaceAll("£",""));


            }else topDolar+=Integer.parseInt(para[i].replaceAll("€",""));

        }
        System.out.println("dolar toplamı"+topDolar+" toplam sterlin = " +topEuro);
    }
}
