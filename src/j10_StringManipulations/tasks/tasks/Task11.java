package j10_StringManipulations.tasks.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       // !!!!!!!!! ayrıca ilk harfleri büyük yazalım.!!!!!!!! ekstra.
       */

        Scanner scan = new Scanner(System.in);

        System.out.print("isim ve soyisminizi giriniz : ");
        String nameSurname = scan.nextLine().trim().toLowerCase();

        String name =nameSurname.toUpperCase().charAt(0)+nameSurname.substring(1,nameSurname.indexOf(" "));

        String surname = nameSurname.toUpperCase().charAt(nameSurname.indexOf(" ")+1)+nameSurname.substring(nameSurname.indexOf(" ")+2);

        System.out.println("Name : "+name);
        System.out.println("Surname : "+surname);




    }
}
