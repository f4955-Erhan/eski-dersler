package j15_Arrays.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen 5 adet sayı giriniz :");

        int sayilar []= new int[5];

        int tersten[]=new int[5];

        for (int i = 0; i < 5 ; i++) {

            System.out.println(i+". index değerini giriniz : ");
            sayilar[i]=scan.nextInt();

            tersten[4-i]=sayilar[i];
        }
        System.out.println("1. hali : "+Arrays.toString(sayilar));
        System.out.println("2. hali : "+Arrays.toString(tersten));
    }
}
