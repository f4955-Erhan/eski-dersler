package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fibonacci dizisi için adet giriniz : ");
        int dizi = scan.nextInt();

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i <= dizi; ++i) {
            fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
        }
        System.out.println(fibonacci);
    }
}
