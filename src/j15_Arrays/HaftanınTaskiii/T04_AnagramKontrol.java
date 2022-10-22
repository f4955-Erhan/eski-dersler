package j15_Arrays.HaftanınTaskiii;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

    public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("1. kelimeyi girelim : ");
        String kelime1 = scan.nextLine().trim().toLowerCase();

        System.out.println("2. kelimeyi girelim : ");
        String kelime2 = scan.nextLine().trim().toLowerCase();

        String arr1[]=kelime1.split("");
        String arr2[]=kelime2.split("");


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));


    }

}
