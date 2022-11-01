package j23_Varargs_StringBuilder.Varargs.StrinBuilder;

public class C02_StringBuilder {

    public static void main(String[] args) {
        //StringBuilder create etme
        //1.yol
        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value si olmayan değer atanmamış.

        System.out.println("sb1.length() = " + sb1.length());//boştur 0 return eder
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("Javatar"); // eleman ekler
        System.out.println("sb1 = " + sb1);

        sb1.append("=").append(" ").append("23").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//kapasitesini gösterir

        System.out.println("sb1.indexOf(\"23\") = " + sb1.indexOf("23"));// aranan elemanın indexi

       //  System.out.println("sb1.reverse() = " + sb1.reverse());//ters sıralama

        //2. yol

        StringBuilder sb2 = new StringBuilder("erhan agaya selamlar");
        //ilk değer ataması yapılan value si olan stringbulilder obj

        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //trim()--> fazla atanan capacity sielr

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("trim ile sb2.capacity() = " + sb2.capacity());

        //3.yol

        StringBuilder sb3 = new StringBuilder(11);

        System.out.println("sb3.length() = " + sb3.length()); // karakter sayısı 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // kapasitesi 11 dir
        sb3.append("Javatar"); // eleman ekler
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //istenen bir karakter indexle getirtme

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        // istenen bir aralıkta karkterleri alma
        System.out.println("sb1.subSequence(0,4) = " + sb1.subSequence(0, 4)); //sb1= javatarlara selam....

        System.out.println("sb1.substring(0,4) = " + sb1.substring(0, 4));//sb1= javatarlara selam....

        // belirli bir index te karakter silmek

        System.out.println("sb1.deleteCharAt(0) = " + sb1.deleteCharAt(0));//sb1 den 0. karakter silindi

        System.out.println("sb1.delete(0,4) = " + sb1.delete(0, 4)); // sb1 den 0 dan 4 e kadar karakter silindi

        // istenen karakter veya karaterleri eklemek
        String a="merhaba";
        System.out.println("sb3.insert(0,\":)\") = " + sb3.insert(0, ":)"));

        System.out.println("sb3.insert(sb3.length(),a) = " + sb3.insert(sb3.length(), a));// sonuna veriable ekledik

        System.out.println("sb3.insert(0, a,0,4) = " + sb3.insert(0, a, 0, 4));
        // 0. indexe veriable ın 0. karakterinden 4. karkterine kadar olan kısmı al ve yaz


        //istenen index karakteri değiştirme
        StringBuilder sb4= new StringBuilder("erhan Yıldız");
        sb4.setCharAt(3,'e');
        System.out.println("sb4 = " + sb4);//erhen Yıldız

        sb4.setCharAt(sb4.indexOf(" "),'-');
        System.out.println("sb4 = " + sb4);

        // istenen indexe karakter yerine istebilen uzunlukta karakter ekleme
        System.out.println("sb4.replace(0,3,\"replace\") = " + sb4.replace(0, 3, "replace"));
        //erhen yazısına erh yi sildi yerine replace yazdı

        // Sb obj sini strig e çevirme (StrinBuilder da olmayan böylece string methodlar gelecek.)
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());

        //String ile StringBuilder karsilastirmasi


        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

       StringBuilder sb5= new StringBuilder("erhan");
       StringBuilder sb6= new StringBuilder("erhan");
       String str1="erhan";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));

        System.out.println("sb5.compareTo(new StringBuilder(str1)) = " + sb5.compareTo(new StringBuilder(str1)));

        // sb5.compareTo(str1) cte verir elma armut

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));// sb da equals == gibi hem value hem referans değerine bakar. False

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));// true

    }
}
