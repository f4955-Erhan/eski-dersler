package Home_Work.Project03;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Options options = new Options();
        Urun urun = new Urun();

        System.out.println("lütfen para girişi yapınız : ");
        double accountBalance = scan.nextDouble();

        options.select(accountBalance,urun);

    }
}
