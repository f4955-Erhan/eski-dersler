package j08_ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        /*
        TASK ->kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000 den fazla ise emekliliğini 
        kullanıcının cinsiyeti erkek ise 65 yaşından büyük ve prim günü 7000 den fazla ise emekliliğini kontrol edip
         kaln yıl ve prim gününü prit ediniz.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("cinsiyet giriniz kadın için 'K', erkek 'E' giriniz:");
        char cinsiyet = scan.next().charAt(0);

        System.out.print("yaşınızı giriniz:");
        int yas = scan.nextInt();

        if (cinsiyet == 'K') {
            if (yas > 60) {
                System.out.println("prim günü giriniz:");
                int prim = scan.nextInt();
                System.out.println("emekliliğe hak kazandınız");
                if (prim > 6000) {
                    System.out.println("emekliliğe hak kazandınız");
                } else System.out.println("emekliliğinize=" + " " + (6000 - prim) + " " + "günü kaldı.");
            } else System.out.println("emeklilik yaşınıza" + (60 - yas) + "yıl var");

        } else if (cinsiyet == 'E') {
            if (yas > 65) {
                System.out.println("prim günü giriniz:");
                int prim = scan.nextInt();
                if (prim > 7000) {
                    System.out.println("emekliliğe hak kazandınız");
                } else System.out.println("emekliliğinize=" + " " + (7000 - prim) + " " + "gün kaldı.");
            } else System.out.println("emeklilik yaşınıza" + (65 - yas) + "yıl var");

        }
        else System.out.println("doğru düzgün giriş yap.");

    }


}

