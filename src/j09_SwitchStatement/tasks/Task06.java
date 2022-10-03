package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.print("VIP kısaltmasınının harf açılımı için kısaltma harfini giriniz : ");

        String harf = scan.next().toUpperCase();

        switch (harf) {

            case "V":
                System.out.printf("Very");
                break;

            case "I":
                System.out.printf("Important");
                break;

            case "P":
                System.out.printf("Person");
                break;

            default:
                System.out.println("hatalı giriş!!");
                break;


        }
    }
}
