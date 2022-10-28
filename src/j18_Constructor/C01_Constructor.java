package j18_Constructor;

public class C01_Constructor {
    /*
        1-constructor ismi clas name ile aynı olmalı.Buyuk harf ile başlamalı
        2-constructor create edilfiğinde name den sonra (){} mutlaka kullanılmalı
        3- eğer paametreli constructor create edilfiğinde java default constructor u ezer(siler)
        4-constructor un return typ ı olmaz method dan ayıran özelliğidir.
        5-Class oluştuğunda java default constructor kendi create eder.
         */

    String str ;//intans veriable null
    String selam="güzel insan";

    public static void main(String[] args) {

        C01_Constructor obj1 =new C01_Constructor();
        C01_Constructor obj2 =new C01_Constructor();
        C01_Constructor obj3 =new C01_Constructor();
        C01_Constructor obj4 =new C01_Constructor();


        obj1.str="javacan";//str ins veriable obj1 ile call edilerek javacan değeri atandı.
        obj2.str="javatar";//str ins veriable obj2 ile call edilerek javatar değeri atandı.
        System.out.println(obj3.selam);//"güzel insan"

        System.out.println(obj1.str);//javacan
        System.out.println(obj2.str);//javatar

        System.out.println("obj4 = " + obj4.str);//null
        obj3.aga();
    }

    public void aga(){

        System.out.println("agaya beleş");


    }
}
