package j32_Abstract.Abstract02.Örnek02;

public class Dikdörtgen extends Sekil {

    private double kısaKenar;
    private double uzunKenar;

    public Dikdörtgen(double kısaKenar, double uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {
        return this.kısaKenar * this.uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return this.kısaKenar * 2 + this.uzunKenar * 2;
    }



}
