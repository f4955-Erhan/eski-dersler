package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSalyangoz {
    public static void main(String[] args) {
        /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */


        int arr[][] = {
                {3, 2, 9}, {4, -1, 15}, {8, 4, -6} //0. kat
                //2. kat
        };//3 katlı apt

        int büyük[] = {};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (büyük[0] < arr[i][j]) {

                    büyük[0] = arr[i][j];

                }

            }


        }
        System.out.println(Arrays.toString(büyük));
    }
}

