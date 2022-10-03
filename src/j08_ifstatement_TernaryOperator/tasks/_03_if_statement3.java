package j08_ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen 1. kelime giriniz:");
        String str1= scan.next();
        System.out.println("lütfen 2. kelime giriniz:");
        String str2= scan.next();

        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else System.out.println("str1 is NOT equal to str2");






    }
}
