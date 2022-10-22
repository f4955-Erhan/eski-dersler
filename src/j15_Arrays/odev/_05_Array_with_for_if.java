package j15_Arrays.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int sayilar[] = {5, 6, 8, 12, 14, 19};
        int toplam =0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){

                toplam+=sayilar[i];

            }else toplam-=sayilar[i];
        }
        System.out.println(toplam);

    }
}
