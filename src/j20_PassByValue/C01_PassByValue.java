package j20_PassByValue;

public class C01_PassByValue {
    /*
    java pass by value bir programlama dilidir.
    bir primitive veriable argüment bir methoda call edildiğinde veriable değil bir copy clone (vesikalık)(pointer)değeri
    gönderilir.
     */

    //task-> verilen fiyat için %24 artırılmış fiyatı print eden code create ediniz.
    public static void main(String[] args) {

        double fiyat=100;

        System.out.println("işlem öncesi fiyat " + fiyat);//100


        fiyatArtır(fiyat);//124

        System.out.println(fiyat);//100

    }

    public static void fiyatArtır(double fiyat) {
        fiyat*=1.24;
        System.out.println("zamlı fiyat : " + fiyat);
    }


}
