package j12_Loops.L01_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 41; i++) {

            System.out.println(i + "maaşallah");

        }
        // 2 basamaklı tek sayıları print eden kod

        for (int i = 11; i <= 99; i += 2) {

            System.out.print(i + " ");

        }
        System.out.println("*********");

        for (int i = 10; i < 100; i++) {

            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

        }


    }
}
