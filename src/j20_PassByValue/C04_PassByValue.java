package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyatı;
    static double indirimOranı;

    public static void main(String[] args) {

        /*
        eğer bir method da yapılan değişiklik kalıcı olsun istenirse ;
        1- değişiklik yapılan veriable lar static olarak tanımlarnır,
         */
        etiketFiyatı = 100;

        indirimOranı = 0.10;
        indir();

        indirimOranı = 0.20;
        indir();

        indirimOranı = 0.30;
        indir();


    }

    private static void indir() {
        etiketFiyatı *= (1 - indirimOranı);

        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}
