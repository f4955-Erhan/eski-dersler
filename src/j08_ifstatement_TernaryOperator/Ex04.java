package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        /*
        TASK -> girilen karakterin harf olup olmadığını kontrol eden bbir kod kreate ediniz.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("bir karakter giriniz:");
        char krktr = scan.nextLine().charAt(0);

        if ((krktr>='A'&& krktr<='Z')||(krktr>='a'&& krktr<='z')) {
            System.out.println("girdiğiniz karakter harftir.");
        }else System.out.println("girdiğiniz karakter harf değildir");











    }
}
