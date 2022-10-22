package j12_Loops.L01_forloop.TasksWork;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.

        for (int i = 0; i <= 100; i += 2) {

            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("ikinci yöntem");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

    }
}
