package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int rakam = rand.nextInt(100);
        int deneme = 0;

        System.out.println("1 ile 100 arasında bir sayı giriniz");
        int sayi = scan.nextInt();

        while (sayi != rakam) {

            if (sayi < rakam) {
                System.out.println("sayınız = "+sayi+" ---> sayiyi büyütelim !!!");
                System.out.println("sayinizi kaç artırmak istersiniz : ");
                int artan = scan.nextInt();
                sayi += artan;

            } else if (sayi > rakam) {
                System.out.println("sayınız = "+sayi+" ---> sayiyi küçültelim !!!");
                System.out.println("sayinizi kaç azaltmak istersiniz : ");
                int azalan = scan.nextInt();
                sayi -= azalan;


            } else {
                System.out.println("hatalı giriş !!!");

            }
            deneme++;
        }


        System.out.println("doğru tahmin sayımız : " + rakam + " kaçıncı tahminde bulduk =" + (deneme+1));

    }
}


