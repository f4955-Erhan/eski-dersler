package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen çarpım tablosu için bir tam sayı giriniz : ");
		int sayi =scan.nextInt();
		for (int i = 1; i <=10 ; i++) {

				System.out.println(i+"x"+sayi+" ="+i*sayi+" ");


		}

	}

}
