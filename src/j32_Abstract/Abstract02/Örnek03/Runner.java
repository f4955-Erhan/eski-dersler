package j32_Abstract.Abstract02.Örnek03;

public class Runner {
    public static void main(String[] args) {
        CheeseCake chck = new CheeseCake();
        chck.madeIn();
        chck.Taste();

        Baklava bklv = new Baklava();
        bklv.madeIn();
        bklv.Taste();

        SezarSalat szrslt = new SezarSalat();
        szrslt.Taste();
        szrslt.madeIn();


        GreekSalat grkslt = new GreekSalat();
        grkslt.madeIn();
        grkslt.Taste();
    }


}
