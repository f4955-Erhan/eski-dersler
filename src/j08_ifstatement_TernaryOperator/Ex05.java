package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        /*
        TASK -> girilen iki sayının verilen dört işlemden birine uygulayan kod
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz:");
        double sayi1 = scan.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        double sayi2 = scan.nextInt();

        System.out.println("bir işlem tercih ediniz:'+' için: 1,'-' için: 2,'/'için: 3,'*' için: 4");
        int işlem = scan.nextInt();

        if (işlem == 1) {
            System.out.println(sayi1 + sayi2);
        } else if (işlem == 2) {
            System.out.println(sayi1 - sayi2);

        } else if (işlem == 3) {
            System.out.println(sayi1 / sayi2);

        } else if (işlem == 4) {
            System.out.println(sayi1 * sayi2);
        } else System.out.println("doğru giriş yapınız.");


    }
}
