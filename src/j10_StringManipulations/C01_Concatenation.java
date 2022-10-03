package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {


        /*
         *concat() methodu içine(parametre) aldığı string veriable ı çalıştığı stringin sonuna ekler.
         * java da + işlemi yapılırken string concat yaapr
         *
         *TRICK=string metodları veriable da geçici değişiklik yapar. atama yapılırsa(=) kalıcı olur.
         */

        String name = " erhan";
        String meslek = " Qa tester";

        name.concat(meslek);
        System.out.println(name.concat(meslek));
        System.out.println(name);

        name= meslek.concat(name);
        System.out.println("name = " + name);

        System.out.println(name.concat(100+":)"));
        System.out.println(name.concat(true+":)"));



    }
}
