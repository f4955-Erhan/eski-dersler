package j12_Loops.L01_forloop.Tasks;

public class Task6_Nested {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.println("çarpım tablosu "+i+" için");
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+"x"+j+"="+(i*j));

            }

        }


    }
}
