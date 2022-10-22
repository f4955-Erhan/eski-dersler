package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //girilen tam sayıyı tam bölen sayıyı prin edin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int girilenSayi= scan.nextInt();
        int bölenSayi =1;
        int top =0;
        while (girilenSayi>bölenSayi){

            if (girilenSayi%bölenSayi==0){
                top++;
            }
            bölenSayi++;
        }
        System.out.println(girilenSayi+" sayısının "+top+" böleni var... ");

    }
}
