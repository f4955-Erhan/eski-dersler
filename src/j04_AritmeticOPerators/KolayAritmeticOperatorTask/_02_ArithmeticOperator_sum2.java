package j04_AritmeticOPerators.KolayAritmeticOperatorTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        System.out.println("lütfen birinci sayıyı giriniz : ");
        int sayi1= scanner.nextInt();

        System.out.println("lütfen ikinci sayıyı giriniz : ");
        int sayi2= scanner.nextInt();

        System.out.println("lütfen üçüncü sayıyı giriniz : ");
        int sayi3= scanner.nextInt();

        System.out.println("lütfen dördüncü sayıyı giriniz : ");
        int sayi4= scanner.nextInt();

        System.out.println(sayi1+sayi2+sayi3+sayi4);

    }
}
