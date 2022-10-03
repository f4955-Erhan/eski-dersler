package j04_AritmeticOPerators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);


        System.out.println("iki adet tam sayı giriniz:");

        System.out.println("birinci tam sayı:");
        int a= sc.nextInt();

        System.out.println("ikinci tam sayı:");
        int b= sc.nextInt();

        System.out.println("girmiş olduğunuz tam sayılar toplamı="+(a+b)+"'"+("eder"));


    }
}
