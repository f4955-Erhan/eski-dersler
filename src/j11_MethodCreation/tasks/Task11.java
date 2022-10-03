package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */

        Scanner san = new Scanner(System.in);
        System.out.println("lütfen bir mesaj giriniz : ");
        String mesaj = san.nextLine().toLowerCase().trim();

        hackerDili(mesaj);

        System.out.println(hackerDili(mesaj));

    }
    private static String hackerDili(String mesaj) {
       String yeniMsj = mesaj.replaceAll("s","5").replaceAll("a","4")
                .replaceAll("e","3").replaceAll("i","1").replaceAll("o","0");

       return yeniMsj ;
    }


}