package j12_Loops.L01_forloop.TasksWork;

public class Odev07 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        for (int i = 1; i <= 5; i++) {
            int satır = i;
            for (int j = 1; j <= i; j++) {

                System.out.print(satır + " ");
                satır = satır + 5 - j;


            }
            System.out.println();


        }
    }}
