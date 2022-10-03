package j04_AritmeticOPerators;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

        System.out.println("*****Artırma******");

        int a=7;
        System.out.println(++a);// 8 çıktı değeri 8
        System.out.println(a++);// 8 çıktı değeri 9
        System.out.println(a);// 9
        System.out.println(a++ + ++a);// 9 yazdırır değeri 10 yapar sonra 10 u 1 artırır 11 yazdırır: 9 + 11 =20


        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k; //6+6+7+7+7+6
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);

    }
}
