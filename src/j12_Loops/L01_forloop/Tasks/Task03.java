package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
 /*
Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
sayi!= 1*2*3* ...*sayi
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi = scan.nextInt();

        faktoriyel(sayi);

    }

    private static int faktoriyel(int sayi) {
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;

            System.out.println("faktoriyel = " + faktoriyel);
        }
        return faktoriyel;
    }
}
