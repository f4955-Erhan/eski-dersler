package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. not : ");
        double not1 = scan.nextDouble();

        System.out.println("2. not : ");
        double not2 = scan.nextDouble();

        System.out.println("3. not : ");
        double not3 = scan.nextDouble();


        System.out.println(ortalamaAl(not1, not2, not3));

    }

    private static double ortalamaAl(double a,double b,double c) {

        return (a+b+c)/3;
        
    }


}



