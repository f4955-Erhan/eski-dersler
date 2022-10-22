package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("eleman uzunlugu giriniz");
        int[] elSa=new int[scanner.nextInt()];

        int []tersten=new int[elSa.length];

        for (int i = 0; i <elSa.length ; i++) {
            System.out.println("eleman giriniz");
            elSa[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(elSa));


        for (int i = elSa.length-1; i >=0 ; i--) {
            tersten[i]=elSa[i];
        }
        System.out.println(Arrays.toString(tersten));




    }
}
