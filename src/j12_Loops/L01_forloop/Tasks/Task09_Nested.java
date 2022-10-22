package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {

        //girilen boyutta kare çarpım tablosu
        System.out.println("lütfen bir sayı giriniz : ");


        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
