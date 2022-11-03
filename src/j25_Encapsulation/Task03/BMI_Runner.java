package j25_Encapsulation.Task03;

import java.util.Scanner;

public class BMI_Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz : ");
        String name = scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz : ");
        int age = scan.nextInt();
        System.out.println("lütfen ağırlık kg giriniz : ");
        double weight = scan.nextDouble();
        System.out.println("lütfen boyunuzu cm giriniz : ");
        double height = scan.nextDouble();


BMI obj = new BMI(name, age,weight,height);

        System.out.println(obj);
        obj.getStatus();


    }
}
