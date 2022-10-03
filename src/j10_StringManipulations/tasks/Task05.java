package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isim giriniz : ");
        String name = scan.nextLine();

        System.out.println("lütfen soyiisim giriniz :");
        String surname = scan.nextLine();

        String yeniName = name.toUpperCase().charAt(0)+name.substring(1);

        String yenisurname =surname.toUpperCase().charAt(0)+surname.substring(1);

        System.out.println(yeniName+ " " +yenisurname);





    }
}
