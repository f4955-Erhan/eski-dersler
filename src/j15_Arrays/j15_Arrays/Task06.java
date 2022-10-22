package j15_Arrays.j15_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        System.out.println("ilk hali "+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("sort edilen hali "+Arrays.toString(arr));

        int büyüktenKüçüğe[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            büyüktenKüçüğe[arr.length-1-i]=arr[i];
        }


        System.out.println("son hali"+Arrays.toString(büyüktenKüçüğe));


    }
}
