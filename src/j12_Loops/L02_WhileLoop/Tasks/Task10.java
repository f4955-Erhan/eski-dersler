package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz : ");
        int sayi = scan.nextInt();


        for (int i = 0; i < sayi; i++) {

            if (i%2==1){
                System.out.print(i+" ");
            }
        }

    }
}
