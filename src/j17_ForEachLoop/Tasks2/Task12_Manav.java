package j17_ForEachLoop.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    static List<String> manavÜrün = new ArrayList<>(Arrays.asList("elma", "armut", "muz", "çilek", "üzüm"));
    static List<Integer> manavFiyat = new ArrayList<>(Arrays.asList(10, 15, 25, 20, 13));
    static Scanner scan = new Scanner(System.in);
    static double toplamFiyat = 0;
    static double kilo = 0;


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println("manvcınız yanınızda.........");
        ürünsec();
    }

    public static void ürünsec() {
        System.out.println("ürün fiyat aşağıdaki gibidir ne arzu edersiniz : ");

        for (int i = 0; i < manavÜrün.size(); i++) {
            System.out.println(manavÜrün.get(i) + " = " + manavFiyat.get(i) + " tl ");

        }
        System.out.println("lütfen istediğiniz ürünü yazınız : ");
        String tecih = scan.next().trim().toLowerCase();

        switch (tecih) {
            case "elma":
                System.out.println("kaç kilo istersiniz : ");
                kilo = scan.nextDouble();
                toplamFiyat += kilo * manavFiyat.get(manavÜrün.indexOf("elma"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                char işlemdevam = scan.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    ürünsec();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamFiyat + " tl dir.");
                break;

            case "armut":
                System.out.println("kaç kilo istersiniz : ");
                kilo = scan.nextDouble();
                toplamFiyat += kilo * manavFiyat.get(manavÜrün.indexOf("armut"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = scan.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    ürünsec();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamFiyat + " tl dir.");
                break;

            case "muz":
                System.out.println("kaç kilo istersiniz : ");
                kilo = scan.nextDouble();
                toplamFiyat += kilo * manavFiyat.get(manavÜrün.indexOf("muz"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = scan.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    ürünsec();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamFiyat + " tl dir.");
                break;

            case "çilek":
                System.out.println("kaç kilo istersiniz : ");
                kilo = scan.nextDouble();
                toplamFiyat += kilo * manavFiyat.get(manavÜrün.indexOf("çilek"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = scan.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    ürünsec();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamFiyat + " tl dir.");
                break;

            case "üzüm":
                System.out.println("kaç kilo istersiniz : ");
                kilo = scan.nextDouble();
                toplamFiyat += kilo * manavFiyat.get(manavÜrün.indexOf("üzüm"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = scan.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    ürünsec();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamFiyat + " tl dir.");
                break;

            default:
                System.out.println("hatalı tercih!!!");
                ürünsec();
        }
    }
}

