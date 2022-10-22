package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task13_Nested {
    public static void main(String[] args) {
       
        //girilen bir ifadenin istenen harf sayısını print eden code create ediniz.


        Scanner scan =new Scanner(System.in);

        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
         */
        int harf =65;

        for (int i = 0; i <6; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print((char)(harf+i)+" ");

            }
            System.out.println();
        }


        

    }
}
