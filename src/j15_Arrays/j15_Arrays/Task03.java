package j15_Arrays.j15_Arrays;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int a[] = {3, 4, 5, 6, 7};

        int degisim[] = new int[a.length];

        System.out.println("amaliyat öncesi = " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                degisim[a.length - 1] = a[i];

            } else
                degisim[i - 1] = a[i];

        }
        System.out.println(Arrays.toString(degisim));
    }

}
