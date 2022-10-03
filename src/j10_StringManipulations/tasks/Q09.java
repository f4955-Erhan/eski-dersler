package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir kelime giriniz. : ");
        String kelime = scan.nextLine();

        int krktrsayi = kelime.length();


        String ilkyari = (krktrsayi % 2 == 0) ? (kelime.substring(0, kelime.length() / 2)) : ("tek sayı olduğu için yarısı yoktur!!!");


        System.out.println("kelimenin ilk yarısı = " + " " + ilkyari);

    }
}

