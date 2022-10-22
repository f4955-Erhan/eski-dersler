package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz : ");
        String isim = scan.nextLine().trim().toLowerCase();
        System.out.println("lütfen soyisminizi giriniz : ");
        String soyisim = scan.nextLine().trim().toLowerCase();

        String isimYeni = isim+" "+soyisim;

        for (int i = 0; i < isimYeni.length(); i++) {

            System.out.print(isimYeni.charAt(i)+" ");


        }


    }

}
