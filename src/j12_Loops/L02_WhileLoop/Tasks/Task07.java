package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner oku = new Scanner(System.in);
        int yeniBüyük =0;

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            int sayi = oku.nextInt();

            if (sayi>=yeniBüyük){
                yeniBüyük=sayi;
            }

        }
        System.out.println("en büyük sayi = "+yeniBüyük);

    }


}

