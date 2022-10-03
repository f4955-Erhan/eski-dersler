package j08_ifstatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz:" + " ");
        int sayi1 = sc.nextInt();

        System.out.println("ikinci sayıyı giriniz:" + " ");
        int sayi2 = sc.nextInt();

        System.out.println("üçüncü sayıyı giriniz:" + " ");
        int sayi3 = sc.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("en büyük sayı=" + sayi1 + "en küçük" + sayi3);
            } else
                System.out.println("en büyük sayı=" + sayi1 + "en küçük sayı=" + sayi2);


        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println("en büyük sayı=" + sayi2 + "en küçük" + sayi3);
            } else
                System.out.println("en büyük sayı=" + sayi2 + "en küçük sayı=" + sayi2);

        } else System.out.println("en büyük sayı=" + sayi3 + "en küçük sayı=" + sayi1);

    }


}


