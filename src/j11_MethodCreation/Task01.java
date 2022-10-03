package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("birinci sayıyı gitiniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("birinci sayıyı gitiniz : ");
        int sayi2 = scan.nextInt();

        eşitlikKontrolEt(sayi1, sayi2);


    }

    private static void eşitlikKontrolEt(int a, int b) {

        if (a == b) {
            System.out.println("true");

        } else
            System.out.println("false");
        return ;
    }
}
