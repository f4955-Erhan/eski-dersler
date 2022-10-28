package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("kaç adet sayı girmek istiyorsunuz : ");

        int sayiAdet = scan.nextInt();
        int toplam = 0;

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < sayiAdet; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            sayilar.add(scan.nextInt());
            toplam += sayilar.get(i);

        }
        ortalamadanBuyuk(sayilar,toplam);
        System.out.println(ortalamadanBuyuk(sayilar, toplam));
    }
    public static List<Integer> ortalamadanBuyuk(List<Integer> sayilar, int toplam) {

        int ortalama = toplam / sayilar.size();

        List<Integer> ortBuyuk = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) > ortalama) {
                ortBuyuk.add(sayilar.get(i));
            }
        }
        return ortBuyuk;
    }

}
