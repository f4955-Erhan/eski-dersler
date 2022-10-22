package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        // Task-> girilen int array değeri tersten print eden code create ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen array için bir uzunluk giriniz : ");
        int a[]=new int[scan.nextInt()];
        int tersten[]=new int[a.length];

        for (int i = 0; i <a.length ; i++) {

            System.out.println(a.length+" adet sayı belirleyelim lütfen "+i+". sayıyı giriniz : ");
            a[i]= scan.nextInt();

             //   tersten[a.length-1-i]=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(tersten));
    }
  
}
