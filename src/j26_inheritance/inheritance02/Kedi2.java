package j26_inheritance.inheritance02;



public class Kedi2 extends Mammal2 {//mammal parent class ın child ı
/*
child class obje olmden parent class variable ve method lara ulaşabilir
 */

    public Kedi2() { //p.siz constructor
        super(); //p.siz
        System.out.println("kedi p.siz constructor");
    }

    public Kedi2(String str) { //p.siz constructor
        this();
        System.out.println(super.c);
        System.out.println("kedi p.siz constructor");
    }

    int c=2;
    int d=5;

    @Override
    public void mC() {// Mamal parent den ezen method
        System.out.println("mC -> kedi clastan call edildi");
    }
}
