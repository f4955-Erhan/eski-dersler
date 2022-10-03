package j02_Datatypes_WrapperClass;

public class C04_Concatenation {

    public static void main(String[] args) {

        String ad= "Erhan";
        String soyad= "Yıldız";

        int a=7;
        int b=11;
        //birden çok string ve veriable ile farklı data type veriable lar + ile işleme alınırsa java birleştirme yaparak
        //yeni bir string oluşturur,

        System.out.println(ad+soyad+a+b);
        System.out.println(b+ad+soyad+a);
        System.out.println(a+b+ad+soyad);
        System.out.println("  "+a+b);
        System.out.println(ad+soyad+(a+b));
        System.out.println((a+b)+ad+soyad);
        System.out.println(ad+((a-b)+(a-b)));


        char ch='1'; //ASCII değeri 49 tam sayı değeri, aritmetik işlemde tam sayı değeri alır,
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.

    }
}
