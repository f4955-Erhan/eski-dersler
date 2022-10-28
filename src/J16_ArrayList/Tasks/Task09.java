package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        int karelerTop = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            karelerTop += sayilar.get(i) * sayilar.get(i);
        }
        System.out.println(karelerTop);
    }
}

