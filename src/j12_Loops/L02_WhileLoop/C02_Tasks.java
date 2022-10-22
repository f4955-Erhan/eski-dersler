package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_Tasks {
    public static void main(String[] args) {

        //task 6 girilen sayının faktoriyeli
        Scanner scan = new Scanner(System.in);
        System.out.println("faktoriyel sayı gir : ");
        int sayyi = scan.nextInt();
        int faktoriyel = 1;
        while (sayyi > 0) {

            faktoriyel *= sayyi;
            sayyi--;
        }
        System.out.println(faktoriyel);

        System.out.println("bir tam sayı gir");
        int tamSayi =scan.nextInt();

        toplamYap(tamSayi);
        System.out.println(toplamYap(tamSayi));
    }

    private static int toplamYap(int tamSayi) {
        int toplam =0;
        while (tamSayi>0){

            toplam+=tamSayi%10;
            tamSayi/=10;
        }
        return toplam;
    }
}
