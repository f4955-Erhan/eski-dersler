package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*
        girilen stringin son karakterini silen kod yazınız
         */

        System.out.println("bir yazı giriniz.");
        String kelime = scan.nextLine();

        System.out.println(kelime.substring(0, kelime.length() - 1));










    }
}
