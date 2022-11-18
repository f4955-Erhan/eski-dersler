package j32_Abstract.Abstract01;

public class Accord extends Honda{


    @Override
    public void motor() { // zorunlu ımplement method
        System.out.println("1.8 motor");
    }

    @Override
    void koltuk() {// zorunlu ımplement method
        System.out.println("5 kişilik");
    }

    @Override
    void kapı() {// zorunlu ımplement method
        System.out.println("5 kapılı");
    }

    @Override
    void sunroof() {// concrete zorunlu olmayan method istersek yazarız istemezsek yazmayız
        System.out.println("iyisen ağa");
    }
}
