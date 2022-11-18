package j10_StringManipulations.tasks.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        String name1="Ali";
        String name2="Mert" ;
        String name3="Yılmaz";

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3 kelime bir isim giriniz : ");
        String isim = scan.nextLine().trim().toUpperCase();


        if (isim.indexOf(" ") != isim.lastIndexOf(" ")) {
            String sonHali = isim.charAt(0) + "." + isim.charAt(isim.indexOf(" ") + 1) +"."+isim.charAt(isim.lastIndexOf(" ") + 1)+".";
            System.out.println("isim kısaltması = " + sonHali);

        }else System.out.println( "lütfen 3 kelimelik isim giriniz. !!!");
        */

        // ***************2.yol ************!!!!


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3 kelime bir isim giriniz : ");
        String isim = scan.nextLine().trim().toUpperCase();


        if (isim.indexOf(" ") != isim.lastIndexOf(" ")) {

            char isim1= isim.charAt(0);
            char isim2= isim.charAt(isim.indexOf(" ")+1);
            char isim3=isim.charAt(isim.lastIndexOf(" ")+1);

            System.out.println("isim son hali : "+isim1+"."+isim2+"."+isim3+".");


        } else System.out.println("hata lütfen 3 kelimelik isim giriniz. !!!");


    }
}
