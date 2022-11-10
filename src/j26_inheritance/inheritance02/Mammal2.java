package j26_inheritance.inheritance02;

public class Mammal2 extends Hayvancık2 { // Hayvancık Parent classının Child Class ı

    public Mammal2(){
        this('Y');//bu classta parametreli constructor call edildi
        System.out.println("ağam bu mammal p.siz cons ");
    }

    public Mammal2(char c){
        super(17);//parent hayvancık class call edildi
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
