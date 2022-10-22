package j14_Scope;

public class C03_Scope {

    public static void main(String[] args) {

        C01_İnstanceVeriable kus=new C01_İnstanceVeriable();
        kus.name="angut";
        kus.developerMı=false;

        C01_İnstanceVeriable.staticMethod(); //class name ile static metod gelir

        kus.non_StaticMethod(); // statik değilse objeyle gelir.

    }
}
