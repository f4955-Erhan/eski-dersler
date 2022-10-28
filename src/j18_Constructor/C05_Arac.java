package j18_Constructor;

public class C05_Arac {
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
   Aksi takdirde Compile Time Error alirsiniz.
           2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
   birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
           */
    int maxHız;
    String model;


    public C05_Arac(int maxHız) {//tek parametre

            this(180, "hacıMurat"); // 2 li parametreye gider orada işleme devam eder


             this.maxHız = maxHız;//210 tekrar atadı


    }

    public C05_Arac(int mazHız ,String model) {// iki parametreli
        this.maxHız = mazHız;
        this.model = model;
    }


}
