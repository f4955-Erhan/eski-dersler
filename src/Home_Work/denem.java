package Home_Work;

import java.util.Scanner;

public class denem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen e-mail adresinizi giriniz : ");
        String email = scan.nextLine().trim();

        kaliteKontrol(email);
        System.out.println(kaliteKontrol(email));

    }
    private static boolean kaliteKontrol(String email) {

        boolean kontrol = (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@"))&&
             (email.contains(".") && email.indexOf(".") == email.lastIndexOf("."))&&
                 (email.indexOf("@") > 0);

        return kontrol;


    }
}
