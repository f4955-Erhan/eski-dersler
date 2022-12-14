package j14_Scope;

public class C01_İnstanceVeriable { /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/

    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk

    public static void main(String[] args) {

        int a =7; //local variable
        System.out.println(a);
       // System.out.println(yas);// instant değer atması yapmadan işleme alınmaz. non static olduğu için çağrılamaz

        staticMethod();// Static methoda Static method call ediir.

        C01_İnstanceVeriable obje1 =new C01_İnstanceVeriable();
        obje1.name ="erhan";//yukarıdaki ataması yapılmış yapılmamış veriable lar call edilerek yeni değer atanır.
    }
    public void non_StaticMethod (){

        System.out.println("statik olmayan methoddan selemlar : ");// statik olmadığı için mainden call edilemez.
    }

    public static void staticMethod(){
        System.out.println("static methoddan selamlar :");
    }
}
