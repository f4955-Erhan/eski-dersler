package j26_inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        /*
			  Ayni isimli variable'lardan hangisinin kullanildi
			olusturulan object'in data type'ina göre bilinir
			Variable'i arastirmaya data type'i classindan baslanır.
			*/


        //data type
        Kedi2            k1      = new Kedi2();

        System.out.println("k1.a = " + k1.a);//hayvancık2
        System.out.println("k1.m = " + k1.m);//kedi2
        System.out.println("k1.c = " + k1.c);//kedi2
        System.out.println("k1.d = " + k1.d);//mammal2

        Mammal2 k2 = new Kedi2("a");
        Mammal2 k2a = new Kedi2();
        Hayvancık2 k3 = new Kedi2();
        Mammal2 k4 = new Mammal2();

        k1.mA();//hayvancık2 class call
        k1.mC();//Kedi2 class call
        k1.mM();//Mammal2 class call

          /*
			 Method cagirilirken ayni isimli methodlardan
			 hangisinin kullanilacagina Constructor karar verir.
			 Methodlari arastirmaya Consctuctor ismini tasiyan
			 class'dan baslayin ve parentlarda arastirmaya devam edin.
			 */

        Mammal2 k02 = new Kedi2("Kevser");//DataType-> Parent Mammal2 Class Cons->p'li Kedi Class
        System.out.println("k02.c = " + k02.c);//4
        System.out.println("k02.a = " + k02.a);//0
        System.out.println("k02.m = " + k02.m);//1
        //k2.d->CTE k2 obj Data type Mammal Class d variable yok call edilemezzzz
        k02.mA();// mA - > HAYVANCIK  class meth call.
        k02.mC();//mC - > Kedi  class meth call.
        k02.mM();// mM - > Mammal  class meth call.

        Hayvancık2 k03 = new Kedi2();
        System.out.println("k3.m = " + k03.m);//3
        System.out.println("k3.a = " + k03.a);//0
        //   k03.c-> Datatype Hayvancık Class oldg için Class'da olmayan c variable call edilemezz
        k03.mA();// mA - > HAYVANCIK  class meth call.
        k03.mM();// mM - > Mammal  class meth call.

        Mammal2 m1=new Mammal2('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
        // m1.d-> parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.mA();//Hayvancık Class call
        m1.mC();//Mammal Class call
        m1.mM();//Mammal Class call


        //veriable datatype a göre çalışır method constructor a göre call edilir


    }
}
