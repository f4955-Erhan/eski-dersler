package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // kullanıcıdan alınan değerlerle int array create ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("kaç elemanlı array istirsen ");
        int arrBoyut =scan.nextInt();

       int arr[]=new int[arrBoyut];
        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i+". elemanı giriniz :");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));



        for (int i = arr.length-1; i <= 0 ; i--) {

            System.out.print(arr[i] + " ");

        }

    }
}
