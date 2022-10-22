package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //girilen boyutta kare çarpım tablosu
        System.out.println("lütfen bir sayı giriniz : ");
        int sayi =scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=sayi; j++) {
                System.out.print((i*j)+"  ");

            }
            System.out.println();
        }



    }
}
