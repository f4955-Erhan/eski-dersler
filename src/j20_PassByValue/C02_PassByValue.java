package j20_PassByValue;

public class C02_PassByValue {
    static double fiyat;

    public static void main(String[] args) {
        //task-> verilen fiyat için %11 %22ve %33 indirimli fiyatı print eden code create ediniz.
        fiyat = 100;


        fiyatİndir11(fiyat);
        fiyatİndir22(fiyat);
        fiyatİndir33(fiyat);
        System.out.println("fiyatİndir11 " + fiyatİndir11(fiyat));
        System.out.println("fiyatİndir22 " + fiyatİndir22(fiyat));
        System.out.println("fiyatİndir33 " + fiyatİndir33(fiyat));
    }

    private static double fiyatİndir11(double fiyat) {

        return fiyat *= 0.89;
    }

    private static double fiyatİndir22(double fiyat) {
        return fiyat *= 0.78;
    }

    private static double fiyatİndir33(double fiyat) {
        return fiyat *= 0.67;
    }
}
