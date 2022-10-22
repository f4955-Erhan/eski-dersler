package j12_Loops.L01_forloop.TasksWork;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		Scanner scan  =new Scanner(System.in);

		System.out.println("içerisinde istediğiniz ifadeyi kllandığınız bir cümle yahut kelime giriniz : ");
		String cümle= scan.nextLine().trim().toLowerCase();

		rakamHesapla(cümle);

		System.out.println("girilen cümlede bulunan toplam rakam sayısı : "+rakamHesapla(cümle));
	}
	private static int rakamHesapla(String cümle) {
		int rakam =0;
		for (int i = 0; i <cümle.length(); i++) {
			if (cümle.charAt(i)>=48 && cümle.charAt(i)<=57){
				rakam++;
			}
		}
		return rakam;
	}


}

