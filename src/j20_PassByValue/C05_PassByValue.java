package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        double etiketFiyatı=100;
        double indirimOranı=0.10;
        /*
        değişiklik yapılan veriable lar atama tanımlanır.
         */
        System.out.println(etiketFiyatı);//100

        indirim(etiketFiyatı,indirimOranı);//90 method call edildi

        etiketFiyatı=indirim(etiketFiyatı, indirimOranı);//etiketFiyatı yeni değer atandı 90

        System.out.println(etiketFiyatı);// atanan değer çıktıya düştü 90


    }

    public static double indirim(double etiketFiyatı, double indirimOranı) {

        etiketFiyatı*=(1-indirimOranı);

        System.out.println("etiketFiyatı = " + etiketFiyatı);

        return etiketFiyatı;

    }
}


