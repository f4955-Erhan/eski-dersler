package j18_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {


        C07_Ogretmen hoca1=new C07_Ogretmen("erhan",11);
        System.out.println("hoca1.name = " + hoca1.name);
        System.out.println("hoca1.kıdem = " + hoca1.kıdem);
        hoca1.kıdemHesaplama(13);
    }
}
