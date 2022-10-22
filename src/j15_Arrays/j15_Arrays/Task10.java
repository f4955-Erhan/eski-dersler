package j15_Arrays.j15_Arrays;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int changeSign []= {1,2,-3,4,-5,-6};

        for (int i = 0; i < 6; i++) {

            if (changeSign[i]<0){
                changeSign[i]*=-1;
            }
        }
        System.out.println(Arrays.toString(changeSign));
    }


}
