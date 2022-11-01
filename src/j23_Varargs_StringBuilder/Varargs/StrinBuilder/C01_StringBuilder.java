package j23_Varargs_StringBuilder.Varargs.StrinBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

   */
    public static void main(String[] args) {
        String str = "JavaCan";

        System.out.println("method öncesi = " + str);

        strBirleş(str);
        System.out.println("method sonrası = " + str);


        // 5000 tekrarlı bir loop ile String ve StringBuilder obj run time süreleri karşılaştır.
        String str1="";
        StringBuilder sb1 = new StringBuilder("");
        LocalTime str1Time=LocalTime.now();
        System.out.println("str1Time = " + str1Time);
        for (int i = 0; i < 5000; i++) {
            str1+=i;
        }
        LocalTime str1bit=LocalTime.now();
        System.out.println("str1bit işleme süresi = " + str1bit);

        LocalTime sb1basla=LocalTime.now();
        System.out.println("sb1basla = " + sb1basla);
        for (int i = 0; i < 5000; i++) {
            sb1.append(i);
        }
        LocalTime sb1bitti=LocalTime.now();
        System.out.println("sb1bitti = " + sb1bitti);
    }

    public static void strBirleş(String str) {

        System.out.println(str + "agama selam olsun");

    }
}
