package j32_Abstract.Abstract02.Örnek02;

public class Cember extends Sekil {

    private double yarıçap;
    private final double pi = 3.14;

    public Cember(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    public double getPi() {
        return pi;
    }


    @Override
    public double alanHesapla() {
        return pi * this.yarıçap * this.yarıçap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * pi * this.yarıçap * this.yarıçap;
    }


}
