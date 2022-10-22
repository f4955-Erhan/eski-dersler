package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {
        // Stringi Array e çevirme

        String str ="javaCan'lara selam olsun. en kısa zmaanda bolcana offer sonrası TUZLABALIK";

        str.split(" ");

        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        String err []= str.split("");

        System.out.println(Arrays.toString(err));




    }
}
