package j15_Arrays.odev;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        int sayilar[][]={{5,2,1} , {10,2,3,6} , {1,2}};

        int toplam =0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                toplam+= sayilar[i][j];
            }
        }
        System.out.println(toplam);
    }
}