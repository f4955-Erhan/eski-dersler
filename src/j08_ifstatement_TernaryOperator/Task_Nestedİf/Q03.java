package j08_ifstatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("***********Vücut Kitlr Endeksi BMI 'VKİ' hesaplama******** ");

        System.out.print("lütfen boyunuzu m cinsinden yazınız:" + " ");
        double m = sc.nextDouble();

        System.out.print("Lütfen kilonzuu kg cinsinden yazınız: " + " ");
        double kg = sc.nextDouble();

        double BMI = kg / (m * m);

        if (BMI <= 20) {
            System.out.println("oldukça zayıfsınız!!!");
        } else if (20 < BMI && BMI <= 25) {
            System.out.println("Normal sınırlardasınz.");

        } else if (25 < BMI && BMI <= 30) {
            System.out.println("fazla kilolusunuz.");

        } else
            System.out.println("Obezsiniz.");


    }

}
