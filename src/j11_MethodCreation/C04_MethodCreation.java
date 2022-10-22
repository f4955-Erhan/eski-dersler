package j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

       String name ="haluk";
       C04_MethodDepo.gecmeNotu(25); //depo Clastan çağırdık orada main yok burada main var ve çalıştı.

        /*
        farklı class tan method call etmek için
        1. method Static olmalı
        2.ClasName.methodName() şeklinde call edilir.
         */
        selamVer();
    }

    private static void selamVer() {

        System.out.println("selam");


    }
}
