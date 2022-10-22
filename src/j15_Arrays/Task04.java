package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //girilen bir int array elemanlarından ortalamadan buyuk olan eleman sayısını print eden

        Scanner scan = new Scanner(System.in);
        int toplameleman = 0;
        System.out.println("boyut gir :");
        int elemanlar[] = new int[scan.nextInt()];

        for (int i = 0; i < elemanlar.length; i++) {
            System.out.println(i+". eleman");
            elemanlar[i] = scan.nextInt();
            toplameleman += elemanlar[i];

        }
        System.out.println(Arrays.toString(elemanlar));
        int ortalama =toplameleman/elemanlar.length;

        int ortalamadanBüyük =0;

        for (int i = 0; i <elemanlar.length ; i++) {

            if (elemanlar[i]>ortalama){

                ortalamadanBüyük++;
            }

        }
        System.out.println("elelmanlardan ortalamadan büyük olan  = "+ortalamadanBüyük);




    }
}
