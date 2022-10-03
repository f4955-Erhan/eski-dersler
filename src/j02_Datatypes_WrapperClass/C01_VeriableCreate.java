package j02_Datatypes_WrapperClass;

public class C01_VeriableCreate {

    public static void main(String[] args) {
        // 1.yol -> best pratice recomended tavsiye edilen
        int yas=48;
        int maas=33000;
        System.out.print("yas=");
        System.out.println(yas);
        System.out.println("maas="+maas);

        //2.yol
        int boy ; // değeri atanmayan boy isminde bir int tanımlandı declaration
        //System.out.println(boy);  değeri atanmamuş değikeni hiç bir aksiyonda kullanılmaz CTE
        boy=175;
        System.out.println("boyunuz:"+boy);

        //3.yol
        int yevmiye,yol,kilo;
        yevmiye= 100;
        yol=30;
        kilo=20 ;
        System.out.println("yol:"+yol);
        System.out.println("yevmiye:"+yevmiye);
        System.out.println("kilo:"+kilo);

    }
}
