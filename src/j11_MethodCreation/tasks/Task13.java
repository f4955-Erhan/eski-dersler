package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        Scanner scan =new Scanner(System.in);

        System.out.println("birinci kelimeyi giriniz :");
        String x= scan.next().toLowerCase().trim();

        System.out.println("ikinci kelimeyi giriniz :");
        String y=scan.next().toLowerCase().trim();

        kontrolEt(x,y);

        System.out.println(kontrolEt(x, y));

    }

    private static boolean kontrolEt(String x, String y) {

        boolean kontrol = x.endsWith(y);

        return kontrol;

    }


}
