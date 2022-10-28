package j19_StaticVeriable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
       C01_Ogretmen.okul="YeniClarusway";

        C01_Ogretmen hc1 = new C01_Ogretmen("cüneyt", 11);
        System.out.println("hc1.isim = " + hc1.isim);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);
        System.out.println("hc1.okul = " + hc1.okul);


        C01_Ogretmen hc2 = new C01_Ogretmen();
        System.out.println("hc2.isim = " + hc2.isim);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);
        System.out.println("hc2.okul = " + hc2.okul);



        C01_Ogretmen hc3 = new C01_Ogretmen("ziya", 9);
        System.out.println("hc3.isim = " + hc3.isim);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        System.out.println("hc3.okul = " + hc3.okul);
        hc1.evlilikYıldonumu();//obj ile nana static meth. call
        C01_Ogretmen.maasHesapla();//ClassName ile static method call
        hc2.maasHesapla();//obj ile static meth call->bad practice



    }
}
