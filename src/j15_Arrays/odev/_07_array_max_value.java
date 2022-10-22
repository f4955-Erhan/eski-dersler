package j15_Arrays.odev;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        int sayilar []={12,2,5,15,8};
        int büyükSayi=0;

        for (int i = 0; i < sayilar.length; i++) {

            if (büyükSayi<sayilar[i]){

                büyükSayi=sayilar[i];
            }
        }
        System.out.println(büyükSayi);

    }
}

