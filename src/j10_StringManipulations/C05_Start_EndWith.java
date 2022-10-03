package j10_StringManipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        sehir.startsWith("a", 3);// true ----3. index itibariyle string a ile mi başlar


        System.out.println(sehir.endsWith("l"));
        System.out.println(sehir.endsWith("ul"));
        System.out.println(sehir.endsWith("bu"));//false

        String str = "bul";
        System.out.println(sehir.endsWith(str));


    }
}
