package j26_inheritance.inheritance02;

public class Hayvancık2 { //grandparent super class
    public Hayvancık2() {//parametresiz constructor
        System.out.println("hayvancık parametresiz constructor");
    }
    public Hayvancık2(int i) {//parametreli constructor

        System.out.println("hayvancık parametresiz constructor");
    }
    public void mA() {
        System.out.println("mA  - > HAYVANCIK class Method Call");
    }
    public void mM() {
        System.out.println("mM  - > HAYVANCIK class Method Call");
    }
    int a;
    int m = 3;
}
