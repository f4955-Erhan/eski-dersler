package j18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km = 10;
    double motorHacim;
    boolean vitesAuto = false;
    boolean ikinciEl;
    static int yıl;



    public static void main(String[] args) {

        C02_Arac arac2 = new C02_Arac();

        arac2.yıl=13213;

        C02_Arac arac1 = new C02_Arac();//default constructor ile arac1 objesi create ettik

        arac1.ikinciEl = true;
        arac1.km = 50000;
        arac1.marka = "volvo";
        arac1.motorHacim = 2.4;
        arac1.model = "s60";
        arac1.yıl = 2017;



        System.out.println(arac1.ikinciEl + " " + arac1.yıl + " " + arac1.model + " " + arac1.motorHacim + " " + arac1.km + " " + arac1.vitesAuto);

        System.out.println(arac1);

        //ikinci bir arac ata


        arac2.vitesAuto=true;
        arac2.km=5000;
        arac2.motorHacim=1.8;
        arac2.yıl=2016;
        arac2.model="a3";
        arac2.marka="audi";
        arac2.ikinciEl=true;

        System.out.println(arac2.ikinciEl+" "+arac2.marka+" "+arac2.model+" " +arac2.km+" "+arac2.yıl+" "+arac2.motorHacim+" "+arac2.vitesAuto);


    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';

    }
}
