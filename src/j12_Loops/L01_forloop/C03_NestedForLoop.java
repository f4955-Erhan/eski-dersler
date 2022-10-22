package j12_Loops.L01_forloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
       eğer bir döngünün badisinde başka bir döngü varsa buna nested loop denir (iç içe döngü).
       iç dmngü dış döngünün her adımında tekrar tekrar çalışır ve her çalışmasında tamamen çalışır.
         */

        for (int apt = 1; apt <= 10; apt++) {
            System.out.println("apartman döngü" + apt);
            for (int daire = 1; daire < 6; daire++) {
                System.out.println("apt" + apt + "için iç döngü daire : " + daire);

            }

        }

    }
}
