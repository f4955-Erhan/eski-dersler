package j14_Scope;

public class C02_StaticVeriable {

    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir
 */

    static String firmaName = "Clarusway";
    static int firmaID;
    static boolean firmaIT;

    public static void main(String[] args) {

        System.out.println(firmaIT);

        firmaName = "erhan";//static veriable call edildi ve değer atandı.
        staticMetod();
       // NonStaticMethod();// gelmez çünkü static değil ama buraya static değerler gider.
    }

    public static void staticMetod() {
        firmaName = "erhan 1";

        System.out.println("yeni ıd hayırlı olsun " + firmaID);

    }

    public void NonStaticMethod() {

        firmaName = "javacan";
        System.out.println("agam yeni firman :" + firmaName);


    }
}
