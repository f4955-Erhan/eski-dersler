package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task11_Nested {
    public static void main(String[] args) {
       
        //girilen bir ifadenin istenen harf sayısını print eden code create ediniz.


        Scanner scan =new Scanner(System.in);

        int harf =65;


        for (int i = 0; i <6; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print((char)(harf+j)+" ");
            }
            System.out.println();
        }


        

    }
}
