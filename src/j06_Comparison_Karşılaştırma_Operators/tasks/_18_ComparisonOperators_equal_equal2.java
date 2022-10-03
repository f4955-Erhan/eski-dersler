package j06_Comparison_Karşılaştırma_Operators.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner ds = new Scanner(System.in);

        System.out.print("lütfen 1. sayıyı giriniz:");
        double num1 = ds.nextDouble();
        System.out.print("lütfen 2. sayıyı giriniz:");
        double num2 = ds.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        System.out.println("("+num1+"="+num2+")"+"="+(num1==num2));
    }
}
