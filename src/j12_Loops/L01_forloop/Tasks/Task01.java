package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {


        System.out.println("lütfen 100 den küçük bir tam sayı giriniz");
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();
        if (sayi < 100) {
            for (int i = 1; i < 2; i++) {

                if (sayi % 5 == 0 && sayi % 3 == 0) {
                    System.out.println("java Can");
                } else if (sayi % 5 == 0) {
                    System.out.println("Can");
                } else if (sayi % 3 == 0) {
                    System.out.println("Java");

                } else {
                    System.out.println(i + "hiçbir şartı sağlamayan sayı");

                }


            }


        }


    }


}
