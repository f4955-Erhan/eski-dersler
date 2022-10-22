package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //girilen bir ifadenin istenen harf sayısını print eden code create ediniz.

        System.out.println("lütfen bir kelime giriniz : ");
        String cumle = scan.nextLine().toLowerCase().trim();

        System.out.println("lütfen bir kelime giriniz : ");
        char harf = scan.next().toLowerCase().charAt(0);

        int harfSayısı = 0;

        for (int i = 0; i <=cumle.length()-1; i++) {
            if (cumle.charAt(i)==harf){

                harfSayısı++;
            }

        }
        System.out.println(harfSayısı);

    }
}
