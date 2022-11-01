package j25_Encapsulation.Encapsulation02;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        Kisi obj1 = new Kisi("Erhan", "Yıldız", 30, "E34R");

        System.out.println("obj1.name = " + obj1.name);
        obj1.name = "QA Erhan";
        System.out.println("obj1.name = " + obj1.name);

        System.out.println("obj1.surname = " + obj1.surname);
        obj1.setYas(-32);
        System.out.println("obj1.getYas() = " + obj1.getYas());

        System.out.println("obj1.getClass() = " + obj1.getSurname());




    }
}
