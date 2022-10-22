package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıç ve bitiş değerleri net(bilinen değerler)olan tekrarlarda
        forloop ama adım sayısı belli olmayıp bir şarta ya da duruma bağlı olan durumlarda whileloop kullanılır
         */
        // task--> 11 den 20 ye kadar olan tam sayıları print eden cedo

        for (int i = 11; i < 21; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        int sayi = 11;
        while (sayi < 21) {
            System.out.print(sayi + " ");
            sayi++;


        }
        System.out.println();

        //tas2 javacanı 7 kere yazdır
        int a = 1;

        while (a < 8) {

            System.out.println(a + " javacan");
            a++;
        }

        int say = 11;
        while (say < 100) {

            System.out.print(say + " ");
            say += 2;


        }
        //Task 4 girilen metni while ile tersten print eden code create ediniz.
        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.print("kelime giriniz :");

        String kelime = scan.nextLine();

        int başlama = kelime.length();

        while (başlama <= 1) {

            System.out.println(kelime.charAt(başlama - 1));
            başlama--;

        }
        System.out.println("tam sayı giriniz : ");
        int giriş = scan.nextInt();
        int toplam = 0;
        while (0 < giriş) {

            toplam += giriş;
            giriş--;
        }
        System.out.print(toplam + " ");

        //task 6 girilen sayının faktoriyeli

        System.out.println("faktoriyel sayı gir : ");
        int sayyi = scan.nextInt();
        int faktoriyel =1;
        while (sayi>0){

            faktoriyel*=sayyi;
            sayyi--;

        }
        System.out.println(faktoriyel+" ");
    }
}
