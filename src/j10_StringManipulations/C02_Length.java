package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        /*
        length metodu girilen stringin uzunluğunu : içinde bulunan karakter sayısını return eder.
        bütün karakterleri sayıp adedini verir. boşluk (" ") ta bir karakterdir.
         */

        String str = "madem gldin dünyaya otur çalış javaya";
        int strKrktrSayisi = str.length(); // int type bir data verir.

        System.out.println(str);
        System.out.println(strKrktrSayisi);
        System.out.println(str.length());

        String str1 = "";
        System.out.println(str1.length());//0

        String str2 =" ";
        System.out.println(str2.length());//1

        String str3= null;
        System.out.println(str3.length());//run time eror(RTE)

        str2.concat(str3);
        /*
        null case sensitive bir değerdir yani NULL veya null yazılamaz.bir değeri yoktur.
        hiçliği gösterir bir pointer(giriş işaretçi) dır.
         */

        //String name;
        //name.concat(str1); ***atanmayan değer birleşmez.





    }
}
