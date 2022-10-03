package Home_Work;

import java.util.Scanner;

public class Çalışma2 {
    public static void main(String[] args) {

        Scanner giriş = new Scanner(System.in);

        int secim;

        System.out.println("bir seçim yapınız 1-2-3 =");
        secim = giriş.nextInt();

        switch (secim) {
            case 1:
                System.out.println("A kitapçığı");
                break;
            case 2:
                System.out.println("b kitapçığı");
                break;
            case 3:
                System.out.println("c kitapçığı");
                break;
            default:
                System.out.println("hatalı seçim yaptın aga");

    }
}}
