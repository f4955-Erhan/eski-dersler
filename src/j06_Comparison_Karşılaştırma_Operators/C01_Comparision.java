package j06_Comparison_Karşılaştırma_Operators;

public class C01_Comparision {
    public static void main(String[] args) {

        /*

        ==     Esit               x == y
        !=     Esit degil         x != y
        >      buyuk              x > y
        <      kucuk              x < y
        >=     buyuk esit         x >= y
        <=     kücük esit         x <= y

         */


        int a=33;
        int b=41;

        System.out.println("a eşit mi b ye ="+(a==b));//false
        System.out.println("a eşit değil mi b ye ="+(a!=b));//true
        System.out.println("a küçük mü b den ="+(a<b));//true
        System.out.println("a büyük mü b den ="+(a>b));//false
        System.out.println("a küçük eşit mi b ye ="+(a<=b));//true
        System.out.println("a büyük eşit mi b ye ="+(a>=b));//false

        String name  = "erhan";
        String name1 = "erhan";
        System.out.println(name==name1);//true

        /*
        s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
        s3 ve s4 ise farklı nesneleri ifade eder.
        s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
        String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır.

         */



    }

}

