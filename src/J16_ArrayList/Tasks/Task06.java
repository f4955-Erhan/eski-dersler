package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        Scanner scan =new Scanner(System.in);

        int sayilar[]=new int[6];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("lütfen "+i+". indexi giriniz");
            sayilar[i]= scan.nextInt();

        }

        atama(sayilar);
        System.out.println(atama(sayilar));
    }

    private static List<Integer> atama(int[] sayilar) {
        List<Integer>tekSayilar=new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2!=0){
                tekSayilar.add(sayilar[i]);
            }
        }
        return tekSayilar;
    }
}
