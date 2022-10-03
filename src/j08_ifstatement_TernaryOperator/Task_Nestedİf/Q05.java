package j08_ifstatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner sc = new Scanner(System.in);

        System.out.println("kan bağışı uygunluk testi : ");

        System.out.println("lütfn yaşınızı giriniz:");
        int yas = sc.nextInt();

        /*System.out.println("lütfn kilonuzu kg cinsinden giriniz:");
        double kg = sc.nextDouble();*/

        if (yas >= 18) {
            System.out.println("lütfn kilonuzu kg cinsinden giriniz:");
            int kg = sc.nextInt();
            if (kg <= 50) {
                System.out.println("kan bağışı yapamazsın:");
            }else System.out.println("kan bağışı yapabilirsiniz.");
        }else System.out.println("bağış yapamazsınız.");


    }


}


