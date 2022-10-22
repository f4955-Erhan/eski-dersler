package j12_Loops.L01_forloop.TasksWork;

public class Odev04 {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        //Kodu aşağıya yazınız.


        for (int i = 0; i <=100; i++) {
            int bölünebilen=0;
            if (i%4==0&&i%5==0){
                bölünebilen++;

                System.out.print(i+ " ");
            }

        }







    }
}
