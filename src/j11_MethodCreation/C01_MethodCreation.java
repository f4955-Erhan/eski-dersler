package j11_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) { // metod açılışı
/*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
        System.out.println(topla3());
        int sayi = topla3();
        System.out.println(sayi);
        System.out.println(toplam4("erhan", 45));


        topla();           // parametresiz  return type olmayan void bir method
        System.out.println("method Call oldu beni topla metodundan sonra yazdırdı. ");
        topla2(4, 5);

    }//method kapanışı

    private static int toplam4(String str, int a) {
        System.out.println("erhan");
              return a*2;
    }

    private static int topla3() {
        int a =10;
        int b =20;


        return a+b;
    }

    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
    // Best practice-> method'lar main method'dan sonra create edilir.
    public static void topla() {//parametresiz return type ı olmayan void bir method
        int a = 33;
        int b = 23;
        System.out.println(a + b);
        System.out.println("topla metodundan selamlar : ");

              //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
              //Method parantezinin icinde olusturulan variable'lara "parametre" denir.
              //Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
              //Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli
    }

    public static void topla2(int a, int b) {  //iki int parametreli void method

        System.out.println(a + b);


    }

}// clas kapanışı
