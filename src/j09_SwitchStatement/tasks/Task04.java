package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        System.out.println("************ayların gün sayısı********");
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ay ismi yazınız :");
        String ay = scan.next().toLowerCase();


        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("31 gün çekiyor");
                break;

            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("30 gün çekiyor");
                break;
            case "şubat":
                System.out.println("yılınızı giriniz :");
                int yil = scan.nextInt();
                if (yil % 4 == 0 && yil % 100 == 0 || yil % 400 == 0) {
                    System.out.println("29 çekiyor");
                }else {
                    System.out.println("28 çekiyor");
                }break;
            default:
                System.out.println("hatalı giriş!!!!");
                break;
        }

    }
}
