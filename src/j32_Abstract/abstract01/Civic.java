package j32_Abstract.Abstract01;

public class Civic extends Honda{//honda parent abstract class extends child concrete class

    /*
    extends Honda yazılarak Honda class a concrete bir civic class tanımlandı java cte verdi

    çözüm:
    a) implement ile methodlar getirilebilir
    b)parent Honda class abstract kaldırılabilir
    c) concarete olan child civic class abstract tanımlanmalı

     */
  //  public abstract void absMethod(); ya class abs olmalı yada method concrete(somut) method olmalı
    // child comcrete class parent abs classtan abs methodları mutlaka implemen yapılmalı


    @Override
    public void motor() {
        System.out.println("1.6 motor");
    }

    @Override
    void koltuk() {
        System.out.println("5 kişilik");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı");
    }

    public int vites(){

        return 5;
    }

 //   Civic obj= new Civic();
 //   Honda obj2= new Civic(); // poliformizm

}
