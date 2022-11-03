package Home_Work.Project03;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = scan.nextDouble();
        double accountBalance = scan.nextDouble();

        Options options = new Options();
        Urun urun = new Urun();

        options.select(urun);


    }
}
