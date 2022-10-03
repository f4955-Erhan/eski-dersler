package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        int yüzGünSonra = (100 % 7) + kacıncıGun;

        switch (yüzGünSonra) {

            case 1:
            case 8:
                System.out.printf("pazartesi");
                break;
            case 2:
            case 9:
                System.out.printf("salı");
                break;
            case 3:
                System.out.printf("çarşamba");
                break;
            case 4:
                System.out.printf("perşembe");
                break;
            case 5:
                System.out.printf("cuma");
                break;
            case 6:
                System.out.printf("cumartesi");
                break;
            case 7:
                System.out.printf("pazar");
                break;
            default:
                System.out.println("hatalı giriş");
                break;


        }


    }
}

