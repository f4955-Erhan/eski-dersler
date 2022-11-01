package j25_Encapsulation.Encapsulation03;

public class Runner {
    public static void main(String[] args) {


        Arac Audi = new Arac("Q5", "kırmızı", -200, 2018);

        Arac Bmw = new Arac("X5", "siyah", 3000, 2018);

        Arac bugaddi = new Arac();

        bugaddi.setModel("Xc23");
        bugaddi.setMotor(-200);
        bugaddi.setRenk("maviş");
        bugaddi.setYil(-2023);



        System.out.println("Audi = " + Audi);
        System.out.println("Bmw = " + Bmw);
        System.out.println("bugaddi = " + bugaddi);


    }

}
