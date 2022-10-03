package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        System.out.println("işlem seç + , - ,* , / :");
        char işlemSeç = scan.next().charAt(0);

        System.out.println("1. sayi gir : ");
        double sayi1 = scan.nextDouble();

        System.out.println("2. sayi gir : ");
        double sayi2 = scan.nextDouble();

        islemMenu(işlemSeç, (int) sayi1, (int) sayi2);


    }

    private static void islemMenu(char işlemSeç, int sayi1, int sayi2) {

        switch (işlemSeç) {
            case '+':
                topla(sayi1, sayi2);
                break;
            case '-':
                çıkart(sayi1, sayi2);
                break;
            case '*':
                çarp(sayi1, sayi2);
                break;
            case '/':
                böl(sayi1, sayi2);
                break;
            default:
                System.out.println("hatalı giriş aga");
        }
    }

    private static void böl(int a, int b) {
        System.out.println("a/b = " + (a / b));
    }

    private static void çarp(int a, int b) {
        System.out.println("a*b = " + (a * b));
    }

    private static void çıkart(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }

    private static void topla(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }


}








