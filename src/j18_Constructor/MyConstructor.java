package j18_Constructor;

public class MyConstructor {

    int x=3;
    int y=5;

    public MyConstructor() {
        x+=1;
        System.out.println("-x"+x);
    }
    public MyConstructor(int i ){
       this();
        this.y = i;
        x+=y;
        System.out.println("-x"+x);
    }
    public MyConstructor(int i, int i2) {
        this(3);//tek parametreli cons call edildi *2*
        this.x -= 4;
        System.out.println("-x"+x);
    }
    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);// iki parametreli cons call edildi *1*
    }

}
