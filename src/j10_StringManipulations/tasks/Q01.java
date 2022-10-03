package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir kelime yahut cümle yazınız... : ");

        String yazi = scan.nextLine();

        String bosluk = " ";


        System.out.println(yazi.contains(bosluk));


        if (yazi.contains(bosluk)) {
            System.out.println("boşluk karakteri mevcuttur");
        } else
            System.out.println("boşluk karakteri gayr-i mevcut");


    }
}

