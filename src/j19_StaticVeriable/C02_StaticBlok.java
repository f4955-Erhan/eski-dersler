package j19_StaticVeriable;

public class C02_StaticBlok {

        /*
        1:static blok yapıları static variableları değer ataması update için kullanılır

        2:static blok  CLass oluşturuluduğunda butun methodlardan (main method dahi)öne çalışır

        3:birden fazla static block varsa yukarıdan aşağıya sırlama ile çalışır

         */

    static String isim;

    static {
        System.out.println("aga 1. static block çalışır");
        isim="erhan beg";

        System.out.println("isim = " + isim);
    }
    public static void main(String[] args) {
        System.out.println("main method başladı");
        isim="keremettin";
        System.out.println("isim = " + isim);
    }

    static {

        System.out.println("2. static yapı");
        isim="nizemettin";
        System.out.println("isim = " + isim);
    }

}
