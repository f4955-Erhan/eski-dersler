package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {

        int sayi=33;// tek bir data saklayabilen primitive veriable

        int sayi1[]=new int[5];// 5 int değer saklayabilen  yapı

        int sayi2[][]=new int[5][6];// 5*6 30 int değer saklayabilen  yapı

        ArrayList<Integer>sayilar=new ArrayList<>();// istenildiği kadar int değer saklar...

/*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Integer wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.

    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
        ArrayList<Integer>ListSayi=new ArrayList<>();//boş integer typ list oluştu

        //1. yol add metodu

        ListSayi.add(11);// list e ilk eleman olarak atandı

        System.out.println(ListSayi);

        ListSayi.add(55);
        ListSayi.add(25);
        ListSayi.add(16);
        ListSayi.add(11);
        ListSayi.add(11);// list eleman tekrarını kabul eder.

        System.out.println(ListSayi);

        //2. yol Arrays.asList(); metodu

        ArrayList<String>metin=new ArrayList<>(Arrays.asList("erhan","kemal","cemal","zalım"));
        System.out.println(metin);

        //3.yol list.of() methodu

        ArrayList<String>kelime=new ArrayList<>(List.of("merhaba","güzel","sukunet"));

        ListSayi.add(2,14);// 2. index e 14 yazdırdık silinen olmadı 2 itibariyle 1 sonraki index e kaydı.

        System.out.println(ListSayi);

    }
}
