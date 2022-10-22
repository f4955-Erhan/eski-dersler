package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print(((i == j) ? 1 : 0)+" ");
            }
            System.out.println();
        }



    }
}
