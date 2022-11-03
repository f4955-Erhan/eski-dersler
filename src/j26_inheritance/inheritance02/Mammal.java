package j26_inheritance.inheritance02;

public class Mammal extends Hayvancık { // Hayvancık Parent classının Child Class ı

    public Mammal(){
        this('Y');
        System.out.println("ağam bu mammal p.siz cons ");
    }

    public Mammal(char c){
        super(17);
        System.out.println("ağam bu mammal p.li cons ");

    }

    public void mC(){
        System.out.println("mC --> Mammal");

    }

    int m=1;
    int c=4;

    @Override
    public void mM() {
        System.out.println("mM --> Mamal class meth call");
    }
}
