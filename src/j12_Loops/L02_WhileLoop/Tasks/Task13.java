package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        boolean x = true;
        System.out.println(" bir tuş karakterine gizlenen 'JAVATARI' bulalım .");
        do {

            System.out.println("lütfen bir adet tuşlama yaparak enter tuşuna basınız : ");
            char aranan = scan.next().charAt(0);

            if (aranan == 'x') {
                System.out.println("JAVATAR");
                break;


            } else System.out.println("JavaCAN");

        } while (x);

    }
}
