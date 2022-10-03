package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        girilen stringdeki istnen
         */

        System.out.println("bir cümle giriniz :");
        String str = scan.nextLine();
        System.out.println("index giriniz :");
        int index = scan.nextInt();

        if (str.length()>index ){
            System.out.println(str.substring(index, index + 1));
        }else System.out.println("girdiğiniz metinde olmayan index" );


    }

}
