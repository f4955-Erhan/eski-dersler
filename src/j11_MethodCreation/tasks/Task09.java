package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir saat giriniz : ");
        int saat = scan.nextInt();

        saniyeBul(saat);
    }

    private static void saniyeBul(int s) {

        int saniye = (s*60)*60;
        System.out.println(s+" saat "+saniye+" saniyedir.");

    }
}
