package j15_Arrays.odev;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        String meyveler[]={"Apple" , "Orange" , "Banana" , "Pineapple"};
        boolean varMı=false;
        for (int i = 0; i < meyveler.length; i++) {

            if (meyveler[i]=="Banana"){

                varMı=true;
            }
        }
        System.out.println(varMı);

    }
}
