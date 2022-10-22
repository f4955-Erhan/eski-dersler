package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("kaç elemanlı array istirsen ");

      //  int arrBoyut =scan.nextInt();

        int arr[]=new int[scan.nextInt()];//boyutu belirlenmemiş boş array
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". elemanı giriniz :");
            arr[i]=scan.nextInt();

            toplam+=arr[i];
        }
        System.out.println(toplam);


    }
}
