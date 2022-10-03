package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwittchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //task = girilen haftanın gününü hafta içi veya sonu olduğunu print eden
        System.out.println("haftanın gününü giriniz:");
        String gün = scan.next().toLowerCase();

        switch (gün) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("hatalı giriş");
                break;
        }
    }
}
