package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen array uzunluğu için bir rakam giriniz : ");
        int sayilar[] = new int[7];

        int lenght = 0;
        int tekler[] = new int[7];

       int a=0;
       int b=0;
        for (int i = 0; i < sayilar.length; i++) {

            System.out.println(i + ". index için sayı giriniz: ");
            sayilar[i] = scan.nextInt();

            if (sayilar[i] % 2 != 0) {
                tekler[a]=sayilar[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(tekler));

    }
}
