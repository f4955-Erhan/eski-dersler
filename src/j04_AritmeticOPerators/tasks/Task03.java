package j04_AritmeticOPerators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		System.out.println("üç basamaklı bir sayı giriniz");
		int a= scan.nextInt();
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */



		System.out.println(a+" "+"sayısının ilk ve son rakamları toplamı="+" "+((a/100)+(a%10)));

	}

}
