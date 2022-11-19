package j32_Abstract.Ornek1;

// abstract anahtar kelimesi ile abstract class oluşturmuş oluyoruz.

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    // implemente edilmek zorunda.

    public abstract String getMarka();

    public String getVitesAded() {
        return null;
    }

    // ister override yapılabilir,
    // istenirse yapılmayabilir.

    public int getUretimYili() {
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi(int vitesAdedi) {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        if (vitesAdedi < 0) {
            this.vitesAdedi = -vitesAdedi;
        }else this.vitesAdedi = vitesAdedi;

    }
}
