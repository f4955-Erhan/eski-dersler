package J16_ArrayList;

import java.util.Scanner;

public class TaskNotOrtalama {
    public static void main(String[] args) {

         /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("öğenci sayısını giriniz : ");
       
        double not[]=new double[scan.nextInt()];
        double puanToplam=0;
        
        for (int i = 0; i < not.length; i++) {
            System.out.println(i+". öğrenci notunu giriniz : ");
            not[i]= scan.nextDouble();
            puanToplam+=not[i];
        }
        double ortalama=puanToplam/not.length;

        int ortÜstÖğrenci=0;

        for (int i = 0; i < not.length; i++) {

            if (not[i]>ortalama){

                ortÜstÖğrenci++;
            }
        }
        System.out.println("Ortalamanın üstündeki öğrenci sayısı = "+ortÜstÖğrenci);





    }
}
