package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

        String str = "Good";

        System.out.println("ilk görülen o nun index değeri =" + str.indexOf('o'));
        System.out.println("ilk görülen d nin index değeri =" + str.indexOf("d"));


        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */


        String kelime = "Good of scholl";


        System.out.println(kelime.lastIndexOf("of"));
        kelime.indexOf('s');


        // girilen cümlenin aşağıdaki durumları sağlayacak code create edin .
        // 1-Girilen cumle java icermiyor
        // 2-Girilen cumle 1 tane java iceriyor
        // 3-Girilen cumlede birden fazla java var

        System.out.println("lütfen içinde java bulunan cümle kurunuz : ");
        String cumle = scan.nextLine().toLowerCase();

        if (cumle.contains("java") != true) {
            System.out.println("girilen cümle java içermiyor");

        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java")) {
            System.out.println("java bir adet yazmaktadır");

        } else {
            System.out.println("iki ve üstü java yazmakta");

        }

    }


}
