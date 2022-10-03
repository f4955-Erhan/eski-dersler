package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        //task= girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code creae et.(ternary ile yap)

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz : ");
        String kelime = scan.next();

        System.out.println(cumle.contains(kelime) ? "Seçtiğiniz kelime cümlede geçiyor" : "seçtiğiniz kelime cümlede geçmiyor");






    }
}
