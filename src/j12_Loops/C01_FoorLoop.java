package j12_Loops;

import java.util.Scanner;

public class C01_FoorLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen faktoriyel sayısını giriniz : ");
        int sayi = scan.nextInt();

        faktoriyel(sayi);
        System.out.println(sayi+"! = "+faktoriyel(sayi));
    }

    private static int faktoriyel(int sayi) {

        int faktoriyel =1;

        if (sayi>0){
            for (int i = 1; i <=sayi ; i++) {

                faktoriyel*=i;

            }

        }
return faktoriyel;

    }
}