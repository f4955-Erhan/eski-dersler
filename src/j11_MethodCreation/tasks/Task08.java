package j11_MethodCreation.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz : ");
        int yil= scan.nextInt();

        artikYilBul(yil);
        System.out.println("arık yıl mıdır? cevap = "+artikYilBul(yil));
    }

    private static boolean artikYilBul(int a) {

        // System.out.println(a % 100 == 0 && a % 400 == 0 && a % 4 == 0 ? (true) : (false));

        boolean artikyil = (a % 100 != 0 && a % 400 == 0 && a % 4 == 0 ? (true) : (false));

        return artikyil;



    }
}
