package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop_Task {
    public static void main(String[] args) {
        //girilen sayı 17 den küçük ise kazandınız büyük ise kaybettiniz
        Scanner scan = new Scanner(System.in);
  /*      System.out.println("sayi gir : ");
        int sayi = scan.nextInt();

        if (sayi < 17) {
            do {
                System.out.println("kazandınız...");
                sayi++;
            } while (sayi < 17);
            System.out.println("kaybettiniz");
        } else System.out.println("kaybettin");
*/
        System.out.println("kalan canınızı giriniz");
        int can =scan.nextInt();
        do {
            System.out.println("kalan canınız"+can);
            tecih(can);


        } while (can > 0);

    }

    private static int tecih(int can) {
        Scanner scan =new Scanner(System.in);

        System.out.println("iki yol var birinci yol için true ikinci yol için false");
        boolean a =scan.nextBoolean();


        if (true){
            can++;
        }can--;

        return can ;
    }

}
