package j12_Loops.L02_WhileLoop.Tasks;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz : ");
        String metin = scan.nextLine().toLowerCase();

        int harf = 0;
        int rakam = 0;
        int özelKarakter = 0;
        int i = 0;

        do {
            if (metin.charAt(i) >= 97 && metin.charAt(i) <= 122) { //küçük harf Ascii değeri.
                harf++;

            } else if (metin.charAt(i) >= 48 && metin.charAt(i) <= 57) { //asci rakam değeri
                rakam++;
            } else {
                özelKarakter++;
            }
            i++;
        } while (i<=metin.length()-1);

        System.out.println("metinde "+harf+" harf , "+rakam+" rakam ve "+özelKarakter+" özel karakter mevcuttur.");
    }

}
