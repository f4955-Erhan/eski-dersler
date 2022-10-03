package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchStatement {
    public static void main(String[] args) {
        // girilen ay numarasına göre kaç gün çektiğini prin eden
        Scanner scan = new Scanner(System.in);

        System.out.println("bir ayı sayı olarak giriniz");

        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 gün çekiyor");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 gün çekiyor");
                break;
            case 2:
                System.out.println("yılınızı giriniz :");
                int yil = scan.nextInt();
                if (yil % 4 == 0 && yil % 100 == 0 || yil % 400 == 0 ){
                System.out.println("yıl 29 çekiyor");
            }else {
                    System.out.println("28 çeker");
                }


        }
    }
}
