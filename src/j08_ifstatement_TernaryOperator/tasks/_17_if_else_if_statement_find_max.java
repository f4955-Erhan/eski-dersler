package j08_ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("i1 değeri:");
        int i1 = scan.nextInt();
        System.out.println("i2 değeri:");
        int i2 = scan.nextInt();
        System.out.println("i3 değeri:");
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1>i2 && i1>i3) {
            System.out.println("en büyük sayı ="+" "+i1);
        } else if (i2>i1 && i2>i3) {
            System.out.println("en büyük sayı ="+" "+i2);

        } else if (i3>i1 && i3>i2) {
            System.out.println("en büyük sayı ="+" "+i3);

        } else if (i1==i2&& i1>i3) {
            System.out.println("en büyük sayı="+" "+i1+","+i2);

        } else if (i1==i3 && i1>i2) {
            System.out.println("en büyük sayı"+" "+i1+","+i3);

        }else System.out.println("en büyük sayı"+" "+i2+","+i3);


    }
}
